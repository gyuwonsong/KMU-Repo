// Problem : 주어진 정수의 최대, 최소 구하기
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(void){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int numData;
        cin >> numData;

        if (numData<1 || numData>100) break;

        int arrayNum[numData], max, min;

        for(int j=0; j<numData; j++){
            cin >> arrayNum[j];
        }
        
        max = arrayNum[0];
        min = arrayNum[0];
        for(int k=0; k<numData; k++){
            if(arrayNum[k] > max){
                max = arrayNum[k];
            }
            if(arrayNum[k] < min){
                min = arrayNum[k];
            }
        }
        cout << max << " " << min << endl;
    }
    return 0;
}