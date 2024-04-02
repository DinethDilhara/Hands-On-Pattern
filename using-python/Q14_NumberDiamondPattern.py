def number_diamond_pattern(size):

    for i in range(1, size + 1):
        print(" " * (size - i), end="")
        for j in range(1, i + 1):
            print(j, end="")
        for j in range(i - 1, 0, -1):
            print(j, end="")
        print()


    for i in range(size - 1, 0, -1):
        print(" " * (size - i), end="")
        for j in range(1, i + 1):
            print(j, end="")
        for j in range(i - 1, 0, -1):
            print(j, end="")
        print()


number_diamond_pattern(5)


#     1
#    121
#   12321
#  1234321
# 123454321
#  1234321
#   12321
#    121
#     1
