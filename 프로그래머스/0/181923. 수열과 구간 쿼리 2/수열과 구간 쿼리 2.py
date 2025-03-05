def solution(arr, queries):
    answer = []
    for s, e, k in queries:
        temp= 1000001
        for i in range(s, e+1):
            if(arr[i]>k):
                temp = min(arr[i], temp)
        if temp == 1000001:
            answer.append(-1)
        else:
            answer.append(temp)
    return answer