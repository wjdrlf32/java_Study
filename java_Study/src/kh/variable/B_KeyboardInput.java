package com.kh.variable;

import java.util.Scanner; // 1�ܰ� ��!

public class B_KeyboardInput {
	/*
	 * Ű���׷κ��� ������� �Է� ���� ��������?
	 * System.out
	 * �ڹٿ��� �̹� �����ϰ� �ִ� java.util. Scanner ��� Ŭ������ ����ϸ� ��!
	 * Scanner Ŭ�����ȿ� �ִ� �޼ҵ带 ȣ���ؼ� ���!
	 */
	public void inputTest() {
	
		Scanner sc = new Scanner(System.in);
	    // System.in : �Է¹��� ������ �޾Ƶ��̰ڴ�.(����Ʈ������)
		
		// ������� ���������� �Է¹޾� ����غ���
		
		// �Է¹ް��� �ϴ� ������ ���� �����ؼ� �Է��� ����
		System.out.println("����� �̸��� �����Դϱ�? : ");
		
		//����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�
		// nextLine(), next()

		// nextLine() : ����ڰ� �Է��� �� �� ���鿡 �����ϰ� �� ������ �� �о�� ���๮�� ������
		
		// sc.nextLine() : ���ۿ��� ���� ���������� ��� ���� ������ ��
		// " ���� " �� ����ִ� ����
		// next() : ����ڰ� �Է��� �� �� ������ ������� ���� ���������� �Է� ����
		String name = sc.next();
		System.out.println(name + "�� �ȳ��ϼ���!");
		
		// sc.nextInt();
		// sc.nextDouble();
		
		System.out.println("����� ���̴� ����Դϱ�? : ");
		int age = sc.nextInt();
		
		System.out.println("����� ���̴�" + age + "�� �Դϴ�.");
		
		System.out.println("����� Ű�� ��� �Ǽ���??(�Ҽ��� ù°�ڸ����� �Է����ּ���) : ");
	    double height = sc.nextDouble();
	    System.out.println("����� Ű��" + height + "�Դϴ�.");
	    
	    sc.nextLine();
	    System.out.println("�ּҰ� ��� �Ǽ���?");
	    String address = sc.nextLine();
	    System.out.println("�ּ�" + address);
	
	}
	

}
