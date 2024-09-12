import math

H, W, N, M = map(int, input().strip().split())

row = math.ceil(W / (M + 1))
col = math.ceil(H / (N + 1))

print(row*col)