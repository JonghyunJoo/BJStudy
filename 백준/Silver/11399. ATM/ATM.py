N = int(input())

P = list(map(int, input().strip().split()))

P.sort()

temp = 0
sum = 0
for i in range(0, N):
    temp += P[i]
    sum += temp

print(sum)
