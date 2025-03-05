def solution(num_list):
    o = 0
    e = 0
    for i, num in enumerate(num_list):
        if i % 2 == 0:
            e += num
        else:
            o += num
    return o if o>=e else e