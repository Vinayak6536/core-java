class Cracker {

    Cracker() {
        System.out.println("Cracker is Invoked");
    }

    Cracker(int crackerId,String name,String type,String color,double price,boolean isLoud) {
        System.out.println("Cracker is Invoked");
        this.crackerId=crackerId;
        this.name=name;
        this.type=type;
        this.color=color;
        this.price=price;
        this.isLoud=isLoud;
    }

    int crackerId;
    String name;
    String type;
    String color;
    double price;
    boolean isLoud;

    public void getCrackerInfo() {
        System.out.println("Cracker ID: " + crackerId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Loud: " + isLoud);
    }
}
