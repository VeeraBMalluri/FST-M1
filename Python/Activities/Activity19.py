import pandas as pd 
from pandas import ExcelFile
from pandas import ExcelWriter
data = {"FirstName": ["satvik","Avinash","Lahri"], 
"LastName":["Shah","Kati", "Rath"], 
"Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"], 
"PhoneNumber":["4537829158", "5892184058", "4528727830"]}

df = pd.DataFrame(data)

wt = ExcelWriter("activity19.xlsx")

df.to_excel(wt, "sheet1", index=False)

wt.save()