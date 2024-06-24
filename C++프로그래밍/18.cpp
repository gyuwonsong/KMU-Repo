// Problem : 행렬 곱셈
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main() {
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int r, s, t;
        cin >> r >> s >> t;

        int arr1[r][s], arr2[s][t], result[r][t];
        int sum = 0;

        for(int j=0; j<r; j++){
            for(int k=0; k<s; k++){
                int number1;
                cin >> number1;

                arr1[j][k] = number1;
            }
        }

        for(int l=0; l<s; l++){
            for(int m=0; m<t; m++){
                int number2;
                cin >> number2;

                arr2[l][m] = number2;
            }
        }

        for (int n = 0; n < r; n++) {
            for (int p = 0; p < t; p++) {
                for (int q = 0; q < s; q++) {
                    sum += arr1[n][q] * arr2[q][p];
                }
                result[n][p] = sum;
                sum = 0;
		    }
	    }

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < t; col++) {
                cout << result[row][col] << ' ';
            }
		    cout << endl;
	    }
    }
}