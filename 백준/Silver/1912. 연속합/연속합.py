n = int(input())

sequence = list(map(int, input().split()))

part_sum = [0] * n
part_sum[0] = sequence[0]

for i in range(1, n):
    part_sum[i] = max(part_sum[i - 1] + sequence[i], sequence[i])

print(max(part_sum))
