package level1;

public class diec2 {public static void main(String[] args) {
	//6면인 주사위를 5회 굴려서 나온 합계수를 구하시오
	//(int) (Math.random()*최댓값)+최소값
	int result = 0;
	for(int i= 0; i<5; i++) { //5번실행
	double d = Math.random();
	int temp = (int)(d*6)+1; //랜덤으로 1-6 정수값
	System.out.print(temp);
	result+=temp;
	}
	
	System.out.print("Sum : "+result);
	
	//홀수노알때까지 주사위 굴려 합하는 프로그래밍
	// Random random = new Random();
	
}

}
