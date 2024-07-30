def bitonic_sequence(n, A):
    if n == 0:
        return 0

    increase_dp = [1] * n
    decrease_dp = [1] * n

    for i in range(1, n):
        for j in range(i):
            if A[i] > A[j]:
                increase_dp[i] = max(increase_dp[i], increase_dp[j] + 1)
    for i in range(n - 2, -1, -1):
        for j in range(n - 1, i, -1):
            if A[i] > A[j]:
                decrease_dp[i] = max(decrease_dp[i], decrease_dp[j] + 1)

    max_length = 0
    for i in range(n):
        max_length = max(max_length, increase_dp[i] + decrease_dp[i] - 1)
    return max_length


n = int(input())
A = list(map(int, input().split()))

print(bitonic_sequence(n, A))
