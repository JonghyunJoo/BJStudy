def check_paper(x, y, size, matrix):
    first_value = matrix[x][y]
    for i in range(x, x + size):
        for j in range(y, y + size):
            if matrix[i][j] != first_value:
                return None
    return first_value


def count_papers(x, y, size, matrix, result):
    paper_type = check_paper(x, y, size, matrix)
    if paper_type is not None:
        result[paper_type + 1] += 1
    else:
        new_size = size // 3
        for i in range(3):
            for j in range(3):
                count_papers(
                    x + i * new_size, y + j * new_size, new_size, matrix, result
                )


def main():
    N = int(input())
    matrix = [list(map(int, input().split())) for _ in range(N)]
    result = [0, 0, 0]
    count_papers(0, 0, N, matrix, result)
    print(result[0])
    print(result[1])
    print(result[2])


if __name__ == "__main__":
    main()
