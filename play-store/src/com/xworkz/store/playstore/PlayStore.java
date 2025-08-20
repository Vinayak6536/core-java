package com.xworkz.store.playstore;

import com.xworkz.store.app.Application;
import com.xworkz.store.validator.AppsValidator;

public class PlayStore {
    Application application;
    AppsValidator appsValidator;
    public boolean playstoreValidator(Application application){
        boolean isPlaystoreValid=false;
        AppsValidator appsValidator=new AppsValidator();
        boolean appsValidate=appsValidator.appValidator(application);

        if(appsValidate){
            application=application;
            isPlaystoreValid=true;
        }

        return isPlaystoreValid;
    }
    public void getApplicationInfo(){
        System.out.println("Application Id:"+application.getApplicationId());
        System.out.println("Application Name:"+application.getApplicationName());
        System.out.println("Application Version"+application.getApplicationVersion());
        System.out.println("Updated On:"+application.getUpdatedOn());
        System.out.println("Application Downloads:"+application.getAppDownloads());
        System.out.println("Application Size:"+application.getApplicationSize());
        System.out.println("Released On:"+application.getReleasedOn());
        System.out.println("Offered By:"+application.getOfferedBy());
    }

}
