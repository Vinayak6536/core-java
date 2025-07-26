class GiTag {

    GiTag() {
        System.out.println("GiTag is Invoked");
    }

    GiTag(int tagId, String productName, String state, String category, int yearGranted, boolean isAgricultural) {
        System.out.println("GiTag is Invoked");
        this.tagId = tagId;
        this.productName = productName;
        this.state = state;
        this.category = category;
        this.yearGranted = yearGranted;
        this.isAgricultural = isAgricultural;
    }

    int tagId;
    String productName;
    String state;
    String category;
    int yearGranted;
    boolean isAgricultural;

    public void getGiTagInfo() {
        System.out.println("Tag ID: " + tagId);
        System.out.println("Product Name: " + productName);
        System.out.println("State: " + state);
        System.out.println("Category: " + category);
        System.out.println("Year Granted: " + yearGranted);
        System.out.println("Is Agricultural: " + isAgricultural);
    }
}
