// Problem : 숫자 정사각행렬 달팽이 모양 출력하기 
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int n, a, b;
        cin >> n >> a >> b;

        int arr_1[n*n]; 
        int count = n; 
        int value = 0;
        int index = 0;
        while(count > 0){
            for(int i=0; i<count; i++){
                value++;
                arr_1[index] = value; 
                index++; 
            }
            count--; 

            for(int i=0; i<count; i++){
                value += n; 
                arr_1[index] = value;
                index++;
            }

            for(int i =0; i<count; i++){
                value--; 
                arr_1[index] = value; 
                index++;
            }
            count--;

            for(int i =0 ; i<count; i++){
                value -= n; 
                arr_1[index] = value;
                index++; 
            }
        }
        for(int i=a-1; i<b; i++)
            cout << arr_1[i] << " ";  
        cout <<endl ; 
    }
        
    return 0; 
}