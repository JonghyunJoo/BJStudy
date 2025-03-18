def solution(mats, park):
    n, m = len(park), len(park[0])
    
    mats.sort(reverse=True)
    
    for size in mats:
        for i in range(n - size + 1):
            for j in range(m - size + 1):
                if all(park[x][y] == '-1' for x in range(i, i+size) for y in range(j, j+size)):
                    return size
    return -1