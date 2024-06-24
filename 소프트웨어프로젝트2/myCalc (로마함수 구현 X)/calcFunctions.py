import math

def factorial(numStr):
    try:
        n = int(eval(numStr))
        r = math.factorial(n)
    except:
        r = 'Error!'
    return r

def decToBin(numStr):
    try:
        n = int(numStr)
        r = bin(n)
    except:
        r = 'Error!'
    return r

def binToDec(numStr):
    try:
        r = int(numStr, 2)
    except:
        r = 'Error!'
    return r

def decToRoman(numStr):
    return 'dec -> roman'