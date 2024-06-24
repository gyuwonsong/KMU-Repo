// Problem : 오셀로(Othello) 게임
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

void check(char arr[][8], int row, int col, char stoneColor){
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){ //1
        if(arr[i][j] == '+') break;
        if(arr[i][j] == stoneColor){
            for(int k=row, l=col; k>i && l>j; k--, l--) arr[k][l] = stoneColor;
            break;
        }
    }

    for(int i=row-1; i>=0; i--){ //2
        if(arr[i][col] == '+') break;
        if(arr[i][col] == stoneColor){
            for(int j=row; j>i; j--) arr[j][col] = stoneColor;
            break;
        }
    }

    for(int i=row-1, j=col+1; i>=0 && j<8; i--, j++){ //3
        if(arr[i][j] == '+') break;
        if(arr[i][j] == stoneColor){
            for(int k=row, l=col; k>i && l<j; k--, l++) arr[k][l] = stoneColor;
            break;
        }
    }

    for(int i=col-1; i>=0; i--){ //4
        if(arr[row][i] == '+') break;
        if(arr[row][i] == stoneColor){
            for(int j=col; j>i; j--) arr[row][j] = stoneColor;
            break;
        }
    }

    for(int i=col+1; i<8; i++){ //6
        if(arr[row][i] == '+') break;
        if(arr[row][i] == stoneColor){
            for(int j=col; j<i; j++) arr[row][j] = stoneColor;
            break;
        }
    }

    for(int i=row+1, j=col-1; i<8 && j>=0; i++, j--){ //7
        if(arr[i][j] == '+') break;
        if(arr[i][j] == stoneColor){
            for(int k=row, l=col; k<i && l>j; k++, l--) arr[k][l] = stoneColor;
            break;
        }
    }

    for(int i=row+1; i<8; i++){ //8
        if(arr[i][col] == '+') break;
        if(arr[i][col] == stoneColor){
            for(int j=row; j<i; j++) arr[j][col] = stoneColor;
            break;
        }
    }

    for(int i=row+1, j=col+1; i<8 && j<8; i++, j++){ //9
        if(arr[i][j] == '+') break;
        if(arr[i][j] == stoneColor){
            for(int k=row, l=col; k<i && l<j; k++, l++) arr[k][l] = stoneColor;
            break;
        }
    }
}

int main() {
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        char arr[8][8];
        for(int k=0; k<8; k++){
            for(int l=0; l<8; l++){
                arr[k][l] = '+';
            }
        }

        arr[3][3] = arr[4][4] = 'O';
        arr[3][4] = arr[4][3] = 'X';
        
        int num, s, t, cnt = 0;
        cin >> num;

        for(int j=0; j<num; j++){
            char stoneColor;
            cin >> s >> t;
            s--; t--;
    
            if(cnt%2 == 0) stoneColor = 'X';
            else stoneColor = 'O';
            
            arr[s][t] = stoneColor;
            cnt++;

            check(arr, s, t, stoneColor);     
        }

        int w = 0; int b = 0;
        for(int k=0; k<8; k++){
            for(int l=0; l<8; l++){
                if(arr[k][l] == 'X') b++;
                else if(arr[k][l] == 'O') w++;
            }
        }

        cout << b << ' ' << w << endl;
        for(int k=0; k<8; k++){
            for(int l=0; l<8; l++){
                cout << arr[k][l];
            }
            cout << endl;
        }
    }
}