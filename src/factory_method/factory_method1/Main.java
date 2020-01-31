package factory_method.factory_method1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();

        Product idCard1 = idCardFactory.create("Adams");
        Product idCard2 = idCardFactory.create("Bob");
        Product idCard3 = idCardFactory.create("Charlie");

        idCard1.use();
        idCard2.use();
        idCard3.use();

        List<String> owners = ((IDCardFactory) idCardFactory).getOwners();

        for (String owner: owners) {
            System.out.println(owner);
        }
    }
}
