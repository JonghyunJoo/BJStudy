M = int(input())
N = int(input())

square_nums = []
for j in range(101):
    if j * j < M:
        continue
    elif j * j > N:
        break
    else:
        square_nums.append(j * j)

if not square_nums:
    print(-1)
else:
    print(sum(square_nums))
    print(min(square_nums))
