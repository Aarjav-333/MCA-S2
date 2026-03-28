from pymongo import MongoClient

conn = MongoClient("mongodb://localhost:27017/")

db = conn["test"]
col = db["StudentDetails"]

print("All Records:")
for doc in col.find():
    print(doc)

print("\nSingle Record:")
one_doc = col.find_one()
print(one_doc)



print("Where condition & project")
print(col.find_one({"roll_no": 3}, {"name": 1, "_id": 0}))
# print(col.find_one({"roll_no": 3}, {"name": 1}))




print("All names")
for doc in col.find({}, {"name": 1, "_id": 0}):
    print(doc["name"])
    
    
print("All names Sorted - (Descending)")
for doc in col.find({}, {"name": 1,"marks" : 1, "_id": 0}).sort("name", -1):
    print(doc["name"])
    
    
    
    
    
# col.update_one({"roll_no": 1}, {"$set": {"marks": 90}})
# col.update_one({"roll_no": 2}, {"$set": {"marks": 85}})
# col.update_one({"roll_no": 3}, {"$set": {"marks": 78}})
# col.update_one({"roll_no": 4}, {"$set": {"marks": 88}})
# col.update_one({"roll_no": 5}, {"$set": {"marks": 95}})





topper = col.find({}, {"_id": 0}).sort("marks", -1).limit(1)




print(topper)
for doc in topper:
    print("Topper:")
    print(doc)
    
    
    
    
