N = int(input())

sum = 0
for _ in range(N):
    S, A = map(int, input().split())
    sum += A % S
print(sum)
