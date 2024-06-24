import pickle

dbfilename = 'assignment3_20213015.dat'

def readScoreDB():
    try:
        fH = open(dbfilename, 'rb')
    except FileNotFoundError as e:
        print("New DB: ", dbfilename)
        return []

    scdb = []
    try:
        scdb = pickle.load(fH)
    except:
        print("Empty DB: ", dbfilename)
    else:
        print("Open DB: ", dbfilename)
    fH.close()
    return scdb

# write the data into person db
def writeScoreDB(scdb):
    fH = open(dbfilename, 'wb')
    pickle.dump(scdb, fH)
    fH.close()


def doScoreDB(scdb):
    while(True):
        inputstr = (input("Score DB > "))
        try:
            if inputstr == "": continue
            parse = inputstr.split(" ")
            if parse[0] == 'add':
                record = {'Name':parse[1], 'Age':int(parse[2]), 'Score':int(parse[3])}
                scdb += [record]

            # del 명령 수정
            elif parse[0] == 'del':
                i = 0
                while i < len(scdb): # 모든 name을 삭제를 위해 while 사용, len(scdb)를 통해 모든 요소를 확인
                        if scdb[i]['Name'] == parse[1]: # 이름이 같다면 삭제, 이름이 같지 않다면 i+1
                            scdb.remove(scdb[i])
                        else:
                            i += 1

            elif parse[0] == 'show':
                sortKey ='Name' if len(parse) == 1 else parse[1]
                showScoreDB(scdb, sortKey)

            # find 명령 추가, 이름이 같다면 모든 요소 출력
            elif parse[0] == 'find':
                for j in scdb:
                  if j['Name'] == parse[1]:
                     for attr in sorted(j):
                         print(f"{attr}={j[attr]}", end=' ')
                     print()

            # inc 명령 추가, 이름이 같다면 점수 추가
            elif parse[0] == 'inc':
                for j in scdb:
                    if j['Name'] == parse[1]:
                        j['Score'] += int(parse[2])
            elif parse[0] == 'quit':
                break
            else:
                print("Invalid command: " + parse[0])

        # error 처리
        except:
            print(f"{parse[0]} : 오류 발생, 재입력")
            continue

def showScoreDB(scdb, keyname):
    for p in sorted(scdb, key=lambda person: person[keyname]):
        for attr in sorted(p):
            print(attr + "=" + p[attr], end=' ')
        print()


scoredb = readScoreDB()
doScoreDB(scoredb)
writeScoreDB(scoredb)
