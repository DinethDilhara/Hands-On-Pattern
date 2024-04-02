def triangle_pattern_with_spaces(size):
    for i in range(1, size + 1):

        print(" " * (size - i), end="")

        for j in range(i, 0, -1):
            print(j, end="")

        for j in range(2, i + 1):
            print(j, end="")

        print()

triangle_pattern_with_spaces(5)


#     1
#    212
#   32123
#  4321234
# 543212345