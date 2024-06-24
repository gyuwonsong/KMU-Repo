import pickle

class Pickle1:
    def __init__(self):
        self.dic_list = {"waiver": "권리 포기, 면제","tuition":"수업료", "insurance":"보험"}
        print(">> dictionary data :", self.dic_list)

    def pickle_dump(self):
        print("\n>> wb 모드로 myDic.dat 파일 오픈 후 pickle file 객체생성, dump")
        f = open('myDic.dat', 'wb')
        pickle.dump(self.dic_list, f)
        print(">> pickle file :", f)

        f.close()

    def pickle_load(self):
        print("\n>> rb 모드로 myDic.dat 파일 오픈 후 pickle file 객체생성, load")
        f = open('myDic.dat', 'rb')
        loaded_dic_list = pickle.load(f)

        f.close()

        print("\n>> unpickled_dic_list :", loaded_dic_list)

class Main:
    def main(self):
        pic = Pickle1()
        pic.pickle_dump()
        pic.pickle_load()
        
#main
pic_main = Main()
pic_main.main()
    
        
