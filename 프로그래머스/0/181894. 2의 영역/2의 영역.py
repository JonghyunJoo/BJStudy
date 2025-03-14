def solution(arr):
    if 2 not in arr:
        return [-1]
    
    i1 = arr.index(2)
    i2 = len(arr) - 1 - arr[::-1].index(2)
    
    return arr[i1:i2+1]