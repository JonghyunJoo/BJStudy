def solution(sizes):
    w = max(min(size) for size in sizes)
    h = max(max(size) for size in sizes)
    return w * h