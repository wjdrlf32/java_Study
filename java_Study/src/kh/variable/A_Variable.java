package com.kh.variable;

public class A_Variable {
    // ������ �ʿ伺
	// �ֱ� ����� �غ����???
	
	public void calPay() {
		System.out.println("------������ ����ϱ� ��---------");
		
		System.out.println("�ñ� : 9160��");
		System.out.println("�ٹ� �ð� : 8�ð�");
		System.out.println("�ٹ� ���� : 5��");
		
		// �ֱ� = �ñ� X �ٹ��ð� X �ٹ�����
		// ������� XXX : 00000�� �������� ���!
		// ���ڿ��� �ֵ���ǥ�� ��� ó���Ѵ�.
		// �ڹٿ��� + ��ȣ�� ���� ���� ���� �� ���
		// �ڹٿ��� * ��ȣ�� ���ϱ⸦ �� �� ���
		
		System.out.println("������ : " + 21143 * 8 * 5 + "��");
		System.out.println("��� : " + 21143 * 8 * 5 + "��");
		System.out.println("���� : " + 21143 * 8 * 5 + "��");
		System.out.println("������ : " + 21143 * 8 * 5 + "��");
		System.out.println("�̽�ö : " + 21143 * 8 * 5 + "��");
		
		
		System.out.println("------������ ����ϱ� ��---------");
		
		// ������ �ñ�, �ٹ��ð�, �ٹ��ϼ���� ���� ���� ���� �� ������ ����� ���� ��´�.
		int pay = 15000; //�ñ�
		int time = 8; //�ٹ� �ð�
		int day = 5; // �ٹ� �ϼ�
		
		System.out.println("�ñ� : " + pay + "��");
		System.out.println("�ٹ� �ð� : " + time + "�ð�");
		System.out.println("�ٹ� �ϼ� : " + day + "��");
		
		
		System.out.println("�ѿ��� : " + pay * time * day + "��");
		System.out.println("�ֺ��� : " + pay * time * day + "��");
		System.out.println("����� : " + pay * time * day + "��");
		System.out.println("�Ǽ��� : " + pay * time * day + "��");
		
		/* 
		 * 
		 * ������ ����ϴ� ����
		 * 
		 * 1. ������ ���� �ǹ̸� �ο��ϱ� ���� ��� => ������ ������
		 * 2. �� �ѹ��� ���� ��������ν� �ʿ��Ҷ����� ������ ���� => ���뼺 ������
		 * �������� ���뼺�� ���������ν� �������� ��������
		 * 
		 */
	} // calpay() ���� �� 
	
