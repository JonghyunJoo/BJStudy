N = int(input())
nums = [list(map(int, input().split())) for _ in range(N)]

dp = [[0] * N for _ in range(N)]

dp[0][0] = nums[0][0]

for i in range(1, N):
    for j in range(i + 1):
        if j == 0:
            dp[i][j] = nums[i][j] + dp[i - 1][j]
        elif j == i:
            dp[i][j] = nums[i][j] + dp[i - 1][j - 1]
        else:
            dp[i][j] = nums[i][j] + max(dp[i - 1][j - 1], dp[i - 1][j])

print(max(dp[N - 1]))
