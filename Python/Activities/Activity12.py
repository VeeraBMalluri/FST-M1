num = int(input("Enter the number : "))
def sum(num):
    if num < 1 :
        return num
    else:
        return num+sum(num-1)
    
print (" The sum of first {} numbers is : {}".format (num, sum(num)))

