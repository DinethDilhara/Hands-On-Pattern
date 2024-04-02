def pyramid_pattern(size):
    for i in range(1, size + 1):
        print(" " * (size - i) + "*" * (2 * i - 1))


pyramid_pattern(5)


#     *
#    ***
#   *****
#  *******
# *********