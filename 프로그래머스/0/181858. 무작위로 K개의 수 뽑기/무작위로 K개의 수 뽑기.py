def solution(arr, k):
    answer = []
    for num in arr:
        if len(answer) == k:
            break
        elif num not in answer:
            answer.append(num)

    return answer+([-1] * (k-len(answer)))