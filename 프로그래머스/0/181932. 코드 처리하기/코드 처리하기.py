def solution(code):
    mode = 0
    answer = ''
    for i, c in enumerate(code):
        if mode == 0:
            if c == "1":
                mode = 1
            else:
                if i %2 ==0:
                    answer+=c
        else:
            if c == "1":
                mode = 0
            else:
                if i %2 == 1:
                    answer+=c
    
    return answer if answer != '' else "EMPTY"