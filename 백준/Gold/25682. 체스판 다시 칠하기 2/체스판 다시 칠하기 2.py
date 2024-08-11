import sys

def min_paint_to_chessboard(board, N, M, K):
    pattern1 = [[('W' if (i + j) % 2 == 0 else 'B') for j in range(M)] for i in range(N)]
    pattern2 = [[('B' if (i + j) % 2 == 0 else 'W') for j in range(M)] for i in range(N)]


    diff1 = [[0] * (M + 1) for _ in range(N + 1)]
    diff2 = [[0] * (M + 1) for _ in range(N + 1)]
    
    for i in range(1, N + 1):
        for j in range(1, M + 1):
            diff1[i][j] = diff1[i-1][j] + diff1[i][j-1] - diff1[i-1][j-1] + (board[i-1][j-1] != pattern1[i-1][j-1])
            diff2[i][j] = diff2[i-1][j] + diff2[i][j-1] - diff2[i-1][j-1] + (board[i-1][j-1] != pattern2[i-1][j-1])
    
    min_paint = float('inf')

    for i in range(K, N + 1):
        for j in range(K, M + 1):
            count1 = diff1[i][j] - diff1[i-K][j] - diff1[i][j-K] + diff1[i-K][j-K]
            count2 = diff2[i][j] - diff2[i-K][j] - diff2[i][j-K] + diff2[i-K][j-K]
            min_paint = min(min_paint, count1, count2)
    
    return min_paint

if __name__ == "__main__":
    input = sys.stdin.read
    data = input().split()

    N, M, K = map(int, data[:3])
    board = data[3:]

    result = min_paint_to_chessboard(board, N, M, K)
    sys.stdout.write(str(result) + '\n')
