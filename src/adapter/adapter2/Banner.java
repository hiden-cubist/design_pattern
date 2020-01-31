package adapter.adapter2;

class Banner {
    private String string;

    Banner(String string) {
        this.string = string;
    }

    void showWithParen() {
        System.out.println("(" + string + ")");
    }

    void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
