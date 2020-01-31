package singleton.singleton2;

class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
    }

    static TicketMaker getInstance() {
        return ticketMaker;
    }

    synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
