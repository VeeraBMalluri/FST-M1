'''
    Print the values only in the Usernames column
    Print the username and password of the second row
    Sort the Usernames column data in ascending order and print data
    Sort the Passwords column in descending order and print data

'''

import pandas as pd

df = pd.read_csv("activity17.csv")

print(df['Usernames'].values)

print (df.iloc[1])

print(df.sort_values("Usernames", ascending=True))

print(df.sort_values("Passwords", ascending= False))