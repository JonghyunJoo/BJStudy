from functools import reduce

def solution(num_list):
    m = reduce(lambda x,y: x*y, num_list)
    s = sum(num_list)**2
    return 1 if m<s else 0