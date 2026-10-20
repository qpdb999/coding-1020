import java.util.Scanner;

public class TEST2 {

	public static void main(String[] args) {
		for(int num = 1; num <= 9; num++){
            for(int dan = 2; dan <= 9; dan++){
                System.out.print(dan + "*" + num + "=" + dan*num + "\t");
            }
            System.out.println();}
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("===계산기===");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 계산 종료");
		System.out.println("메뉴 선택:");
		
		int opter = sc.nextInt();
		
		int sum = 0;
		int sub = 0;
		int mul = 1;
		int div = 0;
		if(opter == 0) { 
			break;}
			else {
		switch(opter) {
				
			case 1:
				
				System.out.println("값을 입력하세요");
				
				int num1 = sc.nextInt();
				
				System.out.println("2번째 값을 입력하세요");
				
				int num2 = sc.nextInt();
				
				sum = num1 + num2;
				
				System.out.println("값은 " + sum);
				break;
				
			case 2:
				
				System.out.println("값을 입력하세요");
				
				 num1 = sc.nextInt();
				
				System.out.println("2번째 값을 입력하세요");
				
				 num2 = sc.nextInt();
				
				sum = num1 - num2;
				
				System.out.println("값은 " + sum);
				break;
				
			case 3:
				
				System.out.println("값을 입력하세요");
				
				num1 = sc.nextInt();
				
				System.out.println("2번째 값을 입력하세요");
				
				num2 = sc.nextInt();
				
				sum = num1 * num2;
				
				System.out.println("값은 " + sum);
				break;
				
			case 4:
				
				System.out.println("첫번째 값을 입력하세요");
		
				 num1 = sc.nextInt();
				 
				 System.out.println("두번째 값을 입력하세요");
				 
				 num2 = sc.nextInt();
		
				 if(num1 == 0 || num2 == 0) {
					 System.out.println("0은 나눌수 없습니다 다시 입력해주세요");
					 
				 }else {
					 div = num1 / num2;
					 System.out.println("값은 " + div);
				 }
		
		
		
		
		
		        }
	        }
	    }
	}
}