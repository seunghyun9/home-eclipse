package level1;

import java.util.Random;

public class dice {public static void main(String[] args) {
	// dice5TimesSum();
			// diceUntilOddSum();
			// �÷��̾�(Math ������)�� ��ǻ��(Random ������) �ֻ��� �����⸦ �� �̱�� 
			// "You Win!", ���� "Draw.", ���� "You Lose!"�� ����ϼ���.
			
		}

		private static void diceUntilOddSum() {
			// Ȧ�����ö����� �ֻ������� ���ϴ� ���α׷���
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
			// 6���� �ֻ����� 5ȸ ������ ���� �հ踦 ���Ͻÿ�.
			// (int) (Math.random() * �ִ�) + �ּڰ�
			int result = 0;
			for(int i=0; i<5; i++) {
				double d = Math.random();
				int temp = (int) (d * 6) +1;  // �������� (1-6) ������
				System.out.println(temp);
				result += temp;
			}
			System.out.println("Sum : "+result);
		}

	}
	/**
	�������� ���ϴ� ����� �ΰ���.
	 (int) (Math.random() * �ִ�) + �ּڰ� -> Ŭ�����޼ҵ� ���
	  Random random = new Random() -> �ν��Ͻ� �޼ҵ� ���
	  
	  
	  �� ������ �ٽ��� ������ ���ϱ� �̴�.
	  �������� ���� �� Ÿ���� �߿��ϴ�.
	  
	  �ڹ��� Ÿ�� : ������Ƽ�� (�ҹ��� int boolean double), ���۷���(�빮��) �ΰ����̴�.
	�⺻��(primitive type)
	- Boolean Type(boolean)
	- Numeric Type(short, int, long, float, double, char)
	������(reference type)
	- Class Type
	- Interface Type
	- Array Type
	- Enum Type
	- �� �� �ٸ� �͵�
	  
	  [����] ĳ������ Ÿ�� ���������� �� & �ٿ����� ������.
	  ���� -> ���� (��), ���� -> ���� (�ٿ�)  �̷��� �����̴� ���� ĳ����
	  ���ɽ���, �ٿ�ĳ���� �̷��� �����ȴ�.
	  ��ĳ������ ���������� �ڵ����� �̷�����. ( ... ) ���� 1 �� ��ĳ�����ϸ� 1.0 �� �ȴ�.
	  �ٿ�ĳ������ ( ... ) ó���� �ؼ� �������� �۾��Ѵ�.    
	  double d  = 5.5 �� ��, (int)d �� �ϸ� 5 �� ��µȴ�. �̸� �ٿ�ĳ�����̶� �Ѵ�.
	  
	 * */