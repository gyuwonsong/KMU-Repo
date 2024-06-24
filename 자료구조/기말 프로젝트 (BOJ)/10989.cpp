#include <iostream>
using namespace std;

int main(){
    int TestCase, num;
    scanf("%d", &TestCase);

    int arr[10001] = {0};

    for(int i=0; i<TestCase; i++){
        scanf("%d", &num);
        arr[num]++;
    }

    for(int i=0; i<10001; i++){
        for(int j=0; j<arr[i]; j++){
            printf("%d\n", i);
        }
    }
}