class CourtCaseRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        CourtCase caseOne=new CourtCase(1,"State vs John","Supreme Court","Justice Rao",2010,true);
        caseOne.getCourtCaseInfo();
        System.out.println();

        CourtCase caseTwo=new CourtCase(2,"Miller vs Jackson","High Court","Justice Roy",2012,false);
        caseTwo.getCourtCaseInfo();
        System.out.println();

        CourtCase caseThree=new CourtCase(3,"People vs Doe","District Court","Justice Khan",2015,true);
        caseThree.getCourtCaseInfo();
        System.out.println();

        CourtCase caseFour=new CourtCase(4,"ABC Corp vs XYZ Ltd","Civil Court","Justice Patel",2011,false);
        caseFour.getCourtCaseInfo();
        System.out.println();

        CourtCase caseFive=new CourtCase(5,"Ravi vs State","High Court","Justice Iyer",2016,true);
        caseFive.getCourtCaseInfo();
        System.out.println();

        CourtCase caseSix=new CourtCase(6,"Leela vs Krishna","Family Court","Justice Mehta",2018,false);
        caseSix.getCourtCaseInfo();
        System.out.println();

        CourtCase caseSeven=new CourtCase(7,"Government vs Ajay","Supreme Court","Justice Verma",2009,true);
        caseSeven.getCourtCaseInfo();
        System.out.println();

        CourtCase caseEight=new CourtCase(8,"Singh vs Sharma","District Court","Justice Sinha",2017,false);
        caseEight.getCourtCaseInfo();
        System.out.println();

        CourtCase caseNine=new CourtCase(9,"Rani vs Raj","Family Court","Justice Bhat",2020,false);
        caseNine.getCourtCaseInfo();
        System.out.println();

        CourtCase caseTen=new CourtCase(10,"Bank vs Customer","Civil Court","Justice Nair",2013,false);
        caseTen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseEleven=new CourtCase(11,"XYZ Ltd vs Employee","Labor Court","Justice Desai",2019,false);
        caseEleven.getCourtCaseInfo();
        System.out.println();

        CourtCase caseTwelve=new CourtCase(12,"Anonymous vs City Council","Administrative Court","Justice Kaul",2014,false);
        caseTwelve.getCourtCaseInfo();
        System.out.println();

        CourtCase caseThirteen=new CourtCase(13,"Inspector vs Ramesh","Criminal Court","Justice Prasad",2011,true);
        caseThirteen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseFourteen=new CourtCase(14,"Tenant vs Landlord","Rent Court","Justice Dutta",2015,false);
        caseFourteen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseFifteen=new CourtCase(15,"Company vs Tax Dept","Tribunal Court","Justice Saxena",2021,false);
        caseFifteen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseSixteen=new CourtCase(16,"State vs Shyam","Sessions Court","Justice Singh",2010,true);
        caseSixteen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseSeventeen=new CourtCase(17,"Union vs Central","Supreme Court","Justice Mukherjee",2018,false);
        caseSeventeen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseEighteen=new CourtCase(18,"Citizen vs Police","High Court","Justice Joshi",2022,false);
        caseEighteen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseNineteen=new CourtCase(19,"Public Interest vs Pollution Board","Green Tribunal","Justice Sharma",2023,false);
        caseNineteen.getCourtCaseInfo();
        System.out.println();

        CourtCase caseTwenty=new CourtCase(20,"RTI vs Department","Information Commission","Justice Reddy",2024,false);
        caseTwenty.getCourtCaseInfo();
        System.out.println();

        System.out.println("Main Ended");
    }
}
