package level1;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.contorller
 * fileName   : QuizController
 * author     : seunghyun9
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seunghyun9    ���� ����
 */
public class controller {
    public void execute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();

        while (true) {
            System.out.println("[����޴�] 0)Exit 1)2��6�� 2)2��7�� 3)2��8�� 3)2��9��");
            switch (scanner.next()) {
                case "0":
                    System.out.println("### Exit ###");
                    return;
                case "1":
                    String[] arr = {"�����", "������", "�ֹμ�", "�Ѽ���", "���¿�",
                            "Sort", "Stack", "Hash", "Heap", "Greedy",
                            "Binary Search", "Queue", "Graph", "DFS", "BFS",
                            "Brute Force", "DP",};
                    System.out.println("[�Ҹ޴�] 0.Exit\n1.���� ���� ���\n" +
                            "2.������ ���� ������ ���\n3.ť�� ����� ����� ���\n4.������ ���� ���� ���");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("1.�������� ���");
                            feb06Service.quiz1(arr);
                            break;
                        case "2":
                            System.out.println("2.������ ���� ���� ���");
                            feb06Service.quiz2(arr);
                            break;
                        case "3":
                            System.out.println("3.ť�� ����� ����� ���");
                            feb06Service.quiz3(arr);
                            break;
                        case "4":
                            System.out.println("4.������ ���� ���� ���");
                            feb06Service.quiz4(arr);
                            break;
                        default:
                            System.out.println("Wrong");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("[�Ҹ޴�]0.Exit\n1.�ֻ���(dice)\n2.����������(RPS)\n" +
                            "3.�Է¹��� �� �� ������ �ִ� �Ҽ� ���ϱ�(Get Prime)\n" +
                            "4.�ڹٷ� �Է¹��� ������ �������� ������� �Ǵ��ϱ�(Leap Year)\n" +
                            "5.���Ƿ� �Է¹��� ���� ���߱�(Number Golf)");

                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;

                        case "1":
                            System.out.println(" �ֻ���");
                            feb07Service.dice(scanner);
                            break;

                        case "3":
                            System.out.println("�� ���� �Է��Ͻÿ�.");
                            feb07Service.rps(scanner);
                            break;

                        case "4":
                            System.out.println("������ �Է��Ͻÿ�");
                            feb07Service.leap(scanner);
                            break;
                        case "5":
                            System.out.println("Up & Down ����");
                            feb07Service.golf(scanner);
                            break;

                        default:
                            System.out.println("Wrong");
                            break;

                    }

                case "3":
                    System.out.println("[�Ҹ޴�]0.Exit\n1.�ζ�\n2.�߱�\n3.�¼�����\n4.���������\n5.������");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;

                        case "1":
                            System.out.println("�ζ�");
                            feb08Service.lotto(scanner);
                            break;

                        case "2":
                            System.out.println("�߱�");
                            feb08Service.baseball(scanner);
                            break;

                        case "3":
                            System.out.println("�¼�����");
                            feb08Service.booking(scanner);
                            break;
                        case "4":
                            System.out.println("���������");
                            feb08Service.bank(scanner);
                            break;
                        case "5":
                            System.out.println("������");
                            feb08Service.gugudan(scanner);
                            break;

                        default:
                            System.out.println("Wrong");
                            break;


                    }

            }


        }

    }}