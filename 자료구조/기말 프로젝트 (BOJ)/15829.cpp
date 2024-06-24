#include <iostream>
using namespace std;

int main(){
    const int M = 1234567891;

    int num;
    string str;
    cin >> num >> str;

    long long int result = 0;
    long long int tmp = 1;

    for(int i=0; i<num; i++){
        char tmp_str;
        tmp_str = str[i];

        result = (result + (tmp_str - 'a' + 1) * tmp) % M;
        tmp = (tmp * 31) % M;
    }

    cout << result;
    return 0;
}