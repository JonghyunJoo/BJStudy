def solution(nums):
    unique_pokemon = set(nums)
    return min(len(unique_pokemon), len(nums)/2)