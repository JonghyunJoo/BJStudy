def can_install_router(houses, mid, C):
    count = 1
    last_position = houses[0]

    for i in range(1, len(houses)):
        if houses[i] - last_position >= mid:
            count += 1
            last_position = houses[i]
            if count == C:
                return True

    return False

def max_router_distance(C, houses):
    houses.sort()
    low = 1
    high = houses[-1] - houses[0]
    result = 0

    while low <= high:
        mid = (low + high) // 2

        if can_install_router(houses, mid, C):
            result = mid
            low = mid + 1
        else:
            high = mid - 1
    return result


N, C = map(int, input().strip().split())

x = [int(input()) for _ in range(N)]


print(max_router_distance(C, x))
