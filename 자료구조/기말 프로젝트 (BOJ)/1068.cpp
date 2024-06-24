#include <iostream>
#include <vector>
using namespace std;

int cnt = 0;

void dfs(vector<vector<int>> &v, int r, int n){
    if(v[r].size() == 0){
        cnt++;
        return;
    }

    for(int i=0; i<v[r].size(); i++){
        if(v[r][i] == n){
            if(v[r].size() == 1){
                cnt++;
                return;
            }
            else continue;
        }
        else dfs(v, v[r][i], n);
    }
}

int main(){
    int TestCase, root, NodeNum;
    cin >> TestCase;

    vector<vector<int>> v(TestCase);

    for(int i=0; i<TestCase; i++){
        int tmp;
        cin >> tmp;

        if(tmp == -1) root = i;
        else v[tmp].push_back(i);
    }
    
    cin >> NodeNum;

    if(NodeNum == root) cnt = 0;
    else{
        dfs(v, root, NodeNum);
    }

    cout << cnt << "\n";
}