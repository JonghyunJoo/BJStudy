from itertools import combinations_with_replacement

N, M = map(int, input().strip().split())

numbers = list(range(1, N + 1))
comb_with_re = combinations_with_replacement(numbers, M)

results = [" ".join(map(str, cr)) for cr in comb_with_re]
results.sort()

for result in results:
    print(result)
