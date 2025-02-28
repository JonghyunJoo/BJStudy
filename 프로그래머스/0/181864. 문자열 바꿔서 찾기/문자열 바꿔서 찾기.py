def solution(myString, pat):
    replaced_string = myString.replace("A", "X").replace("B", "A").replace("X","B")
    return 1 if pat in replaced_string else 0