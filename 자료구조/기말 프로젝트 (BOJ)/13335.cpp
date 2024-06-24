#include <iostream>
#include <deque>
using namespace std;

int main(){
    int n, w, l;
    int cnt = 0, weight = 0;
    cin >> n >> w >> l;

    deque<int> bridge;
    int truck[n];

    for(int i=0; i<n; i++){
        int num;
        cin >> num;
        truck[i] = num;
    }

    for(int i=0; i<n; i++){
        while(1){
            if(bridge.empty() == 1){
                bridge.push_back(truck[i]);
                cnt++; weight += truck[i];
                break;
            }

            if(bridge.size() == w){
                int ret = bridge.front();
                weight -= ret;
                bridge.pop_front();
            }
            
            if(bridge.empty() == 0){
                if(truck[i] + weight > l){
                    bridge.push_back(0);
                    cnt++;
                }
                else if(truck[i] + weight <= l){
                    bridge.push_back(truck[i]);
                    cnt++; weight += truck[i]; 
                    break;
                }
            }
        }
    }
    cnt += w;
    cout << cnt;
}