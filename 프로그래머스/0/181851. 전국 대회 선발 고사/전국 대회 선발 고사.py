def solution(rank, attendance):
    rank_dict = {r: i for i,r in enumerate(rank) if attendance[i]}
    sorted_dict = sorted(rank_dict.keys())
    return rank_dict[sorted_dict[0]]*10000 + rank_dict[sorted_dict[1]]*100 + rank_dict[sorted_dict[2]]