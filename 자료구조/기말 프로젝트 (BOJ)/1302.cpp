#include <iostream>
#include <map>
using namespace std;

int main(){
    int TestCase;
    int maxNum = 0;

    cin >> TestCase;
    map<string, int> m;

    for(int i=0; i<TestCase; i++){
        string name;
        cin >> name;
        m[name]++;
    }

    auto it = m.begin();
    for(; it != m.end(); it++) maxNum = max(maxNum, (*it).second);
    for(it = m.begin(); it != m.end(); it++){
        if(maxNum == (*it).second){
            cout << (*it).first;
            return 0;
        }
    }
}