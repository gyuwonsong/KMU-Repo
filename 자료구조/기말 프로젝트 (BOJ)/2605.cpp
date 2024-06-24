#include <iostream>
#include <vector>
using namespace std;

int main(){
    int TestCase, num;
    cin >> TestCase;

    vector<int> v(TestCase);

    for(int i=1; i<=TestCase; i++){
        cin >> num;
        v.insert(v.begin() + num, i);
    }

    for(int i=0; i<TestCase; i++) v.pop_back();

    auto it = v.rbegin();

    for(; it != v.rend(); it++){
        cout << *it << ' ';
    }
}