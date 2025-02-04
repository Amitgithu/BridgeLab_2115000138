public class Product{
    private String productName;
    private int price;
    private int quantity;
    private static int discount = 10;
    private final String productID ;

    public Product(){
        this.productName = "Default";
        this.price = 99;
        this.quantity = 1;
        this.productID = "0000";
    }

    public Product(String productName, int price, int quantity, String productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String newProductName){
        this.productName = newProductName;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int newProductPrice){
        this.price = newProductPrice;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int updatedQuantity){
        this.quantity = updatedQuantity;
    }

    public String getProductID(){
        return this.productID;
    }

    public void updateDiscount(int updatedDiscount){
        this.discount = updatedDiscount;
    }

    public boolean isInstanceOf(Product obj){
        return (obj instanceof Product);
    }

    public void displayProductDetails(){
        System.out.println("Product Name is : " + this.productName);
        System.out.println("Product ID is : " + this.productID);
        System.out.println("Product Price is : " + this.price);
        System.out.println("Quantity of Product is : " + this.quantity);
        System.out.println("*****************************");
    }
}

class Main{
    public static void main(String []args){
        Product product1 = new Product("Mobile", 12999, 2, "8574-1038-9783");
        if(isInstanceOf(product1)){
            product1.displayProductDetails(); 
        }

        Product product2 = new Product("Laptop", 40999, 1, "9348-2838-0183");
        if(isInstanceOf(product2)){
            product2.displayProductDetails(); 
        }

    }
}