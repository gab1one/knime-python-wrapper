import pandas as pd

column_name = options['column_name']
column = input_table[column_name]

# flow_variables['warning_message'] = "Some warning"

output_table = pd.DataFrame({column_name: column}) 
