package product;


import java.util.Date;

public class Product {
    String name;
    float price;
String date;
   public Product(String name,float price,String date)
    {
        this.date=date;
        this.price=price;
        this.name=name;
    }
    @Override
    public boolean equals(Object obj)
    {
        Product product=(Product) obj;
        return (this.name.equals(product.name)) && (this.date.equals(product.date)) && (this.price==product.price);
    }

}

