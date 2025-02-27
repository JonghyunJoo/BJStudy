
def solution(answers):
    pattern = [
        [1,2,3,4,5],
        [2,1,2,3,2,4,2,5],
        [3,3,1,1,2,2,4,4,5,5]
    ]
    collect = [0, 0, 0]
    for i, answer in enumerate(answers):
        for j in range(3):
            if answer == pattern[j][i%len(pattern[j])]:
                collect[j] +=1
                
    high_scored = max(collect)
    result = []
    for i, score in enumerate(collect):
        if score == high_scored:
            result.append(i+1)
    
    return result