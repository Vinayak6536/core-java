class PersonDetails{

    static String firstName;
    static String lastName;
    static int age;
    static long phoneNo;
    static double weight;
    static float height;
    static char gender;
    static boolean eligable;

    public static String getFirstName(){
        firstName="Bharat";
        System.out.println("The Person Name Is:"+firstName);
        return firstName;
    }
    public static String getLastName(){
        lastName="Managuli";
        System.out.println("The Person Last Name Is:"+lastName);
        return lastName;
    }
    public static int getAge(){
        age=25;
        System.out.println("The Person Age Is:"+age);
        return age;
    }
    public static long getPhoneNo(){
        
        phoneNo=7338432139l;
        System.out.println("The Person PhoneNo Is:"+phoneNo);
        return phoneNo;
    }
    public static double  getWeight(){
        weight=56.23;
        System.out.println("The Person Weight Is:"+weight+"KG");
        return weight;
    }
    public static float getHeight(){
        height=125.6f;
        System.out.println("The Person Height Is:"+height);
        return height;
    }
    public static char getGender(){
        gender='M';
        System.out.println("The Person Gender Is:"+gender);
        return gender;
    }
    public static boolean  getEligable(){
        
        eligable=true;
        System.out.println("The Person Is Eligable :"+eligable);
        return eligable;
    }
}