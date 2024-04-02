def reverse_number_triangle_pattern(size):
    for i in range(size, 0, -1):
        num_str = ""
        for j in range(1, i + 1):
            num_str += str(j)
        print(num_str)


reverse_number_triangle_pattern(5)

# 12345
# 1234
# 123
# 12
# 1