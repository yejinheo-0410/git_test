package Main;

import java.util.Scanner;

import Member.Member;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("main�� ����");
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.�α��� 2.ȸ������");
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
