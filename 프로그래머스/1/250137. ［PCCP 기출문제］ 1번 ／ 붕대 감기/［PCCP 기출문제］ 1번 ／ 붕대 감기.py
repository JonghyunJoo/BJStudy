from collections import defaultdict

def solution(bandage, health, attacks):
    t, x, y = bandage
    current_health = health
    se = 0
    attack_idx = 0 
    max_health = health

    for time in range(1, attacks[-1][0] + 1):
        if attack_idx < len(attacks) and attacks[attack_idx][0] == time:
            current_health -= attacks[attack_idx][1]
            if current_health <= 0:
                return -1
            attack_idx += 1
            se = 0
            continue
            
        current_health = min(max_health, current_health + x)
        se += 1
        if se == t:
            current_health = min(max_health, current_health + y)
            se = 0
        
    return current_health
