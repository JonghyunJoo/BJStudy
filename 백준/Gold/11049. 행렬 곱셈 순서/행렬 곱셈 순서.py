N = int(input())
matrix = [tuple(map(int, input().split())) for _ in range(N)]

# 행렬 크기 정보를 바탕으로 p 배열 생성
p = [matrix[i][0] for i in range(N)] + [matrix[-1][1]]

# DP 배열 초기화
dp = [[0] * N for _ in range(N)]

# 길이에 따라 DP 테이블 채우기
for length in range(2, N + 1):  # 길이를 2부터 N까지
    for i in range(N - length + 1):  # 시작 인덱스
        j = i + length - 1  # 끝 인덱스
        dp[i][j] = float('inf')
        
        # 최적 분할 지점 k 찾기
        for k in range(i, j):
            cost = dp[i][k] + dp[k + 1][j] + p[i] * p[k + 1] * p[j + 1]
            dp[i][j] = min(dp[i][j], cost)

# 최종 결과 출력
print(dp[0][N - 1])
