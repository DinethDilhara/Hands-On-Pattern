def arrowhead_pattern(size):
    for i in range(1, size + 1):
        print("*" * i + " " * (size - i) * 2 + "*" * i)

    for i in range(size - 1, 0, -1):
        print("*" * i + " " * (size - i) * 2 + "*" * i)

arrowhead_pattern(5)

# *        *
# **      **
# ***    ***
# ****  ****
# **********
# ****  ****
# ***    ***
# **      **
# *        *