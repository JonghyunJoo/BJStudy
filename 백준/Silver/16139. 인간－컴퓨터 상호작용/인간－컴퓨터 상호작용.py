import sys
input = sys.stdin.read
data = input().split()

S = data[0]
n = len(S)

q = int(data[1])

prefix_sum = [[0] * (n + 1) for _ in range(26)]

for i in range(n):
    char_index = ord(S[i]) - ord('a')
    for j in range(26):
        prefix_sum[j][i + 1] = prefix_sum[j][i] + (1 if j == char_index else 0)

results = []

index = 2
for _ in range(q):
    alpha = data[index]
    l = int(data[index + 1])
    r = int(data[index + 2])
    index += 3
    
    alpha_index = ord(alpha) - ord('a')
    count = prefix_sum[alpha_index][r + 1] - prefix_sum[alpha_index][l]
    results.append(str(count))

sys.stdout.write("\n".join(results) + "\n")
