def inverted_pyramid_pattern(size):
    for i in range(size, 0, -1):
        print(" " * (size - i) + "*" * (2 * i - 1))


inverted_pyramid_pattern(5)


# *********
#  *******
#   *****
#    ***
#     *