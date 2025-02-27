def solution(sizes):
    l1 = 0
    l2 = 0
    for size in sizes:
        size.sort()
        if size[0]>l1:
            l1 = size[0]
        if size[1]>l2:
            l2 = size[1]
    return l1*l2