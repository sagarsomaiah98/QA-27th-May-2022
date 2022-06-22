package Operators;

public class Variable_Values2 {

	public static void main(String[] args) {
		
		int balance= 500000;
		
		balance= balance+2000;//
		
		
		
		int R= 10;
		
		int S= 30;
		
		
		R=S*0; //  0
		S= R+S;// 30
		
		R=S+100;//  130
		
		System.out.println(R);//     130
		S=R-90;//  130-90 = 40
		
		R=S*R;//  130*40  =5200
		System.out.println(R);  //   5200   
		S=S*R*R;// 40*5200*5200
		
		System.out.println(S);  // 1081600000
		
		

	}

}
