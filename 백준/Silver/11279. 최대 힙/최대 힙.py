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
        heapq.heappush(heap, -x)  # 최대 힙을 위해 음수로 변환하여 삽입
    elif x == 0:
        if heap:
            results.append(-heapq.heappop(heap))  # 꺼낼 때 다시 양수로 변환
        else:
            results.append(0)

sys.stdout.write("\n".join(map(str, results)) + "\n")
