package familyAccount;

public class familyAccount {
    public static void main(String[] args) {

        boolean isComplete = false;
        int balance = 10000;
        String details = "��֧\t�˻����\t\t��֧���\t\t˵ ��\n";
        while (!isComplete) {
            System.out.println("----------��ͥ��֧�������----------");
            System.out.println();
            System.out.println("\t\t\t1 ��֧��ϸ");
            System.out.println("\t\t\t2 �Ǽ�����");
            System.out.println("\t\t\t3 �Ǽ�֧��");
            System.out.println("\t\t\t4 ��   ��");
            System.out.println();
            System.out.println("---------------------------------");
            System.out.print("��ѡ��(1-4):");

            char select = Utility.readMenuSelection();
            switch (select) {
                case '1':
                    System.out.println("----------��֧��ϸ----------");
                    System.out.print(details);
                    System.out.println("--------------------------");
                    break;
                case '2':
                    System.out.println("������������");
                    int amountPlus = Utility.readNumber();
                    if (amountPlus > 0) {
                        balance += amountPlus;
                        System.out.println("����ɹ�");
                        System.out.println("����������˵��");
                        String infoPlus = Utility.readString();
                        System.out.println("����ɹ�");
                        details += "����" + "\t" + balance + "\t\t" + amountPlus + "\t\t" + infoPlus + "\n";
                        System.out.println("�Ǽ����");
                    } else {
                        System.out.println("����������");
                    }
                    break;
                case '3':
                    System.out.println("������֧�����");
                    int amountSubtract = Utility.readNumber();
                    if (amountSubtract > 0) {
                        balance -= amountSubtract;
                        if (balance < 0) {
                            System.out.println("����");
                        } else {
                            System.out.println("����ɹ�");
                            System.out.println("����������˵��");
                            String infoSubtract = Utility.readString();
                            System.out.println("����ɹ�");
                            details += "֧��" + "\t" + balance + "\t\t" + amountSubtract + "\t\t" + infoSubtract + "\n";
                            System.out.println("�Ǽ����");
                        }
                    } else {
                        System.out.println("����������");
                    }
                    break;
                case '4':
                    System.out.println("ȷ���Ƿ��˳�(Y/N)");
                    char isBreak = Utility.readConfirmSelection();
                    if (isBreak == 'Y') {
                        isComplete = true;
                        System.out.println("ϵͳ���˳�");
                    } else {
                        System.out.println("�˳�ʧ�ܣ����ز˵�");
                        break;
                    }


            }


        }
    }

}
