def solution(mats, park):
    n, m = len(park), len(park[0])
    
    mats.sort(reverse=True)
    
    for size in mats:
        for i in range(n - size + 1):
            for j in range(m - size + 1):
                is_possible = True
                for x in range(i, i + size):
                    for y in range(j, j + size):
                        if park[x][y] != "-1":
                            is_possible = False
                            break
                    if not is_possible:
                        break
                if is_possible:
                    return size
    
    return -1