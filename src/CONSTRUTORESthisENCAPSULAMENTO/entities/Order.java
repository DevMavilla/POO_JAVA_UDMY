package CONSTRUTORESthisENCAPSULAMENTO.entities;
import java.util.Date;

public class Order{

    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        super();
        this.date = date;
        this.product = product;
    }

    // GETTERS
    public Date getDate(){
        return date;
    }
    //SETTERS
    public void setDate(Date date){
        this.date = date;
    }

    // GETTERS
    public Product getProduct(){
        return product;
    }
    //SETTERS
    public void setName(Product product){
        this.product = product;
    }
}
