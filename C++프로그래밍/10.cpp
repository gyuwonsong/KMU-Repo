// Problem : 주가 분석(1)
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int numData, num1, num2;
        cin >> numData >> num1;

        bool check = false;
        int beforeNum = num1;
        int cnt = 0;

        for(int j=0; j<numData-1; j++){
            cin >> num2;

            if(num2 > beforeNum){
                beforeNum = num2;
                check = true;
            }
            else if(num2 < beforeNum){
                beforeNum = num2;
                if(check == true){
                    cnt++;
                    check = false;
                }
                else{
                    check = false;
                }
            }
            else if(num2 == beforeNum){
                continue;
            }
        }
        cout << cnt << endl;
    }
}