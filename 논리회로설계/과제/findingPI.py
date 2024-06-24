import sys
def solution(minterm):
    mintermList = minterm
    condition = True

    PIList = [] #PI 모아줌 
    
    #10진수 2진수로 변환
    for i in range(2, len(mintermList)):
            mintermList[i] = bin(mintermList[i])[2:].zfill(mintermList[0])
    
    binList = mintermList[2:]
    while(condition == True):
        checkList = [] #체크된 이진수 모으는 리스트 
        noncheckList = [] #체크 안 된 이진수 모으는 리스트
            
        #1의 갯수에 따라 2차원 배열에 저장하기 위한 리스트, 와일문 돌면서 mintermList 갱신해 줄 것 
        allList = [[] for i in range(mintermList[0]+1)]
                
        for i in range(2, len(mintermList)):
            cntList = list(map(int, str(mintermList[i]))) #'000'이면 숫자 하나씩 떼서 1의 갯수대로 1차원 배열에 저장 
            cnt = 0
                
            for j in range(mintermList[0]):
                if(cntList[j] == 1):
                    cnt = cnt + 1
                else:
                    pass
                
            allList[cnt].append(mintermList[i]) 
             
        tmpList = []
        #HD가 1이면 combined 함수 호출 
        if(len(mintermList) != 3): #len(mintermList)이 3이 아니라면 >> 루프 돎
            for i in range(len(allList)-1):
                for j in range(len(allList[i])):
                    for k in range(len(allList[i+1])):
                        HDList1 = list(map(int, allList[i][j])) #HD 를 비교할 건데, 두 개의 이진수를 일단 분리 ex) '000' > [0, 0, 0]
                        HDList2 = list(map(int, allList[i+1][k]))
                         
                        HD = 0
                        for l in range(len(HDList1)):
                            
                            if(HDList1[l] != HDList2[l]): #자릿수가 다르면 HD를 1 증가시켜 줌 
                                HD = HD + 1
                            else:
                                pass
                        if(HD == 1):
                            res = combined(allList[i][j], allList[i+1][k]) #HD가 1이라면 컴바인 함수 호출, ex) '000' '001' 넘기면 '002' 받음
                            tmpList.append(res) #반환 값을 임시 리스트에 저장 
                                
                            checkList.append(allList[i][j]) #컴바인 되었으니 checkList에 추가 
                            checkList.append(allList[i+1][k])
                            
                        else:
                            noncheckList.append(allList[i][j]) #HD가 1이 아니라면 일단 noncheckList에 추가
                           
                            noncheckList.append(allList[i+1][k])
                            
        elif(len(mintermList) == 3): #len(mintermList)이 3이라면 >> 더이상 묶을 조합이 없다는 뜻, noncheckList에 추가 
            noncheckList.append(mintermList[2])
            
        #print(checkList,"check")
        #print(noncheckList,"noncheck")
        
        tmpList_set = set(tmpList) #임시 리스트에 중복된 값을 제거하기 위해 set으로 형변환         
        del mintermList[2:] #mintermList의 인덱스 2부터 삭제 왜냐면 인덱스 0은 자릿수, 1은 민텀의 갯수이기 때문
        for i in tmpList_set:
            mintermList.append(i) #임시리스트에 있는 값들을 하나씩 mintermList에 추가 
        
        checkList = set(checkList) #checkList 중복 제거
        noncheckList = set(noncheckList) #noncheckList 중복 제거
        
        intersection = checkList & noncheckList #둘의 교집합을 구하기 위해 set으로 바꾸어준 것 >> intersection이 교집합 (타입은 집합)
        noncheckList = noncheckList - intersection #noncheckList_set에서 둘의 교집합을 제거 
        
        checkList = list(checkList) #다시 리스트로 형변환 
        noncheckList = list(noncheckList)
        
        if(len(noncheckList)==0 and len(checkList)==0):
            for i in range(len(allList)):
                PIList = PIList + allList[i] 
        
        if(len(noncheckList) > 0): #noncheckList_set에 원소가 존재한다면 이를 PI에 넣어주면 됨 
            for i in noncheckList:
                PIList.append(i)
        elif(len(noncheckList) == 0): #noncheckList_set에 원소가 존재하지 않는다면 패스 
            pass
            
        if(len(checkList) == 0): #체크 리스트에 원소가 없다면 반복이 종료 
            condition = False
        else:
            pass
    
    answer = [] #PI 정렬 > 짝대기로 바꿔준 후 최종 결과를 담는 리스트 
    PIList.sort() #PIList에 002 020 따위로 값이 있을 거니까 일단 sort
    for i in range(len(PIList)): #포문 돌면서 2를 -로 바꾸어 줌 
        a = list(map(int, str(PIList[i])))
        
        for j in range(len(a)):
            if(a[j] == 2):
                a[j] = "-"
            else:
                pass
            
        b = "".join(map(str, a))
        answer.append(b)
          
    EPIList_tmp = []
    
    for i in binList:
        EPIList = []
        for j in answer:
            string = ''
            for k in range(len(i)):
                if(j[k] == '-'):
                    string = string + i[k]
                else:
                    string = string + j[k]
                    
            if(string == i):
                EPIList.append(j)
            
        if(len(EPIList) == 1):
            if(EPIList[0] not in EPIList_tmp):
                EPIList_tmp.append(EPIList[0])
        
    answer.append("EPI")
    answer = answer + EPIList_tmp
                 
    return answer    
                      
def combined(str1, str2):
    list1 = list(map(int, str1))
    list2 = list(map(int, str2)) 
        
    res = []
        
    for i in range(len(list1)):
        if(list1[i] == list2[i]):
            res.append(list1[i])
        else:
            res.append("2")
        
    str3 = "".join(map(str, res))
    return str3   
                           
#main        
numList = list(map(int, sys.stdin.readline().split()))
n = solution(numList)
print(n)