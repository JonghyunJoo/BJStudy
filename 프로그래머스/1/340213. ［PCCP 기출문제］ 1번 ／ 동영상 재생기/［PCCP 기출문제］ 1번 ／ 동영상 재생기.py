def solution(video_len, pos, op_start, op_end, commands):
    answer = ''
    video_len = to_second(video_len)
    pos = to_second(pos)
    op_start = to_second(op_start)
    op_end = to_second(op_end)
    
    for command in commands:
        if op_start <= pos < op_end:
            pos = op_end
        
        if command == "next":
            pos += 10
            if pos > video_len:
                pos = video_len
                
        elif command == "prev":
            pos -= 10    
            if pos < 0:
                pos = 0
        
        if op_start <= pos < op_end:
            pos = op_end
    
    m = pos // 60
    s = pos % 60
    if m % 10 == m:
        m = f"0{m}"
    if s % 10 == s:
        s = f"0{s}"
    return f"{m}:{s}"

def to_second(time):
    m, s = time.split(":")
    return int(m)*60 + int(s)
