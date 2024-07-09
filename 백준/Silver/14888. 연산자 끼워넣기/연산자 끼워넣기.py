def calculator(a, b, operator):
    if operator == 0:
        return a + b
    elif operator == 1:
        return a - b
    elif operator == 2:
        return a * b
    elif operator == 3:
        if a < 0:
            return -(-a // b)
        else:
            return a // b


def backtrack(index, current, operators):
    global max_result, min_result

    if index == N:
        max_result = max(max_result, current)
        min_result = min(min_result, current)
        return

    for i in range(4):
        if operators[i] > 0:
            operators[i] -= 1
            next_result = calculator(current, A[index], i)
            backtrack(index + 1, next_result, operators)
            operators[i] += 1


N = int(input())

A = list(map(int, input().strip().split()))

operators = list(map(int, input().strip().split()))

max_result = -1000000000
min_result = 1000000000

backtrack(1, A[0], operators)

print(max_result)
print(min_result)
