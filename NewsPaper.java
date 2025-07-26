class NewsPaper {

    NewsPaper() {
        System.out.println("NewsPaper is Invoked");
    }

    NewsPaper(int paperId, String name, String language, String publisher, double price, boolean isDaily) {
        System.out.println("NewsPaper is Invoked");
        this.paperId = paperId;
        this.name = name;
        this.language = language;
        this.publisher = publisher;
        this.price = price;
        this.isDaily = isDaily;
    }

    int paperId;
    String name;
    String language;
    String publisher;
    double price;
    boolean isDaily;

    public void getNewsPaperInfo() {
        System.out.println("Paper ID: " + paperId);
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Is Daily: " + isDaily);
    }
}
