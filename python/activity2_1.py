name = input('enter your name')
age = input('enter your age')

if age.isdigit:
    age = int(age)
    year = str((2020-age)+100)
    print (name +' will be 100 years old in the year '+year)
else:
    print('invalid age')