package com.yedam.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		//이차원 배열 -> 데이터 입력 -> 하나씩 loading
//		int[][] intAry = {{1, 2}, {1, 2, 3}};
//		
//		int[][] mathScore = new int[2][3];
//		for(int i=0; i<mathScore.length; i++) {
//			System.out.println(mathScore.length);
//			for(int k=0; k<mathScore[i].length; k++) {
//				System.out.println("mathScore[" + i + "][" + k + "] = " + mathScore[i][k]);
//			}
//		}

		//2차원 배열에 구구단 결과값 저장
		//[ [2단],[3단],[4단],......[],[],[9단] ]
		//8개 -> 9개의 데이터를 담을 수 있게 
		//new int [8][9];
		
//		int[][] gugu = new int [8][9];
//		
//		//단수를 의미 2단, 3단..
//		for(int i=2; i<10; i++) {
//			//각 단수마다 곱셉하는 구간
//			for(int j=1; j<10; j++) {
//				//gugu[0][0] =. 2*1
//				gugu[i-2][j-1] = i*j;
//			}
//		}
//		
//		//배열에 저장된 내용 출력
//		for(int i=0; i<gugu.length; i++) {
//			System.out.print((i+2) + "단 : ");
//			//toString() : 선택된 배열의 정보를 출력하는 메소드(함수)
//			System.out.print(Arrays.toString(gugu[i]));
//			System.out.println();
//		}
		
		//참조 타입 배열
//		String[] strArray = new String[3];
//		strArray[0] = "yedam";
//		strArray[1] = "yedam";
//		strArray[2] = new String("yedam");
//		
//		//String의 주소값 비교
//		System.out.println(strArray[0] == strArray[1]);
//		System.out.println(strArray[0] == strArray[2]);
//		//String의 data비교
//		System.out.println(strArray[0].equals(strArray[2]));
		
		//배열복사
//		int[] oldArray = { 1, 2, 3};
//		int[] newArray = new int [5];
//		
//		for(int i=0; i<oldArray.length; i++) {
//			newArray[i] = oldArray[i];
//		}
//		
//		for(int i=0; i<newArray.length; i++) {
//			System.out.println(newArray[i]);
//		}
//		
		
		int[] oldArray2 = { 1, 2, 3, 4, 5, 6, 7};
		int[] newArray2 = new int[10];
		
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		
//		for(int i=0; i<newArray2.length; i++) {
//			System.out.println(newArray2[i]);
//		}
		
		for(int temp: newArray2) {
			System.out.print(temp + "\t");
		}
		
	}

}
