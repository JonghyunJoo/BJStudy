import sys
input = sys.stdin.read
output = sys.stdout.write

data = input().split()
idx = 0

N = int(data[idx])
M = int(data[idx + 1])
idx += 2

A = []
for i in range(N):
    A.append(list(map(int, data[idx:idx + M])))
    idx += M

M = int(data[idx])
K = int(data[idx + 1])
idx += 2

B = []
for i in range(M):
    B.append(list(map(int, data[idx:idx + K])))
    idx += K

result = [[0] * K for _ in range(N)]

for i in range(N):
    for j in range(K):
        for k in range(M):
            result[i][j] += A[i][k] * B[k][j]

for row in result:
    output(' '.join(map(str, row)) + '\n')
