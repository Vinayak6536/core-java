package com.xworkz.amazon.user;

public class AmazonUser {
    private String firstName;
    private String lastName;
    private int age;
    private String dob;
    private char gender;
    private String mobNo;
    private String emailId;
    private String pwd;
    private String confirmPwd;
    private String captcha;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }

    public String getMobNo(){
        return mobNo;
    }
    public void setMobNo(String mobNo){
        this.mobNo=mobNo;
    }

    public  String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }

    public  String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd=pwd;
    }

    public String getConfirmPwd(){
        return confirmPwd;
    }
    public void setConfirmPwd(String confirmPwd){
        this.confirmPwd=confirmPwd;
    }

    public String getCaptcha(){
        return captcha;
    }
    public void setCaptcha(String captcha){
        this.captcha=captcha;
    }
//    public void getUserInfo(){
//        System.out.println("User Details Feached.....");
//        System.out.println("First Name Is:"+getFirstName());
//        System.out.println("Last Name Is:"+getLastName());
//        System.out.println("Age Is:"+getAge());
//        System.out.println("DOB Is:"+getAge());
//        System.out.println("Gender is:"+getGender());
//        System.out.println("Mobile No Is:"+getMobNo());
//        System.out.println("Email Id Is:"+getEmailId());
//        System.out.println("Password Is:"+getPwd());
//        System.out.println("Confirm Password Is:"+getConfirmPwd());
//        System.out.println("Enter Captcha :"+getCaptcha());
 //   }
}
