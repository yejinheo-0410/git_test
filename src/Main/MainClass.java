package Main;

import java.util.Scanner;

import Member.Member;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main인 시작");
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.로그인 2.회원관리");
			num = input.nextInt();
			switch(num) {
			case 1 : break;
			case 2 : 
				Member m = new Member();
				m.member();
				break;
			}
		}
	}

}
