def sum_cut_tree(tree_heights, cut_height):
    total = 0
    for tree_height in tree_heights:
        if tree_height > cut_height:
            total += tree_height - cut_height
    return total


def max_tree_height(M, tree_heights):
    left, right = 0, max(tree_heights)
    result = 0
    while left <= right:
        mid = (left + right) // 2
        if sum_cut_tree(tree_heights, mid) >= M:
            result = mid
            left = mid + 1
        else:
            right = mid - 1
    return result


N, M = map(int, input().strip().split())

tree_heights = list(map(int, input().strip().split()))

print(max_tree_height(M, tree_heights))
