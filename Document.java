public  abstract class Document {
    protected String city;
    protected String contractor1;
    protected String contractor2;
    protected String signDate;
    protected boolean isSigned;

    public Document(String city, String contractor1, String contractor2, String signDate) {
        this.city = city;
        this.contractor1 = contractor1;
        this.contractor2 = contractor2;
        this.signDate = signDate;
        this.isSigned = false;
    }
    public void displayContractors() {
        System.out.println("Contractor1: " + contractor1);
        System.out.println("Contractor2: " + contractor2);
    }
    public void displayBasicDocumentInformation() {
        System.out.println("City: " + city);
        System.out.println("Contractor1: " + contractor1);
        System.out.println("Contractor2: " + contractor2);
        System.out.println("SignDate: " + signDate);
        System.out.println("isSigned: " + (isSigned? "yes" : "no"));
    }
    public abstract void displayDocumentDetails();
    public abstract String returnDocumentType();
    public abstract void sign();

}
