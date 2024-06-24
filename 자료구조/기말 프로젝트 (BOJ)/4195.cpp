#include <iostream>
#include <map>
#include <vector>
using namespace std;
#define MAX 200001

int m1[MAX];
int m2[MAX];

int find(int n){
    if(n == m1[n]){
        return n;
    }

    return m1[n] = find(m1[n]);
}

int unionn(int a, int b){
    a = find(a); b = find(b);

    if(a != b){
        m1[b] = a;
        m2[a] += m2[b];
        m2[b] = 1;
    }

    return m2[a];
}

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    int TestCase, num, cnt;
    cin >> TestCase;

    while(TestCase-- > 0){
        cin >> num;
        cnt = 0;

        for(int i=0; i<num * 2; i++){
            m1[i] = i;
            m2[i] = 1;
        }

        string str1, str2;
        map<string, int> m;
        map<string, int> :: iterator it;

        for(int i=0; i<num; i++){
            cin >> str1 >> str2;

            it = m.find(str1);
            if(it == m.end()) m[str1] = ++cnt;
                
            it = m.find(str2);
            if(it == m.end()) m[str2] = ++cnt;

            unionn(m[str1], m[str2]);
            cout << m2[find(m[str1])] << "\n";
        }
        m.clear();
    }
}