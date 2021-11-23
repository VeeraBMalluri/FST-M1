dict1 = {'apple':20, 'orange':10, 'mango': 25}
fruit = input("Enter the fruit name : ").lower()
for x in dict1:
    if x == fruit:
        print("Fruit is available and Price is ", dict1[x])
        break
else:
    print("Fruit is not available")

'''
---solution Provided ----

fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}
key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
    
'''