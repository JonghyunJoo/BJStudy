from collections import defaultdict

def solution(id_list, report, k):
    report = set(report)
    report_target = defaultdict(list)
    reported_score = defaultdict(int)
    
    for r in report:
        a, b = r.split(" ")
        report_target[a].append(b)
        reported_score[b] += 1
    
    banned = [key for key, value in reported_score.items() if value >= k]

    answer = [0] * len(id_list)
    for i, id in enumerate(id_list):
        for target in report_target[id]:
            if target in banned:
                answer[i] += 1
    
    return answer
