def diamond_star_pattern(size):

    for i in range(size):
        print(" " * (size - i - 1) + "* " * (i + 1))


    for i in range(size - 2, -1, -1):
        print(" " * (size - i - 1) + "* " * (i + 1))


diamond_star_pattern(5)


#     *
#    * *
#   * * *
#  * * * *
# * * * * *
#  * * * *
#   * * *
#    * *
#     *