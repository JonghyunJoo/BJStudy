import math

N, M = map(int, input().split())

gcd = math.gcd(N, M)

lcm = (N * M) // gcd

print(gcd)
print(lcm)
