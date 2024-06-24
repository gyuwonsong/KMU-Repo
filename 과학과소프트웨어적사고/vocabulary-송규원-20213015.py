voc = open('vocabulary.txt', 'r', encoding='cp949')

vocab = {}

for line in voc:
    data = line.strip().split()
    eng_word = data [1]
    kor_word = data [2]
    vocab[eng_word] = kor_word

guess = input("\n>> 찾고자 하는 단어 (eng):")

if guess in vocab:
    true_guess = vocab[guess]
    print(">> 찾고자 하는 단어의 의미 (kor):", true_guess)

else:
    while guess not in vocab:
        guess = input("\n>> 찾고자 하는 단어 재입력(eng):")

    true_guess_1 = vocab[guess]
    print(">> 찾고자 하는 단어의 의미 (kor):", true_guess_1)

print(vocab)
        
