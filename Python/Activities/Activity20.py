import pandas as pd
from pandas import read_excel

df = read_excel("activity19.xlsx","sheet1")

print(df.shape)

print ("Total Rows : ",len(df.index), "Total Columns : ", len(df.columns))

print(df['Email'])

print(df.sort_values("FirstName"))