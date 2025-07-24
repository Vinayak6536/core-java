class InvitationCard {
    int cardId;
    String occasion;
    String cardSize;
    String cardColor;
    double price;
    String brand;
    String paymentMode;

    public void getCardInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Occasion: " + occasion);
        System.out.println("Card Size: " + cardSize);
        System.out.println("Card Color: " + cardColor);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Payment Mode: " + paymentMode);
    }
}