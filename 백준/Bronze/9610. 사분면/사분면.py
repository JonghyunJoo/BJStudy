# 점의 개수 입력 받기
n = int(input())

# 카운트를 위한 변수 초기화
q1, q2, q3, q4, axis = 0, 0, 0, 0, 0

# n개의 점의 좌표 입력 받기
for _ in range(n):
    x, y = map(int, input().split())
    
    if x == 0 or y == 0:
        axis += 1  # 축 위에 있는 점
    elif x > 0 and y > 0:
        q1 += 1  # 1사분면
    elif x < 0 and y > 0:
        q2 += 1  # 2사분면
    elif x < 0 and y < 0:
        q3 += 1  # 3사분면
    elif x > 0 and y < 0:
        q4 += 1  # 4사분면

# 결과 출력
print(f"Q1: {q1}")
print(f"Q2: {q2}")
print(f"Q3: {q3}")
print(f"Q4: {q4}")
print(f"AXIS: {axis}")
