
package encapsulation;

import java.util.Scanner;

class showroom{
	int pwd;
	
	
	public void mobile(){
		
		System.out.println("enter your passward");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234) {
			System.out.println("samsung mobile 25000");
			System.out.println("apple mobile 65000");
			System.out.println("one plus mobile 30000");
		}else {
			System.out.println("Invalid passward");
		}
	}
	
	public void watch() {
		System.out.println("enter your passward");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234) {
			System.out.println("samsung watch 5000");
			System.out.println("apple watch 10000");
			System.out.println("one plus watch 4000");
			System.out.println("smart watch 2500");
		}else {
			System.out.println("Invalid passward");
		}
	}
	public void charger() {
		System.out.println("enter your passward");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234) {
			System.out.println("samsung original charger 3000");
			System.out.println("apple original charger 5000");
			System.out.println("one plus original charger 2000");
			System.out.println("smart original charger 1500");
			System.out.println("local charger 500");
		}else {
			System.out.println("Invalid passward");
		}
	}
	
	public void Earphone() {
		System.out.println("enter your passward");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1234) {
			System.out.println("samsung original Earphone 6000");
			System.out.println("apple original Earphone 8000");
			System.out.println("one plus original Earphone 4000");
			System.out.println("smart original Earphone 1500");
			System.out.println("local Earphone 500");
		}else {
			System.out.println("Invalid passward");
		}
	}	
}

public class mobileshowroom {

	public static void main(String[] args) {
		showroom sho=new showroom();
		int ch;
		
		System.out.println("enter your choice");
		System.out.println("1 mobile");
		System.out.println("2 watch");
		System.out.println("3 charger");
		System.out.println("4 Earphone");
		Scanner s1=new Scanner(System.in);

		ch=s1.nextInt();
		switch(ch) {
		case 1:sho.mobile();
		break;
		case 2:sho.watch();
		break;
		case 3:sho.charger();
		break;
		case 4:sho.Earphone();
		break;
		default:{
			System.out.println("invalid choice....");
		}
	}
}
}
