N, K = map(int, input().strip().split())

A = []
for i in range(N):
    worth = int(input())
    if worth > K:
        break
    else:
        A.append(worth)
A.sort(reverse=True)
cnt = 0
for worth in A:
    cnt += K // worth
    K %= worth
    if K == 0:
        break

print(cnt)
