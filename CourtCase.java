class CourtCase {

    CourtCase() {
        System.out.println("CourtCase is Invoked");
    }

    CourtCase(int caseId,String caseTitle,String courtName,String judgeName,int yearOfFiling,boolean isCriminal) {
        System.out.println("CourtCase is Invoked");
        this.caseId=caseId;
        this.caseTitle=caseTitle;
        this.courtName=courtName;
        this.judgeName=judgeName;
        this.yearOfFiling=yearOfFiling;
        this.isCriminal=isCriminal;
    }

    int caseId;
    String caseTitle;
    String courtName;
    String judgeName;
    int yearOfFiling;
    boolean isCriminal;

    public void getCourtCaseInfo() {
        System.out.println("Case ID: " + caseId);
        System.out.println("Title: " + caseTitle);
        System.out.println("Court Name: " + courtName);
        System.out.println("Judge: " + judgeName);
        System.out.println("Year of Filing: " + yearOfFiling);
        System.out.println("Criminal Case: " + isCriminal);
    }
}
