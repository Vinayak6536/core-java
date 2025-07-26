class NewsPaperRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        NewsPaper newsPaperOne = new NewsPaper(1, "The Hindu", "English", "TH Group", 5.0, true);
        newsPaperOne.getNewsPaperInfo();
        System.out.println();

        System.out.println("Main Ended");
    }
}