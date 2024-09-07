import heapq
import sys

input = sys.stdin.read

data = input().splitlines()
N = int(data[0])
heap = []

result = []
for i in range(1, N + 1):
    x = int(data[i])

    if x != 0:
        heapq.heappush(heap, (abs(x), x))
    else:

        if heap:
            result.append(heapq.heappop(heap)[1])
        else:
            result.append(0)

sys.stdout.write("\n".join(map(str, result)) + "\n")
