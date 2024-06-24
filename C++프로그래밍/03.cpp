// Problem : 시침과 분침 사이각 구하기 
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int angleClock(int h, int m);

int main(void){
    int numTestCases, h, m;

    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        cin >> h >> m;
        cout << angleClock(h, m) << endl;
    }
    return 0;
}

int angleClock(int h, int m){
    double hour, minute, answer;

    hour = h*30+m*0.5;
    minute = 6*m;
    
    if(hour > minute){
        answer = hour-minute;
    }
    if(minute > hour){
        answer = minute-hour;
    }
    if(answer > 180) return (int)360-answer;
    else return (int)answer;
}
