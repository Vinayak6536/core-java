package com.xworkz.facebook;

public class FacebookUser {
    private String firstName;
    private String surName;
    private String dob;
    private char gender;
    private String mobNo;
    private String emailId;
    private String newPwd;
    private String confirmPwd;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob=dob;
    }

    public char getGender(){
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

    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;

    }

    public String getNewPwd(){
        return newPwd;
    }
    public void setNewPwd(String newPwd){
        this.newPwd=newPwd;
    }

    public String getConfirmPwd(){
        return confirmPwd;
    }
    public void setConfirmPwd(String confirmPwd){
        this.confirmPwd=confirmPwd;
    }


}
