package com.xworkz.courtcase;

public class CourtCase {
    int caseId;
    String caseName;
    String plaintiff;
    String defendant;
    String courtName;
    String status;
    double caseValue;
    String paymentMode;

    public void getCaseInfo() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Case Name: " + caseName);
        System.out.println("Plaintiff: " + plaintiff);
        System.out.println("Defendant: " + defendant);
        System.out.println("Court Name: " + courtName);
        System.out.println("Status: " + status);
        System.out.println("Case Value: " + caseValue);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
