package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Project project=new Project();
        project.setProjectId(1);
        project.setProjectName("E-Commerce");
        project.setProjectManager("Darshan");
        project.setStatus("Ongoing");

        Project projectOne = new Project();
        projectOne.setProjectId(1);
        projectOne.setProjectName("AI Chatbot");
        projectOne.setProjectManager("Lakshmi");
        projectOne.setStatus("Ongoing");

        Project projectTwo = new Project();
        projectTwo.setProjectId(2);
        projectTwo.setProjectName("Inventory System");
        projectTwo.setProjectManager("Ayesha");
        projectTwo.setStatus("Planned");

        Project projectThree = new Project();
        projectThree.setProjectId(3);
        projectThree.setProjectName("Hospital Management");
        projectThree.setProjectManager("Ravi");
        projectThree.setStatus("Completed");

        Project projectFour = new Project();
        projectFour.setProjectId(4);
        projectFour.setProjectName("School Portal");
        projectFour.setProjectManager("Priya");
        projectFour.setStatus("Ongoing");

        Project projectFive = new Project();
        projectFive.setProjectId(5);
        projectFive.setProjectName("Banking App");
        projectFive.setProjectManager("Kiran");
        projectFive.setStatus("Ongoing");

        Project projectSix = new Project();
        projectSix.setProjectId(6);
        projectSix.setProjectName("Chat Application");
        projectSix.setProjectManager("Meena");
        projectSix.setStatus("Planned");

        Project projectSeven = new Project();
        projectSeven.setProjectId(7);
        projectSeven.setProjectName("Job Portal");
        projectSeven.setProjectManager("Vikram");
        projectSeven.setStatus("Completed");

        Project projectEight = new Project();
        projectEight.setProjectId(8);
        projectEight.setProjectName("Online Voting");
        projectEight.setProjectManager("Sneha");
        projectEight.setStatus("Ongoing");

        Project projectNine = new Project();
        projectNine.setProjectId(9);
        projectNine.setProjectName("Expense Tracker");
        projectNine.setProjectManager("Rahul");
        projectNine.setStatus("Completed");

        Project projectTen = new Project();
        projectTen.setProjectId(10);
        projectTen.setProjectName("Library System");
        projectTen.setProjectManager("Neha");
        projectTen.setStatus("Planned");

        Project projectEleven = new Project();
        projectEleven.setProjectId(11);
        projectEleven.setProjectName("CRM Tool");
        projectEleven.setProjectManager("Amit");
        projectEleven.setStatus("Ongoing");

        Project projectTwelve = new Project();
        projectTwelve.setProjectId(12);
        projectTwelve.setProjectName("Event Management");
        projectTwelve.setProjectManager("Divya");
        projectTwelve.setStatus("Ongoing");

        Project projectThirteen = new Project();
        projectThirteen.setProjectId(13);
        projectThirteen.setProjectName("Food Delivery App");
        projectThirteen.setProjectManager("Rohan");
        projectThirteen.setStatus("Completed");

        Project projectFourteen = new Project();
        projectFourteen.setProjectId(14);
        projectFourteen.setProjectName("Hotel Booking");
        projectFourteen.setProjectManager("Sunita");
        projectFourteen.setStatus("Ongoing");

        Project projectFifteen = new Project();
        projectFifteen.setProjectId(15);
        projectFifteen.setProjectName("Taxi Booking");
        projectFifteen.setProjectManager("Sahil");
        projectFifteen.setStatus("Planned");

        Project projectSixteen = new Project();
        projectSixteen.setProjectId(16);
        projectSixteen.setProjectName("Online Quiz");
        projectSixteen.setProjectManager("Tina");
        projectSixteen.setStatus("Completed");

        Project projectSeventeen = new Project();
        projectSeventeen.setProjectId(17);
        projectSeventeen.setProjectName("Healthcare Portal");
        projectSeventeen.setProjectManager("Nikhil");
        projectSeventeen.setStatus("Ongoing");

        Project projectEighteen = new Project();
        projectEighteen.setProjectId(18);
        projectEighteen.setProjectName("News Aggregator");
        projectEighteen.setProjectManager("Komal");
        projectEighteen.setStatus("Planned");

        Project projectNineteen = new Project();
        projectNineteen.setProjectId(19);
        projectNineteen.setProjectName("Weather App");
        projectNineteen.setProjectManager("Arjun");
        projectNineteen.setStatus("Ongoing");

        Company company=new Company();
        company.addProject(project);
        company.addProject(projectOne);
        company.addProject(projectTwo);
        company.addProject(projectThree);
        company.addProject(projectFour);
        company.addProject(projectFive);
        company.addProject(projectSix);
        company.addProject(projectSeven);
        company.addProject(projectEight);
        company.addProject(projectNine);
        company.addProject(projectTen);
        company.addProject(projectEleven);
        company.addProject(projectTwelve);
        company.addProject(projectThirteen);
        company.addProject(projectFourteen);
        company.addProject(projectFifteen);
        company.addProject(projectSixteen);
        company.addProject(projectSeventeen);
        company.addProject(projectEighteen);
        company.addProject(projectNineteen);

        company.getProjectDetails();

        System.out.println("Main Ended");

    }
}
