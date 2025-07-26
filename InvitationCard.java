class InvitationCard {

    InvitationCard() {
        System.out.println("InvitationCard is Invoked");
    }

    InvitationCard(int cardId, String eventType, String color, String hostName, double price, boolean isPrinted) {
        System.out.println("InvitationCard is Invoked");
        this.cardId = cardId;
        this.eventType = eventType;
        this.color = color;
        this.hostName = hostName;
        this.price = price;
        this.isPrinted = isPrinted;
    }

    int cardId;
    String eventType;
    String color;
    String hostName;
    double price;
    boolean isPrinted;

    public void getInvitationCardInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Event Type: " + eventType);
        System.out.println("Color: " + color);
        System.out.println("Host Name: " + hostName);
        System.out.println("Price: " + price);
        System.out.println("Printed: " + isPrinted);
    }
}
