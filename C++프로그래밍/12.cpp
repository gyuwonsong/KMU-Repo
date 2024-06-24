// Problem : 두 사각형 면적 및 둘레 구하기
// 국민대학교 소프트웨어융합대학 소프트웨어학부 20213015 송규원

#include <iostream>
using namespace std;

int main(){
    int numTestCases;
    cin >> numTestCases;

    for(int i=0; i<numTestCases; i++){
        int fx, fy, fx1, fy1, sx, sy, sx1, sy1;
        cin >> fx >> fy >> fx1 >> fy1;
        cin >> sx >> sy >> sx1 >> sy1;

        int overlap_x, overlap_y;

        if(fx1 < sx || sx1 < fx){
            overlap_x = 0;
        }
        else{
            overlap_x = min(fx1, sx1) - max(fx, sx);
            if(overlap_x < 0) overlap_x = max(fx, sx) - min(fx1, sx1);
        }
        
        if(fy > sy1 || sy > fy1){
            overlap_y = 0;
        }
        else{
            overlap_y = min(fy1, sy1) - max(fy, sy);
            if(overlap_y < 0) overlap_y = max(fy, sy) - min(fy1, sy1);
        }

        int area, perimeter;

        area = (fx1 - fx) * (fy1 - fy) + (sx1 - sx) * (sy1 - sy) - (overlap_x * overlap_y);
        perimeter = 2 * (fx1 - fx) + 2 * (fy1 - fy) + 2 * (sx1 - sx) + 2 * (sy1 - sy) - ((overlap_x == 0 || overlap_y == 0) ? 0 : (2 * (overlap_x + overlap_y)));

        cout << area << " " << perimeter << endl;
    }
}