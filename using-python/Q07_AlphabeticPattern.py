def alphabetic_pattern(size):
    for i in range(size):
        output = ""
        for j in range(i + 1):
            output += chr(65 + j)
        print(output)


alphabetic_pattern(5)


# A
# AB
# ABC
# ABCD
# ABCDE
