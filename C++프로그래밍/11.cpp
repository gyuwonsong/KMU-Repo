// Problem : 정사각형 출력(3) 
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases, num;
    cin >> numTestCases;

    for(int k=0; k<numTestCases; k++){
        cin >> num;
        char array[num][num];

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                array[i][j] = '.';
            }
        }

        for(int j=0; j<num; j++){
            if(j == 0){
                array[j][j] = '+';
            }
            else if(j == num/2 || j == num-1){
                array[0][j] = '+';
                array[j][0] = '+';
            }
            else{
                array[0][j] = '-';
                array[j][0] = '|';

                array[num/2][j] = '-';
                array[j][num/2] = '|';
            }
        }

        for(int j=num-1; j>0; j--){
            if(j == num-1){
                array[j][j] = '+';
            }
            else if(j == num/2){
                array[num-1][j] = '+';
                array[j][num-1] = '+';
            }
            else{
                array[num-1][j] = '-';
                array[j][num-1] = '|';
            }
        }
        
        for(int j=0; j<num; j++){
            if(j == 0 || j == num/2 || j == num-1){
                continue;
            }
            else{ // 1245
                array[j][j] = '\\';
                array[j][num-1-j] = '/';
            }
        }

        array[num/2][num/2] = '*';

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                cout << array[i][j];
            }
        cout << endl;
        }
    }
}