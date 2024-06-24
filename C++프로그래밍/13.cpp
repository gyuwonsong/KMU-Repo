// Problem : 두 구간(interval)이 차지하는 길이 구하기
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int a, b, c, d, all, part;
        cin >> a >> b >> c >> d;

        if(a < c){
            if(a <= c && c < b){
                part = b - c;
            }
            else part = 0;
        }
        else if(a > c){
            if(c <= a && a < d){
                part = d - a;
            }
            else part = 0;
        }

        if(b+1 == d || d+1 == b){
            part--;
        }

        all = (b - a) + (d - c) - part;

        cout << part << " " << all << endl;
    }
}