	// ������ ����
	public void declareVariable() {
		
		/*
		 * ���� ���� ���
		 * int pay;
		 * 
		 * ����Ÿ��(�ڷ���) �����̸�;
		 * ���� Ÿ���� ������ ������ ���� �Ѳ����� ������ �� ����ex) int pay, dat, time;
		 * ������ �����ϰ� �� �ڿ� ó�� ���� �����ϴ°��� �ʱ�ȭ(initialization
		 * �ʱ�ȭ�� �����Ͽ� �־��� ���� �ʱⰪ�̶�� ��
		 */
		
		//Ststem.out.println(pay); ������ {} �߰�ȣ �ȿ��� ����ǰ� ����
		
		/*
		 * �ĺ���(Identifier)
		 * 
		 * Ŭ������, �޼ҵ��, ������� ����ڰ� ���� �̿��ϴ� ������ �̸�
		 * 
		 * 
		 * - �ĺ��ڸ� ������ �� �� ���Ѿ��ϴ� ��Ģ(����Ű�� �ȸ������)
		 * 1. ��, �ҹ��ڸ� �����ϰ� ���������� ����
		 * 2. ����, ����, ( _ ), $�� �ĺ��� ������ �� ����
		 * 3. ����, ( _ ), $�� ������ �� ����
		 * 4. ������ ������ �� ����
		 * 5. Ű����(�����)�� �ĺ��ڷ� ����Ϸ� �� ����
		 * 
		 * 
		 * - �ĺ��� �̸� ��Ģ(�����ڵ鳢�� ���)
		 * 
		 * 1. Ŭ����/�������̽� �̸� ��Ģ
		 * 
		 * - ���, ����縦 ���������� �����ؼ� ���
		 * - ù ���ڸ� �빮�ڷ� ǥ��
		 * - ����� �ܾ���� ù���ڵ� �빮�ڷ� ǥ��
		 * 
		 * ex ) HelloWorld
		 * 
		 * 2. ���� �̸� ��Ģ
		 * 
		 * - ����� �ǹ̸� ���� ����
		 * - ù���ڸ� �ҹ��ڷ� ǥ��, ����ȴܾ���� �빮�ڷ� ǥ��
		 * 
		 * ex ) phoneNumber
		 * 
		 * 3. �޼ҵ� �̸� ��Ģ
		 * 
		 * - ������ �ǹ̸� ���� ����
		 * - ù ���ڴ� �ҹ��ڷ� ǥ��, ����� �ܾ���� �빮�ڷ� ǥ��
		 * - �޼ҵ���� ������ ���ϵڿ� �ѽ��� ��ȣ"()"�� ����
		 * - �޼ҵ���� �Ϲ�������(_) ������� ����
		 * 
		 * ex ) calPay(), join()
		 * 
		 * 4. ��� �̸� ��Ģ
		 * 
		 * - ��� ���ڸ� �빮�ڷ� ǥ��
		 * - �ܾ�� �ܾ���̴� (_)�� ����ؼ� �����Ѵ�.
		 * 
		 * ex ) LOGIN_OK
		 */
		
		// ������ �ڷ��� 
		
		/*
		 * 1. ���� �ڷ��� ( ���� : true, false
		 * ���� �ڷ������� true, false�� ������
		 */
		
		boolean isTrue; // 1byte
		isTrue = true;
		boolean isFalse = false;
		
		/*
		 * 2. ������ �ڷ���
		 * 
		 * ���������� 4���� ������ ���� 
		 * ������ ������ byte, short, int, long���� �ְ� int���� �ַ� ����ϸ� �ȴ�.
		 * �������� �⺻���� int�̰� long���� ����Ҷ��� �Ҵ��� ���� �ڿ� "L"�� �ٿ��� ��
		 * 
		 * 
		 * 
		 * �Ǽ��� 2���� ������ ����
		 * �Ǽ��� ������ float, double�̶�� Ű���带 ����ϰ� double�� �����
		 * float���� ����Ϸ��� �Ҵ��� ���� �ڿ�"F"�� �ٿ�����
		 * 
		 */
		
		// 2_1. ������
		
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 3; // 3byte
		long lNum = 4L; // 8byte
		
		// 2_2. �Ǽ���
		
		float fNum = 2.22f; // 4byte
		double dNum = 3.3333; // 8byte
		
		// ���� int num = 99_999_999; �̷������� �ۼ� ����
		
		// 3. ������
		
		char ch;
		ch = 'a'; // ���Ϲ��ڿ��� �ݵ�� Ȧ����ǥ�� �ٿ��ش�.
		
		// 4. ���ڿ��� : �����ڷ��� => �ּҸ� ��´�!
		String str;
		
		str = "abc";
		
		// 1. 9���� �ڷ����� ������
		// 2. 9���� ���� �ʱ�ȭ�� ������
		// 3. 9���� ���� ����� ������ Ȯ���غ���!!!!!!
		// �����̸� : XX
	
		System.out.println ("isTrue : " + isTrue);
		System.out.println ("isFalse : " + isFalse);
		System.out.println ("bNum : " + bNum);
		System.out.println ("bNum : " + sNum);
		System.out.println ("bNum : " + iNum);
		System.out.println ("bNum : " + lNum);
		System.out.println ("bNum : " + fNum);
		System.out.println ("bNum : " + dNum);
		System.out.println ("ch : " + ch);
		System.out.println ("str : " + str);
		
		
		// ��¹��� ����!
		// 1. System.out.println(); => ��°� �ٹٲ�����
		// 2. System.out.print(); => �ٹٲ��� ���� �ʴ´�
		// 3. System.out.printf("����ϰ��� �ϴ� ������ ����"); => f�� format, �ٹٲ��� ������ ����
		// => ������ ������ �Ų� ������ ������ ����, ������ ��Ȯ�ؾ��Ѵ�.
		
		System.out.printf("isTrue�� ���� %b�Դϴ�.\n", isTrue);
		System.out.printf("isFalse�� ���� %b�Դϴ�.\n", isFalse);
		// %b : true, false ���� ������ ���� �� �ְ� �վ��ִ� ����
		
		System.out.printf("sNume�� ���� %d�Դϴ�. \niNum�� ���� %d�Դϴ�.\n", sNum, iNum);
		// %d : byte, short, int, long ������ ������ ���� �� �ְ� �շ��ִ� ����
		
		System.out.printf("fNum : %f\ndNum : %f\n", fNum, dNum);
		//%f : float, double �Ǽ��� ������ ���� �� �Ұ� �վ��ִ� ����
		// �Ҽ��� �Ʒ� 7��°���� �ݿø��Ǽ� 6���������� ����� �Ǵ� ����
		// %.1f : �Ҽ��� �Ʒ����� 2��°���� �ݾ󸲵Ǿ� 1��°������ ����� �Ǵ� ����
		
		// %c, %C, %s, %S
		
		System.out.println("rogoddms \\n�� ����մϴ�.");
	}
	// ��� : �������� ���� ����
	
	public void constant() {
		
		int khNum;
		khNum = 1;
		System.out.println(khNum);
		khNum = 2;
		System.out.println(khNum);
		
		// ��� : 1760����� ������ �⵵������ ����ϴ� �޼ҵ�
		// [ǥ����] final �ڷ��� ����̸�;
		
		final int START_YEAR = 1760;
		
		double PI = 3.14;
	}
	
	
	
} // Ŭ���� ���� ��
