from collections import defaultdict

S = input().strip()

q = int(input().strip())

queries = []

for _ in range(q):
    query = input().strip().split()
    alpha = query[0]
    l = int(query[1])
    r = int(query[2])
    queries.append((alpha, l, r))

alpha_index = defaultdict(list)

for i in range(len(S)):
    alpha_index[S[i]].append(i)

for query in queries:
    alpha = query[0]
    l = query[1]
    r = query[2]
    indices = alpha_index[alpha]

    cnt = 0
    for index in indices:
        if l <= index <= r:
            cnt += 1

    print(cnt)
