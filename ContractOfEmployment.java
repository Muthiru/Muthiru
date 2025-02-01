public class ContractOfEmployment extends Document {
private double salary;
private String startDate;
private String endDate;

public ContractOfEmployment( String city,String contractor1,String contractor2,String signDate,double salary, String startDate, String endDate) {
    super(city,contractor1,contractor2,signDate);
    this.salary = salary;
    this.startDate = startDate;
    this.endDate = endDate;
}

    public double getSalary() {
        return salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public void displayDocumentDetails() {
        displayBasicDocumentInformation();
        System.out.println("Salary: " + salary);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }

    @Override
    public String returnDocumentType() {
        return "ContractOfEmployment";
    }

    @Override
    public void sign() {
    if(!isSigned) {
        isSigned = true;
        System.out.println("Employment Contract has been signed.");
    }else{
        System.out.println("Employment Contract has already been signed.");
    }

    }
}
