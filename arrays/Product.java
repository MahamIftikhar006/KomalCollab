public class Product{

private int id;
private String name;
private int quantity;
private double price;


public void setID(int i){

this.id=i;

}

public void setName(String n){

this.name=n;

}

public void setPrice(double pr){

this.price=pr;
}
public void setQuantity(int q){
this.quantity=q;

}
public int getId(){

return id;
}

public String getName(){

return name;

}

public double getPrice(){
return price;
}

public int getQuantity(){
return quantity;
}

Product(int id, String name,double price,int quantity){
this.id=id;
this.name=name;
this.price=price;
this.quantity=quantity;

}






}