def main(minterm):
    mintermList = minterm
    condition = True
    
    PIList = []
    
    #10진수 2진수로 변환
    for i in range(2, len(mintermList)):
            mintermList[i] = bin(mintermList[i])[2:].zfill(mintermList[0])
            
    checkList = []
    noncheckList = []
        
    #1의 갯수에 따라 2차원 배열에 저장 
    allList = [[] for i in range(mintermList[0]+1)]
            
    for i in range(2, len(mintermList)):
        cntList = list(map(int, str(mintermList[i])))
        cnt = 0
            
        for j in range(mintermList[0]):
            if(cntList[j] == 1):
                cnt = cnt + 1
            else:
                pass
            
        allList[cnt].append(mintermList[i])
        
    tmpList = []
    #HD가 1이면 combined 함수 호출 
    for i in range(len(allList)-1):
        for j in range(len(allList[i])):
            for k in range(len(allList[i+1])):
                HDList1 = list(map(int, allList[i][j]))
                HDList2 = list(map(int, allList[i+1][k]))
                    
                HD = 0
                for l in range(len(HDList1)):
                    if(HDList1[l] != HDList2[l]):
                        HD = HD + 1
                    else:
                        pass
                    
                if(HD == 1):
                    res = combined(allList[i][j], allList[i+1][k])
                    tmpList.append(res)
                        
                    checkList.append(allList[i][j])
                    checkList.append(allList[i+1][k])
                else:
                    noncheckList.append(allList[i][j])
                    noncheckList.append(allList[i+1][k])
    print(tmpList)               
    del mintermList[2:]
    for i in tmpList:
        mintermList.append(i)
    print(mintermList)
            
    checkList_set = set(checkList)
    noncheckList_set = set(noncheckList)
    
    intersection = set(checkList_set) & set(noncheckList_set)
    
    noncheckList_set = noncheckList_set - intersection
    
    checkList_set = list(checkList_set)
    noncheckList_set = list(noncheckList_set)
        
    if(len(noncheckList_set) > 0):
        for i in noncheckList_set:
            PIList.append(i)
    elif(len(noncheckList_set) == 0):
        pass
        
    if(len(tmpList) == 1):
        condition = False
    else:
        pass
    
    print(checkList_set)
    print(noncheckList_set)
    print(PIList)

def combined(str1, str2):
    list1 = list(map(int, str1))
    list2 = list(map(int, str2)) 
        
    res = []
        
    for i in range(len(list1)):
        if(list1[i] == list2[i]):
            res.append(list1[i])
        else:
            res.append('2')
        
    str3 = "".join(map(str, res))
        
    return str3
                         
#main        
numList = list(map(int, input().split()))
n = main(numList)