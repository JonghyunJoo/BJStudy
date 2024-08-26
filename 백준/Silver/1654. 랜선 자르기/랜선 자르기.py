def count_cables(lan_lengths, cable_length):
    count = 0
    for length in lan_lengths:
        count += length // cable_length
    return count

def max_lan_cable_length(k, n, lan_lengths):
    left, right = 1, max(lan_lengths)
    result = 0
    
    while left <= right:
        mid = (left + right) // 2
        if count_cables(lan_lengths, mid) >= n:
            result = mid
            left = mid + 1 
        else:
            right = mid - 1 
    
    return result

k, n = map(int, input().split())
lan_lengths = [int(input()) for _ in range(k)]

print(max_lan_cable_length(k, n, lan_lengths))
