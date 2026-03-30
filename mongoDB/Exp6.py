from pymongo import MongoClient

conn = MongoClient("mongodb://localhost:27017/")

db = conn["college"]
col = db["studlist"]

import json

# with open("test.json") as f:
#     data = json.load(f)

# col.insert_many(data)


print("1️⃣ Female MCA students (fname, lname, mark)")
for x in col.find(
    {"gender": "female", "course": "MCA"},
    {"name.fname": 1, "name.lname": 1, "mark": 1, "_id": 0}
):
    print(x)

print()
    
    
print("2️⃣ Highest mark in MCA")
result = col.find({"course": "MCA"}).sort("mark", -1).limit(1)

for x in result:
    print(x)

print()


print("3️⃣ Male students with A+ grade")
for x in col.find({"gender": "male", "grade": "A+"}):
    print(x)
    
print()



print("4️⃣ Top 3 Mechanical students")
result = col.find(
    {"course": "Mechanical"},
    {"name.fname": 1, "name.lname": 1, "mark": 1, "_id": 0}
).sort("mark", -1).limit(3)
print()

for x in result:
    print(x)

print()



print("5️⃣ Female students with mark > 90")
for x in col.find(
    {"gender": "female", "mark": {"$gt": 90}},
    {
        "name.fname": 1,
        "name.lname": 1,
        "grade": 1,
        "mark": 1,
        "phone.no": 1,
        "_id": 0
    }
):
    print(x)
    
print()



print("6️⃣ Marks between 80 and 90")
for x in col.find(
    {"mark": {"$gt": 80, "$lt": 90}}
):
    print(x)
print()




print("7️⃣ Names starting with 'V'")
for x in col.find(
    {"name.fname": {"$regex": "^V"}}
):
    print(x)
    
print()



print("8️⃣ Students from Kollam")
for x in col.find({"address.city": "Kollam"}):
    print(x)
print()
    
    
    
print("9️⃣ Not from Kollam or Thiruvananthapuram")
for x in col.find(
    {"address.city": {"$nin": ["Kollam", "Thiruvananthapuram"]}}
):
    print(x)
print()
   
   
   
print("🔟 Female students from Kollam OR Thiruvananthapuram")
for x in col.find(
    {
        "gender": "female",
        "address.city": {"$in": ["Kollam", "Thiruvananthapuram"]}
    }
):
    print(x)
    
print()

