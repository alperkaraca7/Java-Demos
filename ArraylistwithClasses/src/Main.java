import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();


        customers.add(new Customer(45,"alper","karaca"));
        customers.add(new Customer(12,"sümeyra","aydemir"));


        for (Customer müsteri:customers
             ) {

            System.out.println(müsteri.name+müsteri.lastName+müsteri.id);

        }

    }
}