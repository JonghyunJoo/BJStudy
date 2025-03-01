def solution(a, d, included):
    answer = 0
    for i, inc in enumerate(included):
        if inc:
            answer += a + d*i
    return answer