package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		int [] sales  = new int[] {
			100, 80, 90, 110 	
		};
		
		int   tot    = 0;
		/*tot 		+= sales[0];		 //tot 	= tot + sales[0];
		tot 		+= sales[1];
		tot 		+= sales[2];
		tot 		+= sales[3];
		*/
		for (int i = 0; i < sales.length; i++) {
			 tot += sales[i];
		}
		
		System.out.println(tot);
		
		//----------------------------------------------
		//.......
		double [][] salesTot = new double[][] {
		   // 1/4  2/4   3/4  4/4
			{ 100, 170,  90,  20  }  // 2022 : salesTot[0]
		,	{ 120, 101,  90,  80  }  // 2023 : salesTot[1]
		,	{ 100, 130,  190, 280 }  // 2024 : salesTot[2]
		,	{ 110, 103,  90,  280 }  // 2025 : 3
		,	{ 140, 101,  90,  70  }  // 2026 : 4
		};
		
		System.out.println("연도의 갯수:" + salesTot.length );
		System.out.println("2024년의 매출갯수" + salesTot[2].length );
		System.out.println( salesTot[3][1] );
		
		// 2024년 매출수량의 합?
		// tot += salesTot[2][0] 
		// tot += salesTot[2][1] 
		// tot += salesTot[2][2] 
		// tot += salesTot[2][3] 
		// tot += salesTot[2][4] 
		tot = 0;
		for (int j = 0; j < salesTot[2].length; j++) {
			tot+= salesTot[2][j];
		}
		System.out.println(tot);
		
	}

}

