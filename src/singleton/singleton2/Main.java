package singleton.singleton2;

public class Main {
    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getInstance();

        for (int i = 0; i < 10; i++) {
            System.out.println(ticketMaker.getNextTicketNumber());
        }
    }
}
