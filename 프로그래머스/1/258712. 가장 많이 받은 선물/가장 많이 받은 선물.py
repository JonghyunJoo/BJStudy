from collections import defaultdict, Counter

def solution(friends, gifts):
    gift_count = defaultdict(lambda : defaultdict(int))
    gift_given = defaultdict(int)
    gift_received = defaultdict(int)
    
    for gift in gifts:
        giver, receiver = gift.split( )
        gift_count[giver][receiver] += 1
        gift_given[giver] += 1
        gift_received[receiver] += 1
        
    gift_score = {friend: gift_given[friend] - gift_received[friend] for friend in friends}
    
    next_receive = defaultdict(int)
    
    for i in range(len(friends)):
        for j in range(i+1, len(friends)):
            a, b = friends[i], friends[j]
            
            if gift_count[a][b] > gift_count[b][a]:
                next_receive[a] +=1
            elif gift_count[b][a] > gift_count[a][b]:
                next_receive[b] +=1
            else:
                if gift_score[a] > gift_score[b]:
                    next_receive[a] +=1
                elif gift_score[b] > gift_score[a]:
                    next_receive[b] += 1
    
    return max(next_receive.values(), default = 0)