def compress(x, y, size):
    initial = video[x][y]
    for i in range(x, x + size):
        for j in range(y, y + size):
            if video[i][j] != initial:
                half = size // 2
                return "(" + compress(x, y, half) + \
                             compress(x, y + half, half) + \
                             compress(x + half, y, half) + \
                             compress(x + half, y + half, half) + ")"
    return initial

N = int(input())
video = [input().strip() for _ in range(N)]

result = compress(0, 0, N)
print(result)