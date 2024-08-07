N, M = map(int, input().strip().split())
A = list(map(int, input().strip().split()))

prefix_sum_mod = [0] * M
prefix_sum_mod[0] = 1

prefix_sum = 0
cnt = 0

for i in range(N):
    prefix_sum += A[i]
    mod_value = prefix_sum % M
    cnt += prefix_sum_mod[mod_value]
    prefix_sum_mod[mod_value] += 1

print(cnt)
