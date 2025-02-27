def solution(data, col, row_begin, row_end):
    data.sort(key=lambda x: (x[col - 1], -x[0]))

    result = 0
    for i in range(row_begin, row_end + 1):
        S_i = sum(value % i for value in data[i - 1])
        result ^= S_i
    
    return result