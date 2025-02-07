class Order{
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Details : ");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

}

class ShippedOrder extends Order{
    private int trackingNumber;

    public ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("****************************************");
    }
}

public class OnlineRetailOrderManagment{
    public static void main(String []args){
        Order order1 = new DeliveredOrder(101, "2023-10-01", 123456, "2023-10-05");
        Order order2 = new DeliveredOrder(102, "2023-10-02", 123457, "2023-10-06");

        order1.getOrderStatus();
        order2.getOrderStatus();
    }
}