package com.xworkz.store;

import com.xworkz.store.app.Application;
import com.xworkz.store.playstore.PlayStore;
import com.xworkz.store.validator.AppsValidator;

public class PlayStoreRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Application application=new Application();
        application.setApplicationId(1);
        application.setApplicationName("Shadow Fight");
        application.setApplicationVersion("1.2.34");
        application.setUpdatedOn("12/09/2021");
        application.setAppDownloads(109800989l);
        application.setApplicationSize("142 MB");
        application.setReleasedOn("12/12/2021");
        application.setOfferedBy("Tekki");




       PlayStore playStore=new PlayStore();
       boolean add= playStore.playstoreValidator(application);
      if(add) {
          playStore.getApplicationInfo();
      }
        System.out.println("Main Ended");

    }
}
