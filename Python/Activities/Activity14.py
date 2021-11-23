def febser(num):
    if num<=1:
        return num
    else:
        return (febser(num-1)+febser(num-2))

febnum = int(input("Enter the number : "))

if febnum <0 :
    print("Enter the positive values")
else:
    for x in range(1, febnum+1):
        print (febser(x), end = "  ")