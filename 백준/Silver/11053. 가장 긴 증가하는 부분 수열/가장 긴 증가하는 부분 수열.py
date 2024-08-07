def longest_increasing_subsequence_length(n, a):

    dp = [1] * n

    for i in range(1, n):
        for j in range(i):
            if a[j] < a[i]:
                dp[i] = max(dp[i], dp[j] + 1)

    return max(dp)

n = int(input().strip())
a = list(map(int, input().strip().split()))

print(longest_increasing_subsequence_length(n, a))
