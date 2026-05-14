from pymongo import MongoClient
from pprint import pprint
conn = MongoClient("mongodb://localhost:27017/")
col = conn["MainExam"]["Student"]

data = [
    {
        "name" : {
            "first_name" : "Aarjav",
            "last_name" : "Oravakandi"
        },
        "address" : {
            "place" : "TVM",
            "country" : "India"    
        },
        "phone" : {
            "primary" : 83493402,
            "secondary" : 3485934
        }
    }
]

students = [
    {
        "roll_no": 1,
        "name": {
            "first_name": "Aishu",
            "last_name": "Menon"
        },
        "gender": "female",
        "course": "MCA",
        "mark1": 90,
        "mark2": 85,
        "mark3": 88,
        "grade": "A+",
        "address": {
            "city": "Kollam",
            "country": "India"
        },
        "phone": {
            "primary": 9876543210,
            "secondary": 9123456780
        }
    },

    {
        "roll_no": 2,
        "name": {
            "first_name": "Rahul",
            "last_name": "Nair"
        },
        "gender": "male",
        "course": "Mechanical",
        "mark1": 75,
        "mark2": 80,
        "mark3": 70,
        "grade": "B",
        "address": {
            "city": "Kochi",
            "country": "India"
        },
        "phone": {
            "primary": 9988776655,
            "secondary": 9876501234
        }
    },

    {
        "roll_no": 3,
        "name": {
            "first_name": "Neha",
            "last_name": "S"
        },
        "gender": "female",
        "course": "MCA",
        "mark1": 88,
        "mark2": 92,
        "mark3": 84,
        "grade": "A",
        "address": {
            "city": "Thiruvananthapuram",
            "country": "India"
        },
        "phone": {
            "primary": 9012345678,
            "secondary": 9567890123
        }
    },

    {
        "roll_no": 4,
        "name": {
            "first_name": "Arun",
            "last_name": "Kumar"
        },
        "gender": "male",
        "course": "CS",
        "mark1": 95,
        "mark2": 90,
        "mark3": 93,
        "grade": "A+",
        "address": {
            "city": "Thrissur",
            "country": "India"
        },
        "phone": {
            "primary": 9445566778,
            "secondary": 9001122334
        }
    },

    {
        "roll_no": 5,
        "name": {
            "first_name": "Divya",
            "last_name": "Pillai"
        },
        "gender": "female",
        "course": "Mechanical",
        "mark1": 70,
        "mark2": 65,
        "mark3": 72,
        "grade": "B",
        "address": {
            "city": "Kollam",
            "country": "India"
        },
        "phone": {
            "primary": 9898989898,
            "secondary": 9777777777
        }
    }
]

one_student = {
    
        "roll_no": 6,
        "name": {
            "first_name": "Anju",
            "last_name": "Kurian"
        },
        "gender": "female",
        "course": "CSE",
        "mark1": 70,
        "mark2": 65,
        "mark3": 72,
        "grade": "B",
        "address": {
            "city": "TVM",
            "country": "India"
        },
        "phone": {
            "primary": 9898989898,
            "secondary": 9777777777
        },
        "hobbies" : ["reading", "coding", "chess"]
    }

# res = col.insert_one(one_student)
# if res :
#     print("One student inserted", res.inserted_id)



# result = col.insert_many(students)
# if result :
#     print("Many records inserted", result.inserted_ids)



# result = col.insert_one(data)
# if (result) :
#     print("One record inserted", result.inserted_id)

# for i in col.find(
#     {}
# ):
#     total = i["mark1"] + i["mark2"] + i["mark3"]
    
#     col.update_one(
#         {"_id": i["_id"]},
#         {"$set": {"total": total}}
#     )
    
    
# for i in col.find(
#     {"course" : "MCA"},
#     {"_id" : 0}
# ):
#     pprint(i)


# for i in col.find(
#     {"mark1" : {"$gt" : 85}},
#     {"_id": 0}
# ):
#     pprint(i)


# for i in col.find(
#     {"address.city" : {"$in" : ["Kollam", "Kochi"]}},
#     {"_id" : 0}
# ):
#     pprint(i)



# for i in col.find(
#     {
#         "$or" : [
#             {"address.city" : "Kollam"},
#             {"address.city" : "Kochi"}
#         ]
#     },
#     {"_id" : 0}
# ):
#     pprint(i)
    
    


# for i in col.find(
#     {"address.city" : {"$nin" : ["Thiruvananthapuram"]}}, 
#     {"_id" : 0}
# ):
#     pprint(i)







# for i in col.find(
#     {
#         "$or" : [
#             {"grade" : "A+"},
#             {"grade" : "A"}
#         ]    
#     },
#     {"_id":0}
# ):
#     pprint(i)


