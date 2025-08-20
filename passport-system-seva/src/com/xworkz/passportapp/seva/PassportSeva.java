package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {

    PassportUser passportUser;


     public boolean  createPassportUser(PassportUser user) {

         boolean isCpvValid = false;
         boolean isDcdrLocationValid = false;
         boolean isGivenNameValid=false;
         boolean isSurNameValid=false;
         boolean isEmailIdValid=false;
         boolean isAddressValid=false;
         boolean isDobValid=false;
         boolean isLoginIdValid=false;
         boolean isPwdValid=false;
         boolean isConfirmPasswordValid=false;
         boolean isHintQuestionValid=false;
         boolean isHintAnswerValid=false;
         boolean isCaptchaValid=false;
         boolean isUserValid=false;
         if (user.getCpvLocation() != null) {
             isCpvValid = true;
         } else {
             System.out.println("Cpv Location Is Not Valid");
         }

         if (user.getDcdrLocation() != null) {
             isDcdrLocationValid = true;
         }
         else {
             System.out.println("DcdrLocation Is Not Valid ");
         }
         if(user.getGivenName() != null){
             isGivenNameValid=true;
         }
         else {
             System.out.println("Given Name Is Not Valid");
         }

         if(user.getSurName() != null){
             isSurNameValid=true;
         }
         else {
             System.out.println("Sur Name Is Not Valid");
         }
         if(user.getEmailId() != null){
             isEmailIdValid=true;
         }
         else {
             System.out.println("Email Name Is Not Valid");
         }

         if(user.getAddress() != null){
             isAddressValid=true;
         }
         else {
             System.out.println("Address Is Not Valid");
         }
          if(user.getDob() != null){
              isDobValid=true;
          }
          else {
              System.out.println("DOB Is Not Valid");
          }

          if(user.getLoginId() != null){
              isLoginIdValid=true;
          }
          else {
              System.out.println("Login Id Not Valid");
          }

          if(user.getPwd() != null){
              isPwdValid=true;
          }
          else {
              System.out.println("Pwd Is Not Valid");
          }

          if(user.getConfirmPwd() != null){
              isConfirmPasswordValid=true;
          }
          else {
              System.out.println("ConfirmPassword Is Not Valid");
          }

          if(user.getHintQuestion() != null){
              isHintQuestionValid=true;
          }
          else {
              System.out.println("HintQuestion Is Not Valid");
          }

          if(user.getHintAnswer() != null){
              isHintAnswerValid=true;
          }
          else {
              System.out.println("Hint Answer Is Not Valid");
          }

          if(user.getCaptcha() != null){
              isCaptchaValid=true;
          }
          else {
              System.out.println("Captcha Is Not Valid");
          }

          if(isGivenNameValid && isCpvValid && isEmailIdValid){
              System.out.println("PassPortSeva Details Feached.....");
              isUserValid=true;
              this.passportUser=passportUser;

          }
          return  isUserValid;
     }
}
