from itertools import combinations

def solution(n, q, ans):
    possible_code = list(combinations(range(1,n+1), 5))
    count = 0
    
    for code in possible_code:
        is_valid = True
        for comb, a in zip(q, ans):
            if(len(set(comb)&set(code)) != a):
                is_valid = False
                break
        if(is_valid):
            count +=1
    return count