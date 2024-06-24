#include <iostream>
#include <list>
using namespace std;

int main(){
    int TestCase;
    cin >> TestCase;

   for(int i=0; i<TestCase; i++){
        string str;
        cin >> str;

        list<char> li;
        auto it = li.begin();

        for(int j=0; j<str.length(); j++){
            if(str[j] == '<'){
                if(it != li.begin()){
                    it--;
                }
                else continue;
            }
            else if(str[j] == '>'){
                if(it != li.end()){
                    it++;
                }
                else continue;
            }
            else if(str[j] == '-'){
                if(it != li.begin()) it = li.erase(--it);
                else continue;
            }
            else li.insert(it, str[j]);
        }

        it = li.begin();
        for(; it != li.end(); it++){
            cout << *it;
        }
        cout << endl;
    }
}