def rhombus_pattern(size):
    for i in range(size):
        print(" " * (size - i - 1) + "*" * size)

    for i in range(size - 2, -1, -1):
        print(" " * (size - i - 1) + "*" * size)

rhombus_pattern(5)


#     *****
#    *****
#   *****
#  *****
# *****
#  *****
#   *****
#    *****
#     *****