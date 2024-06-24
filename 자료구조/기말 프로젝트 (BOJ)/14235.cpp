#include <iostream>
#include <queue>
#include <vector>
using namespace std;

int main(){
    int TestCase, num;
    cin >> TestCase;
    
    priority_queue<int> pq;
    vector<int> v;

    for(int i=0; i<TestCase; i++){
        cin >> num;

        if(num == 0){
            if(pq.size() == 0){
                v.push_back(-1);
            }
            else{
                int tmp = pq.top();
                pq.pop();
                v.push_back(tmp);
            }
        }
        else{
            for(int j=0; j<num; j++){
                int num2;
                cin >> num2;
                pq.push(num2);
            }
        }
    }

    auto it = v.begin();
    for(; it != v.end(); it++){
        cout << *it << endl;
    }
}