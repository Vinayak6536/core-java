package com.xworkz.companyapp.company;

import com.xworkz.companyapp.project.Project;

public class Company {
    Project[] projects=new Project[20];
    int index;

    public  boolean addProject(Project p){
        boolean isValid=false;
        if(p != null){
            projects[index++]=p;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return isValid;
    }

        public void getProjectDetails(){
        for (Project project:projects){
            System.out.println("Project Id Is:"+project.getProjectId());
            System.out.println("Project Name Is:"+project.getProjectName());
            System.out.println("Projcet Manager Is:"+project.getProjectManager());
            System.out.println("Project Status:"+project.getStatus());
            System.out.println();
        }
        }
}
