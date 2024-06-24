// Problem : 자리수 거듭제곱수 
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int n;
        cin >> n;

        int cnt = 0;
        int tmp = n;
        while(tmp > 0){
            tmp = tmp/10;
            cnt++;
        }

        double result = 0, a;
        int b = n;
        for(int j=0; j<cnt; j++){
            a = b%10;
            result += pow(a, (double)cnt);
            b = b/10;
        }

        if(n == (int)result) cout << true << endl;
        else if(n != (int)result) cout << false << endl;
    }
    return 0;
}