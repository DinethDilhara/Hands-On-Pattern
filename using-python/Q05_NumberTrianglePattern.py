def number_triangle_pattern(size):
    for i in range(1, size + 1):
        num_str = ""
        for j in range(1, i + 1):
            num_str += str(j)
        print(num_str)

number_triangle_pattern(5)

# 1
# 12
# 123
# 1234
# 12345
