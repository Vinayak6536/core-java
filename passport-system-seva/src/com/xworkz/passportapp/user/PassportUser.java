package com.xworkz.passportapp.user;

public class PassportUser {
    String cpvLocation;
    String dcdrLocation;
    String givenName;
    String surName;
    String emailId;
    String address;
    String dob;
    String loginId;
    private String pwd;
    private  String confirmPwd;
    private String hintQuestion;
    private  String hintAnswer;
    private String captcha;

    public String getCpvLocation() {
        return cpvLocation;
    }

    public void setCpvLocation(String cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public String getDcdrLocation() {
        return dcdrLocation;
    }

    public void setDcdrLocation(String dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintAnswer() {
        return hintAnswer;
    }

    public void setHintAnswer(String hintAnswer) {
        this.hintAnswer = hintAnswer;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public void getPassportUserInfo(){
        System.out.println("PassportUser Details Feached.....");
        System.out.println("User CpvLocation Is:"+getCpvLocation());
        System.out.println("User DcdrLocation Is:"+getDcdrLocation());
        System.out.println("User Name Is:"+getGivenName());
        System.out.println("User Sur Name Is:"+getSurName());
        System.out.println("User EmailId Is:"+getEmailId());
        System.out.println("User Address Is:"+getAddress());
        System.out.println("User DOB Is:"+getDob());
        System.out.println("User Login Id Is:"+getLoginId());
        System.out.println("User Password Is:"+getPwd());
        System.out.println("User Confirm Password Is:"+getConfirmPwd());
        System.out.println("Hint Question Is:"+getHintQuestion());
        System.out.println("Hint Answer Is:"+getHintAnswer());
        System.out.println("Captcha Is:"+getCaptcha());
    }
}
