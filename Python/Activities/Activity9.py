list1 = list(input("Enter the list1 comma separated values").split(","))
list2 = list(input("Enter the list2 comma separated values").split(","))
list3 =[]
for i in list1:
    even = int(i)%2
    if even!= 0:
        list3.append(i)
for j in list2:
    even = int(j)%2
    if even==0:
        list3.append(j)
print(list3)
