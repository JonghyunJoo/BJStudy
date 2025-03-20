from collections import Counter
def solution(strArr):
    strArr = [len(str) for str in strArr]
    return Counter(strArr).most_common(1)[0][1]