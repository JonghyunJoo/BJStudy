def max_meetings(meetings):
    meetings.sort(key=lambda x: (x[1], x[0]))
    
    count = 0
    current_end_time = 0
    
    for start, end in meetings:
        if start >= current_end_time:
            count += 1
            current_end_time = end
            
    return count

n = int(input())
meetings = [tuple(map(int, input().split())) for _ in range(n)]

print(max_meetings(meetings))
