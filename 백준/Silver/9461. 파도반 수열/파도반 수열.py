T = int(input())

test_cases = [int(input().strip()) for _ in range(T)]

max_N = max(test_cases)

P = [0] * (max_N + 1)
P[1] = P[2] = P[3] = 1

for i in range(4, max_N + 1):
    P[i] = P[i - 2] + P[i - 3]

for test in test_cases:
    print(P[test])
