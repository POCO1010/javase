package CustomerAccount;

public class CustomerList {
    int total = 0;
    Customer[] customers;

    //    用途：构造器，用来初始化customers数组
    //    参数：totalCustomer：指定customers数组的最大空间
    public CustomerList(int totalCustomer) {

        customers = new Customer[totalCustomer];
    }

}
