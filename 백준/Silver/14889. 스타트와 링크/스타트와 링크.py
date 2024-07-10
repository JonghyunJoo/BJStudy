def calculate_team_score(team, S):
    score = 0
    for i in range(len(team)):
        for j in range(i + 1, len(team)):
            score += S[team[i]][team[j]] + S[team[j]][team[i]]
    return score

def find_min_diff(N, S):
    from itertools import combinations
    
    people = list(range(N))
    min_diff = float('inf')
    
    for team_start in combinations(people, N//2):
        team_link = [person for person in people if person not in team_start]
        
        score_start = calculate_team_score(team_start, S)
        score_link = calculate_team_score(team_link, S)
        
        diff = abs(score_start - score_link)
        min_diff = min(min_diff, diff)
    
    return min_diff

# 입력 받기
N = int(input().strip())
S = [list(map(int, input().strip().split())) for _ in range(N)]

# 결과 출력
print(find_min_diff(N, S))
