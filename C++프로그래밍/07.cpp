// Problem : 숫자 정사각형 출력하기(1) 
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main() {
    int numTestCases, num;
    cin >> numTestCases;

    while(numTestCases--){
        cin >> num;
        int array[num][num];

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                array[i][j] = 0;
            }
        }

        int border = 0, count;

        if(num%4 == 3) count = 1;
        else count = 0;

        while(border < num){
            if(count == 1){
                int size = num - border*2;
                int tmp1 = border;
                int tmp2 = tmp1 + size - 1;

                for(int i=0; i<size; i++){
                    array[tmp1][tmp1 + i] = 1;
                    array[tmp1 + i][tmp1] = 1;
                }
                for(int i=0; i<size; i++){
                    array[tmp2][tmp1 + i] = 1;
                    array[tmp1 + i][tmp2] = 1;
                }
                count = 0;
            }
            else{
                count = 1;
            }
            border++;
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                cout << array[i][j];
            }
        cout << endl;
        }  
    }
}