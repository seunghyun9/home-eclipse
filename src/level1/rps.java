package level1;

public class rps {
	public static void main(String[] args){
		String[] arr = {"가위", "바위", "보", "Draw", "Win", "Lose"};
int[] arr2 = new int[2];
for(int i =0 ; i<arr2.length; i++) arr2[i] = (int)(Math.random()*3)+1;
int p = arr2[0], c = arr2[1];
System.out.printf("Player : %s %d\n",arr[p-1], p);
System.out.printf("Computer : %s %d\n",arr[c-1], c);
int i = 3;
switch(Math.abs(p - c)) {
	case 1: i = (p > c) ? 5 : 4;
	case 2: i = (p > c) ? 4 : 5;
	default: break;
}
System.out.printf("Player: %s", arr[i]);
	}}


