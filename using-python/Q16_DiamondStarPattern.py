def diamond_star_pattern(size):
    for i in range(size):
        print("* " * (i + 1))

    for i in range(size - 1, 0, -1):
        print("* " * i)

diamond_star_pattern(5)


# *
# * *
# * * *
# * * * *
# * * * * *
# * * * *
# * * *
# * *
# *
