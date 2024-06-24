// Problem : 11의 배수
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main() {
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        string s, mok="";
        cin >> s;

        while(s.length() > 2) {
            char end = s.back();
            mok += end;
            s.pop_back();
            char nextEnd = s.back();
            s.pop_back();

            if(nextEnd-end < 0) {
                int pos;
                if(s[s.length()-1] == '0') {
                    for(pos=s.length()-2; s[pos]=='0'; pos--) s[pos] = '9';
                    s[pos] -= 1;
                }

                s[s.length()-1] = (char)((s[s.length()-1]-'0'+9)%10+48);
                s += to_string(10 + nextEnd - end);

            } else s += to_string(nextEnd-end);
        }

        if(s.length() == 2 && s[0] == s[1]) {
            string answer = "";

            if(s[0]!='0') answer += s[0];

            for(int i=mok.length()-1; i>=0; i--) {
                answer += mok[i];
            }
            cout << answer << endl;
        }
        else cout << 0 << endl;
    }
    return 0;
}