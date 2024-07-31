def electric_wire(n, wires):
    b_positions = [wire[1] for wire in wires]

    dp = [1] * n

    for i in range(1, n):
        for j in range(i):
            if b_positions[i] > b_positions[j]:
                dp[i] = max(dp[i], dp[j] + 1)

    return n - max(dp)


n = int(input())
wires = [tuple(map(int, input().strip().split())) for _ in range(n)]
wires.sort()

print(electric_wire(n, wires))
