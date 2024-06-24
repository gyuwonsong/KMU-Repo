#include <iostream>
using namespace std;

class A{
    int p;
public:
    int getP(){
        return p;
    }

    int setP(int v){
        p = (v<0) ? 0 : v;
    }
};

A a2;
int main(){
    A a1;

    cout << a1.getP() << endl;
    cout << a2.getP() << endl;

    return 0;
}