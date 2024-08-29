N = int(input())
k = int(input())

left = 1
right = N * N
result = 0

while left <= right:
    mid = (left + right) // 2
    count = 0
    
    for i in range(1, N + 1):
        count += min(mid // i, N)

    if count >= k:
        result = mid
        right = mid - 1
    else:
        left = mid + 1

print(result)
