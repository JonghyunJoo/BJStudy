year = int(input())
isleap = False

if year % 4 == 0:
    if year % 400 == 0 or year % 100 != 0:
            isleap = True

print("1" if isleap else "0")
