from functools import cmp_to_key

def compare(x, y):
    return (int(y+x)-int(x+y))

def solution(numbers):
    sorted_numbers = sorted(map(str, numbers), key=cmp_to_key(compare))

    return str(int("".join(sorted_numbers)))