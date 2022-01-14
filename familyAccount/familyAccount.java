package familyAccount;

public class familyAccount {
    public static void main(String[] args) {

        boolean isComplete = false;
        int balance = 10000;
        String details = "收支\t账户金额\t\t收支金额\t\t说 明\n";
        while (!isComplete) {
            System.out.println("----------家庭收支记账软件----------");
            System.out.println();
            System.out.println("\t\t\t1 收支明细");
            System.out.println("\t\t\t2 登记收入");
            System.out.println("\t\t\t3 登记支出");
            System.out.println("\t\t\t4 退   出");
            System.out.println();
            System.out.println("---------------------------------");
            System.out.print("请选择(1-4):");

            char select = Utility.readMenuSelection();
            switch (select) {
                case '1':
                    System.out.println("----------收支明细----------");
                    System.out.print(details);
                    System.out.println("--------------------------");
                    break;
                case '2':
                    System.out.println("请输入收入金额");
                    int amountPlus = Utility.readNumber();
                    if (amountPlus > 0) {
                        balance += amountPlus;
                        System.out.println("输入成功");
                        System.out.println("请输入收入说明");
                        String infoPlus = Utility.readString();
                        System.out.println("输入成功");
                        details += "收入" + "\t" + balance + "\t\t" + amountPlus + "\t\t" + infoPlus + "\n";
                        System.out.println("登记完成");
                    } else {
                        System.out.println("请输入正数");
                    }
                    break;
                case '3':
                    System.out.println("请输入支出金额");
                    int amountSubtract = Utility.readNumber();
                    if (amountSubtract > 0) {
                        balance -= amountSubtract;
                        if (balance < 0) {
                            System.out.println("余额不足");
                        } else {
                            System.out.println("输入成功");
                            System.out.println("请输入收入说明");
                            String infoSubtract = Utility.readString();
                            System.out.println("输入成功");
                            details += "支出" + "\t" + balance + "\t\t" + amountSubtract + "\t\t" + infoSubtract + "\n";
                            System.out.println("登记完成");
                        }
                    } else {
                        System.out.println("请输入正数");
                    }
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)");
                    char isBreak = Utility.readConfirmSelection();
                    if (isBreak == 'Y') {
                        isComplete = true;
                        System.out.println("系统已退出");
                    } else {
                        System.out.println("退出失败，返回菜单");
                        break;
                    }


            }


        }
    }

}
