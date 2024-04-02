def pascals_triangle(size):
    for i in range(size):

        print(" " * (size - i - 1), end="")

        coefficient = 1

        for j in range(i + 1):
            print(coefficient, end=" ")

            coefficient = coefficient * (i - j) // (j + 1)

        print()

pascals_triangle(7)


#       1
#      1 1
#     1 2 1
#    1 3 3 1
#   1 4 6 4 1
#  1 5 10 10 5 1
# 1 6 15 20 15 6 1
