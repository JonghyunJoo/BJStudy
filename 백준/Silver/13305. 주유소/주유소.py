def calculate_minimum_cost(N, road_lengths, fuel_prices):
    total_cost = 0
    current_price = fuel_prices[0]
    
    for i in range(N - 1):
        total_cost += current_price * road_lengths[i]
        if fuel_prices[i + 1] < current_price:
            current_price = fuel_prices[i + 1]
    
    return total_cost

N = int(input())
road_lengths = list(map(int, input().split()))
fuel_prices = list(map(int, input().split()))


result = calculate_minimum_cost(N, road_lengths, fuel_prices)
print(result)
