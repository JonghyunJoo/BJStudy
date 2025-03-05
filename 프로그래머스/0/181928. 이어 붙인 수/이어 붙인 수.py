def solution(num_list):
    o = ''
    e = ''
    for num in num_list:
        if num % 2 == 0:
            e += str(num)
        else:
            o += str(num)
    return int(o)+int(e)