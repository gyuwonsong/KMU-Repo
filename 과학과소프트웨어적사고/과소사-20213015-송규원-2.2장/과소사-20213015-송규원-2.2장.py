Python 3.9.2 (tags/v3.9.2:1a79785, Feb 19 2021, 13:44:55) [MSC v.1928 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> print("10 bit에 대한 오차율 :", (2**10-1000)/1000)
10 bit에 대한 오차율 : 0.024
>>> print("20 bit에 대한 오차율 :", (2**20-1000000)/1000000)
20 bit에 대한 오차율 : 0.048576
>>> print("30 bit에 대한 오차율 :", (2**30-1000000000)/1000000000)
30 bit에 대한 오차율 : 0.073741824
>>> 