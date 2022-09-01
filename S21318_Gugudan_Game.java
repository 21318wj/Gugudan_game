package s21318;

import java.util.*;

public class S21318_Gugudan_Game {

	public static void main(String[] args) {
		int x, y;
		Random r = new Random();
		
		x = Math.abs(r.nextInt()%9)+1;
		y = Math.abs(r.nextInt()%9)+1;
		
		if(args.length>0) {
			x = Integer.parseInt(args[0]);
		}
		
		int num = x * y;
		
		System.out.println();
		System.out.println("* ������ " + x + "�ܿ� ���� �����Դϴ�   21318-�����");
		System.out.println();
		System.out.print(x + " * " + y + " = ");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		int inputNum = Integer.parseInt(tmp);
		
		if(inputNum == num) {
			System.out.println("�¾ҽ��ϴ�!");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�. ������ " + num + "�Դϴ�.");
		}
		
	}
}
