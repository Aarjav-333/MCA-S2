import pymongo
conn = pymongo.MongoClient("mongodb://localhost:27017/")
# print(conn.list_database_names())
db = conn["test"]
# print(db.list_collection_names())
col = db["Marks"]
data = {"Roll_No": 2,"Name":"Aarjav", "Age": 22}
x = col.insert_one(data)
if x.inserted_id:
    print("Inserted")
else:
    print("Error")
    