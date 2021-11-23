list1= []
num = int(input("Enter the no of elements are going to enter : "))
sum = 0
for i in range(num):
    x = int(input("Enter the element {} :".format(i)))
    list1.append(x)
if list1[0]==list1[-1]:
    print("True")
else:
    print("False")