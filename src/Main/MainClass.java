package Main;

import java.util.Scanner;

import login.Login;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main인 시작");
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.로그인 2.회원관리");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				Login lo = new Login();
				lo.login();
				break;
			case 2 : break;
			}
		}
	}

}
