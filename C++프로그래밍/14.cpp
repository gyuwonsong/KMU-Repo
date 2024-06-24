// Problem : 요일 계산하기
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int y, m, d;
        cin >> y >> m >> d;

        int dayNum[] = {5, 6, 0, 1, 2, 3, 4};
        int monthNum[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for(int j=1582; j<y; j++){
            if((j%4 == 0 && j%100 != 0) || (j%400 == 0)){
                sum += 366;
            }
            else{
                sum += 365;
            }
        }

        if((y%4 == 0 && y%100 != 0) || (y%400 == 0)){
            monthNum[1] = 29;
        }

        for(int k=0; k<m-1; k++) sum += monthNum[k];
        sum += d;

        cout << dayNum[(6+sum)%7] << endl;

        monthNum[1] = 28; 
    }
    return 0;
}