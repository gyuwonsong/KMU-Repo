#include <iostream>
#include <vector>
#include <queue>
using namespace std;
#define SIZE 1001
#define MAX 987654321

int n, m, start, finish;
vector<pair<int, int>> v[SIZE];
vector<int> v2(SIZE, MAX);
priority_queue<pair<int, int>> pq;


int dijkstra(){
    pq.push(make_pair(0, start));
    v2[start] = 0;

    while(!pq.empty()){
        int cost = pq.top().first;
        int curr = pq.top().second;
        pq.pop();

        if(cost > v2[curr]) continue;

        for(auto i : v[curr]){
            int cost2 = i.first + cost;
            int curr2 = i.second;

            if(v2[curr2] <= cost2) continue;

            v2[curr2] = cost2;
            pq.push(make_pair(v2[curr2], curr2));
        }
    }
    return v2[finish];
}

int main(){
    scanf("%d %d", &n, &m);

    for(int i=0; i<m; i++){
        int a, b, c;
        scanf("%d %d %d", &a, &b, &c);
        v[a].push_back(make_pair(c, b)); 
    }

    scanf("%d %d", &start, &finish);
    printf("%d\n", dijkstra());
}