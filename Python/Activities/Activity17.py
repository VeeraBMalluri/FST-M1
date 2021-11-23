import pandas as pd
data = {"Usernames": ["admin", "Charles","Deku"], "Passwords": ["password", "Charl13","AllMight"]}
df = pd.DataFrame(data)
df.to_csv("activity17.csv", index=False)