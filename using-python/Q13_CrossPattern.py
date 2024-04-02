def cross_pattern(size):
    for i in range(size):
        for j in range(size):
            if j == i or j == size - i - 1:
                print("*", end="")
            else:
                print(" ", end="")
        print()

cross_pattern(7)


# *     *
#  *   *
#   * *
#    *
#   * *
#  *   *
# *     *

