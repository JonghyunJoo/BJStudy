def solution(arr):
    stk = []
    i = 0
    while(i < len(arr)):
        if stk == []:
            stk.append(arr[i])
        else :
            if stk[-1] == arr[i]:
                stk.pop()
            else:
                stk.append(arr[i])
        i += 1
        
    return stk if stk else [-1]