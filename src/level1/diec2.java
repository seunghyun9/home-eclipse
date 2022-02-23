package level1;

import java.util.Random;

public class diec2 {public static void main(String[] args) {
	// 홀수나올때까지 주사위굴려 합하는 프로그래밍
	// Random random = new Random();
	Random random = new Random();
	double doub = Math.random();
	int player =  (int)(doub*6)+1;
	int com = random.nextInt(5)+1;
	String s = "비김";
	if(player==com) {
		}else if(player<com) {
		s="패배";}
	else if(player>com) {
		s="승리";}
	System.out.print(s);
	
	
	
	int p2=(int)(Math.random()*6)+1;
	System.out.println("플레이어 숫자"+p2);
	int c2= new Random().nextInt(5)+1;
	System.out.println("컴퓨터 숫자"+c2);
	String s2 = "비겼다.";
	if(p2!=com) s = (p2>c2) ? "이겼다." : "졌다.";
	System.out.println(s2);
	
	

}}
