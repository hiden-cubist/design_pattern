package factory_method.factory_method2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();

        Product idCard1 = idCardFactory.create("Adams");
        Product idCard2 = idCardFactory.create("Bob");
        Product idCard3 = idCardFactory.create("Charlie");

        idCard1.use();
        idCard2.use();
        idCard3.use();

        Map<String, Integer> owners = ((IDCardFactory) idCardFactory).getOwners();

        for (Map.Entry<String, Integer> owner : owners.entrySet()) {
            System.out.println(owner.getKey() + "：" + owner.getValue());
        }
    }
}
