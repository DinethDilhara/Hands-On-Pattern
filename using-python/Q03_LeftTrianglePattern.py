def left_triangle_pattern(size):
    for i in range(1, size + 1):
        print(" " * (size - i) + "*" * i)

left_triangle_pattern(5)


#     *
#    **
#   ***
#  ****
# *****
