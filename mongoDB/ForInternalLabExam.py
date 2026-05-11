from pymongo import MongoClient


conn = MongoClient("mongodb://localhost:27017/", serverSelectionTimeoutMS=5000)
conn_res = conn.admin.command("ping")
print(conn_res)

db = conn["Student"]["Details"]




data = [
  {
    "sensor_id": "DHT11_01",
    "timestamp": { "$date": "2023-10-27T10:00:00Z" },
    "reading": {
      "temperature": 22.5,
      "humidity": 45
    }
  },
  {
    "sensor_id": "DHT11_01",
    "timestamp": { "$date": "2023-10-27T10:05:00Z" },
    "reading": {
      "temperature": 22.7,
      "humidity": 44
    }
  }
]



result = db.insert_many(data)
if result :
    print("Data INSERTED!!\n", result.inserted_ids)
else:
    print("FAILED TO INSERT!!")





result_of_one = db.insert_one({
    "sensor_id": "490hdslh",
    "timestamp": { "$date": "2023-10-27T10:10:00Z" },
    "reading": {
      "temperature": 232.6,
      "humidity": 426
    }
})


if result_of_one:
    print("Data INSERTED SUCCESSFUlly\n,ID :", result_of_one.inserted_id)




# col.aggregate([
#     {
#         "addFields" : {
#             "total" : {"$add" : "", ""}
#         }
#     }, 
#     {
#     "merge" : "Student"   
#     }
# ])