from itertools import combinations

N, M = map(int, input().strip().split())

numbers = list(range(1, N + 1))
comb = combinations(numbers, M)

results = [" ".join(map(str, c)) for c in comb]
results.sort()

for result in results:
    print(result)
