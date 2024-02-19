



public class Order
{
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;


    public Double getTotalAmount() {
        return totalAmount;
    }


    private PaymentMode paymentMode;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
        setTotalAmount(0.0);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public void setTotalAmount(Double totalAmount) {
        double discount = 0;
        totalAmount = unitPrice * quantity;
        discount = totalAmount * paymentMode.determineDiscountRate();


        this.totalAmount = totalAmount - discount;


    }



}
