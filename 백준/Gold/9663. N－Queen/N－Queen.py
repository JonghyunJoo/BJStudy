def count_valid(row):
    if row == n:
        return 1
    count = 0
    for col in range(n):
        if col not in cols and row - col not in dia_left and row + col not in dia_right:
            cols.add(col)
            dia_left.add(row - col)
            dia_right.add(row + col)
            count += count_valid(row + 1)
            cols.remove(col)
            dia_left.remove(row - col)
            dia_right.remove(row + col)
    return count

cols = set()
dia_left = set()
dia_right = set()

n = int(input())

print(count_valid(0))
