class Guess:

    def __init__(self, word):
        self.secretWord = word
        self.guessedChars = {}
        self.guessedChars = set()
        self.currentStatus = '_' * len(word)
        self.numTries = 0


    def display(self):
        print("Current : " + self.currentStatus)
        print("Tries : " + str(self.numTries))

    def guess(self, character):
        self.guessedChars.add(character)

        if character in self.secretWord:
            for i in range(len(self.secretWord)):
                if self.secretWord[i] == character:
                    self.currentStatus = self.currentStatus[:i] + character + self.currentStatus[i+1:]
            if self.secretWord == self.currentStatus:
                return True
            else:
                return False
        else:
            self.numTries += 1