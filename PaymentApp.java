

public class PaymentApp
{
    public static void main(String[] args)
    {
        Order order = new Order();
        order.setItem("keyboard");
        order.setQuantity(10);
        order.setUnitPrice(300.0);
        order.setPaymentMode(new GCash());

        System.out.println("\nPayment order details if GCash");
        System.out.println("Order item is " + order.getItem());
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());
        System.out.println("Payment mode is " + order.getPaymentMode().getClass().getSimpleName());
        System.out.println("Payment Amount is " + order.getTotalAmount());

        order.setItem("keyboard");
        order.setQuantity(10);
        order.setUnitPrice(300.0);
        order.setPaymentMode(new Maya());

        System.out.println("\nPayment order details if Maya");
        System.out.println("Order item is " + order.getItem());
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());
        System.out.println("Payment mode is " + order.getPaymentMode().getClass().getSimpleName());
        System.out.println("Payment Amount is " + order.getTotalAmount());

        order.setItem("keyboard");
        order.setQuantity(10);
        order.setUnitPrice(300.0);
        order.setPaymentMode(new ShopeePay());
        
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Order item is " + order.getItem());
        System.out.println("Unit price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());
        System.out.println("Payment mode is " + order.getPaymentMode().getClass().getSimpleName());
        System.out.println("Payment Amount is " + order.getTotalAmount());
    }
}
