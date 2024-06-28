total_price = int(input())

sum = 0
for _ in range(9):
    sum += int(input())

print(total_price - sum)
