// Problem : 홀수 마방진
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main() {
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int num;
        cin >> num;

        int arr[num][num];

        for(int k=0; k<num; k++){ // 0으로 초기화 (배열에 숫자가 있는지 없는지 확인하는 용도)
            for(int l=0; l<num; l++){
                arr[k][l] = 0;
            }
        }

        int row = 0;
        int col = num/2;

        arr[row][col] = 1;

        for(int j=2; j<(num*num + 1); j++){
            if(row == 0 && col != num - 1){ // (나) 의 경우
                row = num - 1; // 행은 마지막으로 이동
                col++; // 열은 한 칸 옆으로

                if(arr[row][col] == 0){ // 숫자가 없으면 넣고
                    arr[row][col] = j;
                }
                else{ // 있으면 아래에다 
                    row = row + 2;
                    col--;

                    arr[row][col] = j;
                }     
            }
            else if(col == num - 1 && row != 0){ // (다) 의 경우
                row--; // 행은 한 칸 위로
                col = 0; // 열은 맨 첨으로 이동

                if(arr[row][col] == 0){ // 숫자가 없으면 넣고
                    arr[row][col] = j;
                }
                else{ // 있으면 아래에다 
                    row = row + 2;
                    col--;

                    arr[row][col] = j;
                }
            }
            else if(row == 0 && col == num - 1){ // 인덱스의 범위가 벗어날 때 >> 아래에다 숫자 넣기
                row++;
                arr[row][col] = j;
            }
            else{ // 일반적인 경우 
                row--;
                col++;

                if(arr[row][col] == 0){ // 숫자가 없으면 넣고
                    arr[row][col] = j;
                }
                else{ // 있으면 아래에다 
                    row = row + 2;
                    col--;

                    arr[row][col] = j;
                }
            }
        }

        for(int k=0; k<num; k++){
            for(int l=0; l<num; l++){
                cout << arr[k][l] << ' ';
            }
            cout << endl;
        }
    }
}