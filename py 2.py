import pandas as pd
import numpy as np
from sklearn.preprocessing import LabelEncoder, StandardScaler, MinMaxScaler
from sklearn.model_selection import train_test_split
data = {
    'Name': ['John', 'Anna', 'Peter', 'Linda', 'James', np.nan],
    'Age': [28, 22, np.nan, 32, 45, 36],                 
    'Salary': [50000, 54000, 58000, np.nan, 62000, 60000],
    'Department': ['HR', 'IT', 'Finance', 'IT', 'Finance', 'HR']
}
df = pd.DataFrame(data)
print("Original Data set:\n", df)
df['Age'].fillna(df['Age'].mean,(),inplace=True)
df['Salary'].fillna(df['Salary'].median(),inplace=True)
df['Name'].fillna("Unknown",inplace=True)
print("\nAfter handling missing values:\n", df)
label_encoder = LabelEncoder()
df['Dept_Label'] = label_encoder.fit_transform(df['Department'])
print("\nAfter label encoding:\n", df)
d = pd.get_dummies(df, columns=['Department'])
print("\nAfter one hot encoding:\n", df_onehot)
mm_scaler = MinMaxScaler()
df[['Age', 'Salary']] = mm_scaler.fit_transform(df_scaled[['Age', 'Salary']])
std_scaler = StandardScaler()
df_scaled[['Age','salary']] = std_scaler.fit_transform(df_scaled[['Age', 'Salary']])
print("\nAfter feature scaling:\n", df_scaled)
X = df_scaled.drop(columns=['Name', 'Department'])
y = df_scaled['Dept_Label']
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)
print("\nTraining features:\n", X_train)
print("\nTesting features:\n", X_test)
print("\nTraining labels:\n", y_train)
print("\nTesting labels:\n", y_test)
