def sum (numbers):
    sum =0
    for x in numbers:
        sum += x
    return sum

list1 = [10,12,2,45,9,11]

list_sum = sum(list1)
print ("The sum of elements in list1 is : ",list_sum)