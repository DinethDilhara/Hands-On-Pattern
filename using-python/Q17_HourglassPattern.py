def hourglass_pattern(size):
    for i in range(size, 0, -1):
        print(" " * (size - i) + "*" * (2 * i - 1))

    for i in range(2, size + 1):
        print(" " * (size - i) + "*" * (2 * i - 1))

hourglass_pattern(5)


# *********
#  *******
#   *****
#    ***
#     *
#    ***
#   *****
#  *******
# *********
