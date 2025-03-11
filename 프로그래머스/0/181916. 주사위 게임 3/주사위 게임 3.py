from collections import Counter

def solution(a, b, c, d):
    dice = [a,b,c,d]
    count = Counter(dice)
    
    if len(count) == 1:
        return next(iter(count)) * 1111
    elif len(count) == 2:
        p,q = count.keys()
        if count[p] == 3:
            return (10 * p + q) ** 2
        elif count[q] == 3:
            return (10 * q + p) ** 2
        else:
            return (p+q)*abs(p-q)
    elif len(count) == 3: 
        q, r = [num for num in count if count[num] == 1]
        return q*r
    else:
        return min(count.keys())