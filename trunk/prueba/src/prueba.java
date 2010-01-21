import java.util.Scanner;


public class prueba {
	
	public static void main(String[] args) {
		int a= 1;
		int b= 0;
		int num;
		Scanner n = new Scanner(System.in);
		System.out.println("pon un numero");
		//1,1,2,3,5,8,13
		num=n.nextInt();
		for(int i=0;i<num;i++){
			System.out.println(a+b);
			b+=a;
			a=b-a;
			
		}
//		while(a<num){
//			
//		}
//			
		
		
	}
	static int mult(int a,int b){
		
		return mult(a,b);
	}
}
