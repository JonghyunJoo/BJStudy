import sys
input = sys.stdin.read

data = input().split()
N = int(data[0])
M = int(data[1])

A = [[0] * (N + 1) for _ in range(N + 1)]
prefix_sum = [[0] * (N + 1) for _ in range(N + 1)]

index = 2
for i in range(1, N + 1):
    for j in range(1, N + 1):
        A[i][j] = int(data[index])
        index += 1

        prefix_sum[i][j] = A[i][j] + prefix_sum[i-1][j] + prefix_sum[i][j-1] - prefix_sum[i-1][j-1]

result = []
for k in range(M):
    x1 = int(data[index])
    y1 = int(data[index + 1])
    x2 = int(data[index + 2])
    y2 = int(data[index + 3])
    index += 4
    
    total = prefix_sum[x2][y2] - prefix_sum[x1-1][y2] - prefix_sum[x2][y1-1] + prefix_sum[x1-1][y1-1]
    result.append(total)

sys.stdout.write('\n'.join(map(str, result)) + '\n')
