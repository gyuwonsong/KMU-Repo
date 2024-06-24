import random

class Word:

    def __init__(self, filename):
        self.words = []
        f = open(filename, 'r')
        lines = f.readlines()
        f.close()

        self.count = 0
        for line in lines:
            word = line.rstrip()
            self.words.append(word)
            self.count += 1

        print('%d words in DB' % self.count)
        print("Maximum length:", 20)   #maximum length of the word

    def test(self):
        return 'default'


    def randFromDB(self, minLength):
        selected = False
        while not selected:
            r = random.randrange(self.count)
            if len(self.words[r])>=minLength:
                selected = True
        return self.words[r]
