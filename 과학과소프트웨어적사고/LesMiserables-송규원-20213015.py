import re
import string

wordCount = {}

les_txt = open('Les_Miserables-Victor_Hugo.txt', 'r', encoding='cp949')
les_string = les_txt.read().lower()
a = re.findall(r'\b[a-z]{3,15}\b', les_string)

for w in a:
    count = wordCount.get(w,0)
    wordCount[w] = count + 1

wordCount_list = wordCount.keys()

for ws in wordCount_list:
    print(ws, wordCount[ws])
