public class Practice3_2 {
	public static void main (String[] args) {
		int intArray[][] = new int[4][6];

		
		// 2차원 배열의 모든 원소를 0으로 초기화 
		
		for (int i=0 ; i<intArray.length ; i++) {
			for (int j=0 ; j<intArray[0].length ; j++) {
				intArray[i][j] = 0;
		}
		}
				
		// 배열의 12개 랜덤 위치에 랜덤한 양의 정수(1~10) 생성 저장
		
		int size1 = intArray.length;
		int size2 = intArray[0].length;
		
		for (int k=0 ; k<12 ; k++) {
			   int a = (int)(Math.random()*size1);
			   int b = (int)(Math.random()*size2);
			   
			   if (intArray[a][b] == 0) {
			      intArray[a][b] = (int)(Math.random()*10+1);
			   }
			   else {
				   k--;
			   }
			}
		
		// 2차원 배열 출력
		
		for (int l=0 ; l<intArray.length ; l++) {
			for (int s=0 ; s<intArray[0].length ; s++) {
				System.out.print(intArray[l][s]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}

