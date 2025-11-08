package CONSTRUTORESthisENCAPSULAMENTO.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;


    // SOBRECARGA DE CONSTRUTORES
    public Product(String name, double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // SOBRECARGA DE CONSTRUTORES
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    // SOBRECARGA DE CONSTRUTORES
    public Product(){
    }



    // GETTERS
    public String getName(){
       return name;
    }
    //SETTERS
    public void setName(String name){
        this.name = name;
    }

    // SETTERS
    public void setPrice(double price){
        this.price = price;
    }
    //GETTERS
    public double getPrice(){
        return price;
    }

    //GETTER
    public int getQuantity(){
        return quantity;
    }




    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", " + "$ "
                + String.format("%.2f",price)
                + ", "
                + quantity
                + " units, Total $ "
                + String.format("%.2f", totalValueInStock());
    }
}