# for i in col.find(
#     {"mark1": {"$gte": 70, "$lte": 90}},
#     {"_id": 0}
# ):
#     pprint(i)


# for i in col.find(
#     {"name.first_name" : {"$regex" : "^A"}},
#     {"_id": 0}
# ):
#     pprint(i)



# for i in col.find(
#     {"name.first_name" : {"$regex" : "a$", "$options" : "i"}},
#     {"_id": 0}
# ):
#     pprint(i)


# for i in col.find(
#     {"phone.primary" : {"$exists" : True}},
#     {"_id" : 0,"name.first_name" : 1, "phone.primary" : 1}
# ):
#     pprint(i)


# for i in col.find(
#   {
#       "$expr" : {
#           "$gt" : ["$mark1", "$mark2"]
#       }
#   },
#   {"_id" : 0,"name.first_name" : 1, "mark1" : 1, "mark2" : 1} 
# ):
#     pprint(i)


# for i in col.find(
#     {},
#     {"_id":0, "name.first_name":1, "total":1}
# ).sort("total", -1).limit(1):
#     pprint(i)


# for i in col.find(
#     {},
#     {"_id":0, "name.first_name":1, "total":1},
#     sort = [("total", 1)]
# ).limit(1):
#     pprint(i)


# for i in col.find(
#     {"course" : "MCA"},
#     {"_id":0, "name.first_name":1, "total":1, "course" : 1}
# ).sort("total", -1).limit(3):
#     pprint(f"{i.get('name', {}).get('first_name')}, {i.get('total')}, {i.get('course')}")


# for i in col.find(
#     {"course" : "Mechanical"},
#     {"_id":0, "name.first_name":1, "total":1, "course" : 1},
#     sort = [("total", -1)]
# ).skip(3).limit(1):
#     pprint(i)


# for i in col.find(
#     {},
#     {"_id": 0, "name.first_name": 1},
#     sort = [("name.first_name", 1)]
#     ): print(i)




# for i in col.find(
#     {},
#     {"_id": 0, "course": 1, "total" : 1},
#     sort = [("course", 1), ("total", -1)]
#     ): print(i)




# col.delete_one(
#     {
#     "name.first_name" : "Arun"    
#     }
# )

# col.delete_many(
#     {
#         "mark1" : {"$lt" : 50}
#     }
# )


# col.delete_many(
#     {
#         "course" : "Mechanical"
#     }
# )

# col.delete_many(
#     {
#         "grade" : "F"
#     }
# )

# col.delete_many({})



# for i in col.aggregate(
#     [
#         {
#             "$group" : {
#                 "_id" : None,
#                 "average_mark" : {"$avg" : "$total"}
#             }
#         }
#     ]
# ):
#     pprint(f"{i['average_mark']:.3f}")



# for i in col.aggregate(
#     [
#         {
#             "$group" : {
#                 "_id" : "$course",
#                 "average_mark" : {"$avg" : "$total"}
#             }
#         }
#     ]
# ):
#     pprint(f"{i['_id']} => {i['average_mark']:.3f}")
    # pprint(i)



# for i in col.aggregate(
#     [
#         {
#             "$group" : {
#                 "_id" : "$course",
#                 "no_of_students" : {"$sum" : 1},
#             }
#         }
#     ]
# ):
#     pprint(f"{i['_id']} => {i['no_of_students']}")




# for i in col.aggregate(
#     [
#         {
#             "$group" : {
#                 "_id" : "$course",
#                 "highest_mark" : {"$max" : "$total"},
#             }
#         }
#     ]
# ):
#     pprint(f"{i['_id']} => {i['highest_mark']}")



# for i in col.aggregate(
#     [
        
#     {
#         "$match" : {
#             "gender" : "female"
#         }    
#     },
#     {
#         "$count" : "no_of_female"
#     }
        
#     ]
# ):
#     pprint(i)



# for i in col.aggregate(
#    [
#        {
#            "$group" : {
#                "_id" : "$gender",
#                "total_count" : {"$sum" : 1}
#            }
#        }
#    ] 
# ): 
#     pprint(i)

# for i in col.aggregate(
#     [
#         {
#             "$match" : {
#                 "total" : {"$gt" : 250}
#             }
#         },
#         {"$project":{
#             "_id": 0,
#             "name.first_name": 1,
#             "total": 1
#         }}
#     ]
# ):
#     pprint(i)

# for i in col.aggregate(
#     [
#        {
#            "$sort" : {
#                "total" : -1
#                }
#         },
#        {
#            "$project" : {
#                "_id" : 0,
#                "name.first_name" : 1, 
#                "total" : 1
#            }
#        }
#     ]
# ):
#     pprint(i)



    
# for i in col.find(
#     {},
#     {"_id": 0}
# ):
#     pprint(i)
















