def solution(picture, k):
    answer = []
    
    for row in picture:
        new_row = "".join(char * k for char in row)
        for _ in range(k):
            answer.append(new_row)

    return answer