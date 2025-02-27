from collections import defaultdict

def solution(genres, plays):
    dict_play = defaultdict(int)
    dict_song = defaultdict(list)
    
    for i, (genre, play) in enumerate(zip(genres, plays)):
        dict_play[genre] += play
        dict_song[genre].append([i, play])

    sorted_genres = sorted(dict_play.keys(), key=lambda g: dict_play[g], reverse=True)
    
    result = []
    for genre in sorted_genres:
        sorted_songs = sorted(dict_song[genre], key=lambda x: (-x[1], x[0]))
        result.extend([song[0] for song in sorted_songs[:2]])
    
    return result