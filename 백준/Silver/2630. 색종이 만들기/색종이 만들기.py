def count_paper(x, y, size):
    global white, blue

    init_color = paper[x][y]
    all_same = True

    for i in range(x, x + size):
        for j in range(y, y + size):
            if paper[i][j] != init_color:
                all_same = False
                break
        if not all_same:
            break

    if all_same:
        if init_color == 0:
            white += 1
        else:
            blue += 1

    else:
        half_size = size // 2
        count_paper(x, y, half_size)
        count_paper(x + half_size, y, half_size)
        count_paper(x, y + half_size, half_size)
        count_paper(x + half_size, y + half_size, half_size)


N = int(input())
paper = [list(map(int, input().strip().split())) for _ in range(N)]

white = 0
blue = 0

count_paper(0, 0, N)

print(white)
print(blue)
