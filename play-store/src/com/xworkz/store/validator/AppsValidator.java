package com.xworkz.store.validator;

import com.xworkz.store.app.Application;

public class AppsValidator {
    Application application;
    public boolean appValidator(Application app) {
        boolean applicationIdValid = false;
        boolean applicationNameValid=false;
        boolean applicationVersionValid=false;
        boolean updatedValid=false;
        boolean appDownloadsValid=false;
        boolean applicationSizeValid=false;
        boolean releasedOnValid=false;
        boolean offeredByValid=false;
        boolean isValid=false;

        if (app.getApplicationId() != 0) {
            applicationIdValid = true;
        } else {
            System.out.println("Invalid ApplicationId");
        }

        if (app.getApplicationName() != null && !app.getApplicationName().isEmpty()) {
            applicationNameValid=true;
        }
        else {
            System.out.println("Invalid Application Name");
        }

        if(app.getApplicationVersion()!=null && !app.getApplicationVersion().isEmpty()){
            applicationVersionValid=true;
        }else {
            System.out.println("Invalid Application Version");
        }

        if(app.getUpdatedOn()!=null && !app.getUpdatedOn().isEmpty()){
            updatedValid=true;
        }
        else {
            System.out.println("Invalid UpdatedOn");
        }

        if(app.getAppDownloads()!=0){
            appDownloadsValid=true;
        }
        else {
            System.out.println("Invalid Downloads");
        }

        if(app.getApplicationSize()!=null && !app.getApplicationSize().isEmpty()){
            applicationSizeValid=true;
        }
        else {
            System.out.println("Invalid Application Size");
        }

        if(app.getReleasedOn()!=null && !app.getReleasedOn().isEmpty()){
            releasedOnValid=true;
        }
        else {
            System.out.println("Invalid Released On");
        }

        if(app.getOfferedBy()!=null && !app.getOfferedBy().isEmpty()){
            offeredByValid=true;
        }
        else {
            System.out.println("Invalid Offered By");
        }

        if(applicationIdValid && applicationNameValid && applicationVersionValid && updatedValid && appDownloadsValid && applicationSizeValid && releasedOnValid && offeredByValid){
            isValid=true;
        }

        return isValid;
    }
}
