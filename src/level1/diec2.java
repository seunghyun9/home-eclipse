package level1;

import java.util.Random;

public class diec2 {public static void main(String[] args) {
	// Ȧ�����ö����� �ֻ������� ���ϴ� ���α׷���
	// Random random = new Random();
	Random random = new Random();
	double doub = Math.random();
	int player =  (int)(doub*6)+1;
	int com = random.nextInt(5)+1;
	String s = "���";
	if(player==com) {
		}else if(player<com) {
		s="�й�";}
	else if(player>com) {
		s="�¸�";}
	System.out.print(s);
	
	
	
	int p2=(int)(Math.random()*6)+1;
	System.out.println("�÷��̾� ����"+p2);
	int c2= new Random().nextInt(5)+1;
	System.out.println("��ǻ�� ����"+c2);
	String s2 = "����.";
	if(p2!=com) s = (p2>c2) ? "�̰��." : "����.";
	System.out.println(s2);
	
	

}}
