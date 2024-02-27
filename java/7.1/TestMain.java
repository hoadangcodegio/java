import java.util.Date;

public class TestMain {

    public static void main(String[] args) {

        Customer c1 = new Customer("Piet Clerx", true, "Premium");
        Customer c2 = new Customer("Trees Klaas", true, "Silver");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Visit v1 = new Visit(c1, new Date());
        System.out.println(v1.toString());

        v1.setProductExpense(4.5);
        v1.setServiceExpense(8.5);
        v1.setProductExpense(1.5);
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
}