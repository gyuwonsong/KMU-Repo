#include <iostream>
using namespace std;
#define MAX 500000

int arr[MAX];

int find(int n){
    if(n == arr[n]){
        return n;
    }

    return arr[n] = find(arr[n]);
}

int unionn(int a, int b){
    a = find(a); b = find(b);

    if(a != b){
        arr[a] = b;
        return 1;
    }

    return 0;
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int n, m;
    cin >> n >> m;

    for(int i=0; i<n; i++) arr[i] = i;

    for(int i=1; i<m+1; i++){
        int a, b;
        cin >> a >> b;

        int tmp1 = find(a);
        int tmp2 = find(b);

        if(unionn(tmp1, tmp2) == 0){
            cout << i << "\n";
            return 0;
        }
        else if(i == m) cout << 0 << "\n";
    }
}