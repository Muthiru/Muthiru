public class Invoice extends  Document {
    private String  invoiceNumber;
    private double goodsValue;

    public Invoice(String city,String conctractor1,String contractor2,String signDate,String invoiceNumber,double goodsValue) {
        super(city,conctractor1,contractor2,signDate);
        this.invoiceNumber = invoiceNumber;
        this.goodsValue = goodsValue;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getGoodsValue() {
        return goodsValue;
    }

    @Override
    public String returnDocumentType() {
        return "Invoice";
    }

    @Override
    public void displayDocumentDetails() {
        displayBasicDocumentInformation();
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Goods Value: " + goodsValue);

    }

    @Override
    public void sign() {
        if (!isSigned) {
            isSigned = true;
            System.out.println("invoice" + invoiceNumber + "has been signed");
        }else{
            System.out.println("invoice is already signed");
        }

    }
}

