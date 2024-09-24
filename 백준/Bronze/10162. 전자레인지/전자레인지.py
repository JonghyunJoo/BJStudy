def min_button_presses(T):
    # 각 버튼에 해당하는 시간 (초 단위)
    button_times = [300, 60, 10]
    # DP 배열 초기화 (T + 1)로 설정하여 가능한 최대 인덱스까지 초기화
    dp = [float('inf')] * (T + 1)
    # 각 버튼의 누른 횟수를 저장하기 위한 배열
    counts = [[0] * 3 for _ in range(T + 1)]
    
    dp[0] = 0  # 요리시간 0초는 버튼을 누르지 않아도 되므로 0으로 설정
    
    for t in range(1, T + 1):
        for i in range(3):
            if t >= button_times[i]:  # 현재 시간에서 버튼 시간보다 크거나 같으면
                if dp[t] > dp[t - button_times[i]] + 1:  # 더 적은 버튼 수로 만들 수 있는지 확인
                    dp[t] = dp[t - button_times[i]] + 1
                    counts[t] = counts[t - button_times[i]].copy()  # 이전 카운트를 복사
                    counts[t][i] += 1  # 현재 버튼 카운트 증가

    # 결과 확인
    if dp[T] == float('inf'):
        return -1  # T초를 맞출 수 없는 경우
    else:
        return counts[T]  # A, B, C 버튼 누른 횟수 반환


# 입력 받기
T = int(input().strip())
result = min_button_presses(T)

# 결과 출력
if result == -1:
    print(-1)
else:
    print(result[0], result[1], result[2])
