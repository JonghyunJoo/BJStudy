def max_stair_score(stair):
    n = len(stair)

    if n == 0:
        return 0
    elif n == 1:
        return stair[0]
    elif n == 2:
        return stair[0] + stair[1]

    dp = [0] * n
    dp[0] = stair[0]
    dp[1] = stair[0] + stair[1]
    dp[2] = max(stair[2] + stair[0], stair[1] + stair[2])

    for i in range(3, n):
        dp[i] = max(stair[i] + dp[i - 2], dp[i - 3] + stair[i - 1] + stair[i])

    return dp[-1]


N = int(input())

stair = [int(input()) for _ in range(N)]

print(max_stair_score(stair))
