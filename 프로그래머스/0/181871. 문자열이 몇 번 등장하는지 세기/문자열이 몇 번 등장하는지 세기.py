def solution(myString, pat):
    count = 0
    for i in range(len(myString) - len(pat) + 1):  
        if myString[i:].startswith(pat):
            count += 1
    return count
