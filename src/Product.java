public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String s){
        name = s;
    }
    public String getName(){
        return name;
    }

    public Product(){
        setName("Unknown");
    }

    public Product(String s, double d){
        name = s;
        price = d;
    }

    public void setQuantity(int n){
        quantity = n;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void displayInfo(){
        System.out.print("Product Name: " + getName() + "\nPrice: " + getPrice());
    }

    public void displayInfo(boolean b){
        if(b){
            displayInfo();
            System.out.println("\nQuantity: " + getQuantity());
        }
        else{
            displayInfo();
        }
    }
}
