from collections import Counter

def solution(participant, completion):
    participant_count = Counter(participant)
    
    for name in completion:
        participant_count[name] -= 1
        
    for name in participant_count:
        if participant_count[name] > 0:
            return name
