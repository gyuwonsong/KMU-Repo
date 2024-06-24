#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;
#define NUM 4
#define SIZE 101

int m, n, k;
int arr[SIZE][SIZE];
bool vis[SIZE][SIZE];
int arrX[NUM] = {-1, 1, 0, 0};
int arrY[NUM] = {0, 0, -1, 1};

vector<int> sum;
queue<pair<int, int>> q;

void bfs(int x, int y){
    vis[x][y] = true;
    q.push(make_pair(x, y));

    int cnt = 0;

    while(!q.empty()){
        cnt++;
        
        x = q.front().first;
        y = q.front().second;
        q.pop();

        for(int i=0; i<NUM; i++){
            int tmpX = x + arrX[i];
            int tmpY = y + arrY[i];

            if(tmpX >= 0 && tmpY >= 0 && tmpX < m && tmpY < n){
                if(arr[tmpX][tmpY] == 0 && !vis[tmpX][tmpY]){
                    vis[tmpX][tmpY] = true;
                    q.push(make_pair(tmpX, tmpY));
                }
            }
        }
    }
    sum.push_back(cnt);
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    cin >> m >> n >> k;

    for(int i=0; i<k; i++){
        int x1, y1, x2, y2;
        cin >> x1 >> y1 >> x2 >> y2;

        for(int j=x1; j<x2; j++){
            for(int k=y1; k<y2; k++) arr[k][j] = 1;
        }
    }

    for (int i=0; i<m; i++) {
        for (int j=0; j<n; j++) {
            if (arr[i][j] == 0 && !vis[i][j]) {
                bfs(i, j);
            }
        }
    }

    sort(sum.begin(), sum.end());
    auto it = sum.begin();

    cout << sum.size() << "\n";
    for(; it != sum.end(); it++) cout << *it << " ";
}