package com.xworkz.invitationcard;

public class InvitationCardRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        InvitationCard card = new InvitationCard();
        card.cardId = 1;
        card.occasion = "Wedding";
        card.cardSize = "A5";
        card.cardColor = "Red";
        card.price = 150.00;
        card.brand = "Elegant Cards";
        card.paymentMode = "Credit Card";
        card.getCardInfo();
        System.out.println("Main Ended");
    }
}
