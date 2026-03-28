import pymongo

# Connect to MongoDB
conn = pymongo.MongoClient("mongodb://localhost:27017/")

# Select database
db = conn["test"]

# Select collection
col = db["StudentDetails"]

# Data to insert (5 rows)
students = [
    {"roll_no": 1, "name": "Aishu"},
    {"roll_no": 2, "name": "Rahul"},
    {"roll_no": 3, "name": "Neha"},
    {"roll_no": 4, "name": "Divya"},
    {"roll_no": 5, "name": "Arun"}
]

# Insert multiple documents
result = col.insert_many(students)

# Output inserted IDs
print("Inserted IDs:", result.inserted_ids)