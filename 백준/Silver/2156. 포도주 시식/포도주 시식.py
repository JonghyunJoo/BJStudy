def max_drink(n, amount):
    if n == 0:
        return 0
    if n == 1:
        return amount[0]
    if n == 2:
        return amount[0] + amount[1]

    dp = [0] * n
    dp[0] = amount[0]
    dp[1] = amount[0] + amount[1]
    dp[2] = max(dp[1], dp[0] + amount[2], amount[1] + amount[2])

    for i in range(3, n):
        dp[i] = max(
            dp[i - 1], dp[i - 2] + amount[i], dp[i - 3] + amount[i - 1] + amount[i]
        )

    return dp[n - 1]


n = int(input().strip())
amount = [int(input().strip()) for _ in range(n)]

print(max_drink(n, amount))
