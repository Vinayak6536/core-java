class MovieRunner{
    public static void main(String[] movie){
        String movieName="KGF";
        int noOfTickets=500;
        
        System.out.println(" Showing Movie Tickets ");
        Customer1.purchase(movieName,noOfTickets);
        System.out.println(" The Movie Name:"+movieName);
        System.out.println("No Of Tickets:"+noOfTickets);
        System.out.println("Movie Ticket Closed....");
    }
}