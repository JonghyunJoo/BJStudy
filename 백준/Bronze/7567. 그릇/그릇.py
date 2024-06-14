dishes = input()
sum = 0
for i in range(len(dishes)):
    if i == 0:
        sum += 10
    elif dishes[i] != dishes[i - 1]:
        sum += 10
    else:
        sum += 5
print(sum)
