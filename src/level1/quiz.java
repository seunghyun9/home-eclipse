package level1;
Scanner scanner =  new Scanner(System.in);
public void quiz(Scanner scanner) {
    String [][] seat = new String[7][7];
    String [] list = {"A","B","C","D","E","F","G"};
    for(int i =0; i<7;i++){
        for (int j=0; j<7;j++){
            seat[i][j] = " �� ";}}
    /* Ǯ����: �����
    ��ũ�� �ڸ��� ǥ���ϱ� ���Ͽ� �ప 7 ���� 7�� ���� 2�� �迭 seat�� �����ߴ�.���Ŀ� ��ǥ�ø� ���Ͽ� 1���� �迭 list�� �����ϰ� ���� �־���.
     ���̸��� ���¼� ǥ���� ���Ͽ� for ���� ����Ͽ���. i���� 0 ���� 7���� ���� ���� ������ ����Ŀ���� �� �ȿ��� J���� 0���� 7���� ���� ���� ������
     ����ȴ�. i�� j�� ���� seat [i] [j]�� �ԷµǸ� "��" ���� ǥ�õȴ�.
    ����: https://zodlab.tistory.com/16
     */
    while (true){
        System.out.println("\n���Ͻô� �޴���ȣ�� �Է� ���ּ���.\n0.Exit 1.������ȸ 2.�����û 3.�������");
        int select = scanner.nextInt();
        switch (select){
        case 0:
            System.out.println("����");return;
        case 1 : {for (int i = 0; i < 7; i++) {
            System.out.print("\n" + list[i] + " ");
            for (int j = 0; j < 7; j++) {
                System.out.print(seat[i][j]);}}}break;
            /* �޴���ȣ�� ����Ŀ� ��ȣ�� �ް� ����ġ���� ����Ͽ� ���� ��ȣ�� ���� ����Ǵ� ������ �������.
            0���� �Է��ϸ� ���� ��°� �Բ� �ٽ� ���ư��� �ȴ�.
            1���� �Է½� for ���� �ڵ��Ѵ�. i ���� 0~ 6 ���� ���� Ŀ���� .i���� list[i]�� ���� A���� G���� ��µȴ�
            ���� �ٲ� ��� ��Ű�� ���Ͽ� \n�� ����Ͽ���. J���� 0 ~6���� ���� Ŀ����.
         */

        case 2:
                System.out.println("���ȣ���� �Է����ּ���. A(1) ~ G(7) ");
                int row = scanner.nextInt() - 1;
                while (row > 6){
                    System.out.println("�������� �ʴ� ���Դϴ�.");return;
                }
                System.out.println("����ȣ�� �Է����ּ���. 1 ~ 7");
                int col = scanner.nextInt() - 1;
                while (col > 6){
                    System.out.println("�������� �ʴ� ���Դϴ�.");return;
                }
                seat[row][col] = " �� ";
                System.out.println("���� ��û�Ǿ����ϴ�.");
                break;
                /*
                �Է¹��� ���� -1 �ϴ� ������ ��� ����0���� ī��Ʈ�� �Ǳ� �����̴�.
                while�� ����Ͽ� 7���� ū���� �Է� �� ��� ����� �޽����� ����Ѵ�.
                �Է¹��� �ప�� ������ " �� "�� ��µȴ�.
                 */

        case 3:
                System.out.println("���ȣ���� �Է����ּ���. A(1) ~ G(7)");
                int row2 = scanner.nextInt() - 1;
                while (row2 > 6){
                    System.out.println("�������� �ʴ� ���Դϴ�.");return;
                }
                System.out.println("����ȣ�� �Է����ּ���. 1 ~ 7");
                int col2 = scanner.nextInt() - 1;
                while (col2 > 6){
                    System.out.println("�������� �ʴ� ���Դϴ�.");return;
                }
                seat[row2][col2] = " �� ";
                System.out.println("������ ��ҵǾ����ϴ�.");
                break;
            default:System.out.println("�������� �ʴ� �޴���ȣ �Դϴ�.");break;
            /*
            ���̽� 2���� ���� ������ �۵��ȴ�.
             */
        }
    }
}