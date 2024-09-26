# 테스트 케이스 수 입력
T = int(input())

# 각 테스트 케이스에 대해 반복
for _ in range(T):
    yonsei_score = 0
    korea_score = 0
    
    # 9회의 득점 입력
    for _ in range(9):
        Y, K = map(int, input().split())
        yonsei_score += Y
        korea_score += K
    
    # 승자 판정
    if yonsei_score > korea_score:
        print("Yonsei")
    elif korea_score > yonsei_score:
        print("Korea")
    else:
        print("Draw")
