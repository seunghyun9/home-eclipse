package level1;

public class diec2 {public static void main(String[] args) {
	//6���� �ֻ����� 5ȸ ������ ���� �հ���� ���Ͻÿ�
	//(int) (Math.random()*�ִ�)+�ּҰ�
	int result = 0;
	for(int i= 0; i<5; i++) { //5������
	double d = Math.random();
	int temp = (int)(d*6)+1; //�������� 1-6 ������
	System.out.print(temp);
	result+=temp;
	}
	
	System.out.print("Sum : "+result);
	
	//Ȧ����˶����� �ֻ��� ���� ���ϴ� ���α׷���
	// Random random = new Random();
	
}

}
