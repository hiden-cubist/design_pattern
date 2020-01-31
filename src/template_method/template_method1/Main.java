package template_method.template_method1;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        display1.display();

        AbstractDisplay display2 = new StringDisplay("Hello, world.");
        display2.display();
    }
}
