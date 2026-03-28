import pymongo

conn = pymongo.MongoClient("mongodb://localhost:27017/")

db = conn["test"]

col = db["StudentMarks"]

students = [
    {"roll_no": 1, "name": "Aishu", "mark1": 90, "mark2": 85, "mark3": 88},
    {"roll_no": 2, "name": "Rahul", "mark1": 75, "mark2": 80, "mark3": 70},
    {"roll_no": 3, "name": "Neha", "mark1": 88, "mark2": 92, "mark3": 84},
    {"roll_no": 4, "name": "Divya", "mark1": 95, "mark2": 90, "mark3": 93},
    {"roll_no": 5, "name": "Arun", "mark1": 70, "mark2": 65, "mark3": 72}
]

for s in students:
    s["total"] = s["mark1"] + s["mark2"] + s["mark3"]

# # col.insert_many(students)

# print("Records inserted with total marks")





# for doc in col.find({}, {"_id": 0}):
#     print(doc)
    


for i, doc in enumerate(col.find({"total": {"$lt": 250}}, {"_id": 0}), start=1):
    print(doc)

print("Count:", i)
    

    
for doc in col.find(
    {"name": {"$regex": "^B"}},
    {"_id": 0, "name": 1}
):
    print(doc["name"])
    
    
print("Names starts with a letter and ends with a letterrrrrrrrrrrrrrrr")
for doc in col.find(
    {
        "name": {"$regex": "^N.*a$"},
        "total": {"$gt": 250}
    },
    {"_id": 0}
):
    print(doc)
    
col.update_one(
    {"roll_no": 1},
    {"$set": {"mark1": 195}}
)
print("Marks Updated")








for doc in col.find():
    print(doc)
    
    
    
col.delete_one({"roll_no": 1})

print("One record deleted")