S = int(input())

sum = 0
N = 0
while True:
    N = N + 1
    sum = sum + N
    if sum == S:
        break
    elif sum > S:
        N = N - 1
        break

print(N)
