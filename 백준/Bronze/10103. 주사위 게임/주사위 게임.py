# 입력 받기
n = int(input())  # 라운드 수 입력
changyoung_score = 100  # 창영이의 초기 점수
sangduk_score = 100     # 상덕이의 초기 점수

# 각 라운드에 대해 처리
for _ in range(n):
    changyoung_dice, sangduk_dice = map(int, input().split())  # 각 라운드에서 주사위 숫자 입력
    
    # 창영이의 주사위가 더 작을 경우 창영이 점수 감소
    if changyoung_dice < sangduk_dice:
        changyoung_score -= sangduk_dice
    
    # 상덕이의 주사위가 더 작을 경우 상덕이 점수 감소
    elif changyoung_dice > sangduk_dice:
        sangduk_score -= changyoung_dice

# 결과 출력
print(changyoung_score)
print(sangduk_score)
