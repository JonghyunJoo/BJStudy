import heapq
import sys

input = sys.stdin.read
data = input().split()

N = int(data[0])
heap = []

results = []
for i in range(1, N + 1):
    x = int(data[i])
    if x > 0:
        heapq.heappush(heap, x)
    else:
        if heap:
            results.append(heapq.heappop(heap))
        else:
            results.append(0)

sys.stdout.write("\n".join(map(str, results)) + "\n")
