package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institution;
import com.xworkz.instituteapp.trainee.Trainee;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Trainee trainee=new Trainee();
        trainee.setTraineeId(1);
        trainee.setTraineeName("Dev");
        trainee.setTraineeLan("Java");
        trainee.setAge(32);

        Trainee traineeOne=new Trainee();
        traineeOne.setTraineeId(2);
        traineeOne.setTraineeName("Amit");
        traineeOne.setTraineeLan("Web");
        traineeOne.setAge(27);

        Trainee traineeTwo = new Trainee();
        traineeTwo.setTraineeId(2);
        traineeTwo.setTraineeName("Sneha");
        traineeTwo.setTraineeLan("Python");
        traineeTwo.setAge(28);

        Trainee traineeThree = new Trainee();
        traineeThree.setTraineeId(3);
        traineeThree.setTraineeName("Ravi");
        traineeThree.setTraineeLan("C++");
        traineeThree.setAge(30);

        Trainee traineeFour = new Trainee();
        traineeFour.setTraineeId(4);
        traineeFour.setTraineeName("Anu");
        traineeFour.setTraineeLan("JavaScript");
        traineeFour.setAge(27);

        Trainee traineeFive = new Trainee();
        traineeFive.setTraineeId(5);
        traineeFive.setTraineeName("Kiran");
        traineeFive.setTraineeLan("Java");
        traineeFive.setAge(26);

        Trainee traineeSix = new Trainee();
        traineeSix.setTraineeId(6);
        traineeSix.setTraineeName("Megha");
        traineeSix.setTraineeLan("Python");
        traineeSix.setAge(29);

        Trainee traineeSeven = new Trainee();
        traineeSeven.setTraineeId(7);
        traineeSeven.setTraineeName("Arun");
        traineeSeven.setTraineeLan("C#");
        traineeSeven.setAge(31);

        Trainee traineeEight = new Trainee();
        traineeEight.setTraineeId(8);
        traineeEight.setTraineeName("Divya");
        traineeEight.setTraineeLan("Kotlin");
        traineeEight.setAge(25);

        Trainee traineeNine = new Trainee();
        traineeNine.setTraineeId(9);
        traineeNine.setTraineeName("Manoj");
        traineeNine.setTraineeLan("Swift");
        traineeNine.setAge(33);

        Trainee traineeTen = new Trainee();
        traineeTen.setTraineeId(10);
        traineeTen.setTraineeName("Pooja");
        traineeTen.setTraineeLan("Ruby");
        traineeTen.setAge(24);

        Trainee traineeEleven = new Trainee();
        traineeEleven.setTraineeId(11);
        traineeEleven.setTraineeName("Rahul");
        traineeEleven.setTraineeLan("Go");
        traineeEleven.setAge(30);

        Trainee traineeTwelve = new Trainee();
        traineeTwelve.setTraineeId(12);
        traineeTwelve.setTraineeName("Snehal");
        traineeTwelve.setTraineeLan("PHP");
        traineeTwelve.setAge(27);

        Trainee traineeThirteen = new Trainee();
        traineeThirteen.setTraineeId(13);
        traineeThirteen.setTraineeName("Vinay");
        traineeThirteen.setTraineeLan("Rust");
        traineeThirteen.setAge(29);

        Trainee traineeFourteen = new Trainee();
        traineeFourteen.setTraineeId(14);
        traineeFourteen.setTraineeName("Lakshmi");
        traineeFourteen.setTraineeLan("Scala");
        traineeFourteen.setAge(26);

        Trainee traineeFifteen = new Trainee();
        traineeFifteen.setTraineeId(15);
        traineeFifteen.setTraineeName("Nikhil");
        traineeFifteen.setTraineeLan("TypeScript");
        traineeFifteen.setAge(28);

        Institution institution=new Institution();
        institution.addTrainees(trainee);
        institution.addTrainees(traineeOne);
        institution.addTrainees(traineeTwo);
        institution.addTrainees(traineeThree);
        institution.addTrainees(traineeFour);
        institution.addTrainees(traineeFive);
        institution.addTrainees(traineeSix);
        institution.addTrainees(traineeSeven);
        institution.addTrainees(traineeEight);
        institution.addTrainees(traineeNine);
        institution.addTrainees(traineeTen);
        institution.addTrainees(traineeEleven);
        institution.addTrainees(traineeTwelve);
        institution.addTrainees(traineeThirteen);
        institution.addTrainees(traineeFourteen);
        institution.addTrainees(traineeFifteen);

        institution.getTraineeDetails();

        System.out.println("Main Ended");

    }
}
