// Problem : 끝자리 숫자 계산하기
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(void){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int numData;
        cin >> numData;
        
        int arrayNum[numData];
        int multiply = 1;

        for(int j=0; j<numData; j++){
            cin >> arrayNum[j];
        }
        
        for(int k=0; k<numData; k++){
            multiply *= arrayNum[k]%10;
            multiply = multiply%10;
        }

        cout << multiply << endl;
    }
    return 0;
}