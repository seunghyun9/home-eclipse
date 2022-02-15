package level1;

import java.util.Random;

public class dice {public static void main(String[] args) {
	// dice5TimesSum();
			// diceUntilOddSum();
			// 플레이어(Math 랜덤값)와 컴퓨터(Random 랜덤값) 주사위 굴리기를 해 이기면 
			// "You Win!", 비기면 "Draw.", 지면 "You Lose!"를 출력하세요.
			
		}

		private static void diceUntilOddSum() {
			// 홀수나올때까지 주사위굴려 합하는 프로그래밍
			// Random random = new Random();
			Random random = new Random();
			int result = 0;
			while(true) {
				int r = random.nextInt(5)+1;
				System.out.println(" dice value : "+ r);
				if(r % 2 != 0) {
					break;
				}
				result += r;
			}
			System.out.println(result);
		}

		private static void dice5TimesSum() {
			// 6면인 주사위를 5회 굴려서 나온 합계를 구하시오.
			// (int) (Math.random() * 최댓값) + 최솟값
			int result = 0;
			for(int i=0; i<5; i++) {
				double d = Math.random();
				int temp = (int) (d * 6) +1;  // 랜덤으로 (1-6) 정수값
				System.out.println(temp);
				result += temp;
			}
			System.out.println("Sum : "+result);
		}

	}
	/**
	랜덤값을 구하는 방법은 두가지.
	 (int) (Math.random() * 최댓값) + 최솟값 -> 클래스메소드 사용
	  Random random = new Random() -> 인스턴스 메소드 방식
	  
	  
	  이 문제의 핵심은 램덤값 구하기 이다.
	  랜덤값을 구할 때 타입이 중요하다.
	  
	  자바의 타입 : 프리미티브 (소문자 int boolean double), 레퍼런스(대문자) 두가지이다.
	기본형(primitive type)
	- Boolean Type(boolean)
	- Numeric Type(short, int, long, float, double, char)
	참조형(reference type)
	- Class Type
	- Interface Type
	- Array Type
	- Enum Type
	- 그 외 다른 것들
	  
	  [정의] 캐스팅은 타입 컨버전으로 업 & 다운으로 나뉜다.
	  서브 -> 슈퍼 (업), 슈퍼 -> 서버 (다운)  이렇게 움직이는 것을 캐스팅
	  업케스팅, 다운캐스팅 이렇게 정리된다.
	  업캐스팅은 내부적으로 자동으로 이뤄진다. ( ... ) 없이 1 을 업캐스팅하면 1.0 이 된다.
	  다운캐스팅은 ( ... ) 처리를 해서 수동으로 작업한다.    
	  double d  = 5.5 일 때, (int)d 로 하면 5 가 출력된다. 이를 다운캐스팅이라 한다.
	  
	 * */