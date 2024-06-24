// Problem : 숫자의 모든 자리수 반복 곱하기  
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int get_number(long long num){
    long long cnt = 0, result = 1;
    long long num1 = num;
    long long num2 = num;

    while(num1 > 0){
        num1 = num1/10;
        cnt++;
    }

    for(int i=0; i<cnt; i++){
        if(num2%10 == 0){
            num2 = num2/10;
        }
        else{
            result *= num2%10;
            num2 = num2/10;
        }
    }
    num = result;
    if(num < 10){
        return num;
    }
    else{
        return get_number(num);
    } 
}

int main(){
    long long numTestCases;
    cin >> numTestCases;
    
    for(int i=0; i<numTestCases; i++){
        long long n, answer;
        cin >> n;

        answer = get_number(n);

        cout << answer << endl;
    }
    return 0;
}