//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Invoice invoice= new Invoice("Nairobi","Jamo","Dante","12-09-2011","000034",500);
        System.out.println("Document type:"+ invoice.returnDocumentType());
        invoice.sign();
        invoice.displayDocumentDetails();
        ContractOfEmployment contract= new ContractOfEmployment("Nairobi","Husnanin llc ","LUblin inc","01-01-2024",800,"01-01-2024","31-12-2024");
        System.out.println("Document type:"+ contract.returnDocumentType());
        contract.sign();
        contract.displayDocumentDetails();



    }
}