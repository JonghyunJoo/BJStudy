def solution(rank, attendance):
    sorted_rank = sorted((x, i) for i,x in enumerate(rank) if attendance[i])
    return sorted_rank[0][1]*10000 + sorted_rank[1][1]*100 + sorted_rank[2][1]