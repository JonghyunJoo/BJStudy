def solution(arr):
    k = 1
    while(k < len(arr)):
        k <<= 1
   
    return arr + [0] * (k-len(arr))