// Problem : 변수 이름
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        string var; bool checkNum, checkSymbol;
        cin >> var;

        for(char j=48; j<58; j++){
            if(var[0] == j){
                checkNum = 0;
                break;
            }
            else{
                checkNum = 1;
            }
        }

        char symbolArr[] = {33, 34, 35, 36, 37, 38, 39, 40,
                            41, 42, 43, 44, 45, 46, 47, 58, 
                            59, 60, 61, 62, 63, 64, 91, 92,
                            93, 94, 96, 123, 124, 125, 126};

        for(int k=0; k<var.size(); k++){
            for(int l=0; l<sizeof(symbolArr); l++){
                if(var[k] == symbolArr[l]){
                    checkSymbol = 0;
                    break;
                }
                else{
                    checkSymbol = 1;
                }
            }
            if(!checkSymbol) break;
        }
        cout << (checkNum && checkSymbol) << endl;
    }
}