import sys

input = sys.stdin.readline

n = int(input())
sequence = list(map(int, input().split()))

lis = []

for num in sequence:
    left = 0
    right = len(lis)

    while left < right:
        mid = (left + right) // 2

        if lis[mid] < num:
            left = mid +1
        else:
            right = mid

    if left < len(lis):
        lis[left] = num
    else:
        lis.append(num)

print(len(lis))
