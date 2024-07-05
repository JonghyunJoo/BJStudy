from itertools import permutations

N, M = map(int, input().strip().split())

numbers = list(range(1, N + 1))
perm = permutations(numbers, M)

results = [" ".join(map(str, p)) for p in perm]
results.sort()

for result in results:
    print(result)
