n = int(input())

for _ in range(n):
    quiz = input()
    
    score = 0
    consecutive_o = 0
    
    for ch in quiz:
        if ch == 'O':
            consecutive_o += 1
            score += consecutive_o 
        else:
            consecutive_o = 0
    
    print(score)
