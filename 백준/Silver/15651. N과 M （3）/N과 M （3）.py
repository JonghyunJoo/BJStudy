from itertools import product

N, M = map(int, input().strip().split())

numbers = list(range(1, N + 1))
prod = product(numbers, repeat=M)

results = [" ".join(map(str, p)) for p in prod]
results.sort()

for result in results:
    print(result)
