import heapq
import sys

input = sys.stdin.read
write = sys.stdout.write

data = input().split()
N = int(data[0])
numbers = list(map(int, data[1:]))

min_heap = []
max_heap = []
result = []

for score in numbers:
    if not max_heap or -max_heap[0] >= score:
        heapq.heappush(max_heap, -score)
    else:
        heapq.heappush(min_heap, score)

    if len(max_heap) > len(min_heap) + 1:
        heapq.heappush(min_heap, -heapq.heappop(max_heap))
    elif len(min_heap) > len(max_heap):
        heapq.heappush(max_heap, -heapq.heappop(min_heap))

    result.append(-max_heap[0])

write("\n".join(map(str, result)) + "\n")
