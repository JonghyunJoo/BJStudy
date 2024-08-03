import sys
input = sys.stdin.read
data = input().split()

N = int(data[0])
M = int(data[1])
numbers = list(map(int, data[2:N+2]))
queries = data[N+2:]

prefix_sum = [0] * (N + 1)
for i in range(1, N + 1):
    prefix_sum[i] = prefix_sum[i - 1] + numbers[i - 1]

results = []
for q in range(M):
    i = int(queries[2 * q])
    j = int(queries[2 * q + 1])
    result = prefix_sum[j] - prefix_sum[i - 1]
    results.append(result)

for res in results:
    print(res)