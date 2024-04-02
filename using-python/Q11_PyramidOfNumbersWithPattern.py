def pyramid_of_numbers(size):
    for i in range(1, size + 1):

        print(" " * (size - i) * 2, end="")

        for j in range(1, i + 1):
            print(j, end=" ")

        for j in range(i - 1, 0, -1):
            print(j, end=" ")

        print()


pyramid_of_numbers(5)


#         1
#       1 2 1
#     1 2 3 2 1
#   1 2 3 4 3 2 1
# 1 2 3 4 5 4 3 2 1
