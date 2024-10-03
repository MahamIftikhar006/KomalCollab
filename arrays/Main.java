public class Main{

public static void main(String args[]){

Product p[]=new Product[3];

p[0]=new Product(1,"Ice cream",37.5,166);
p[1]=new Product(2,"Book",43.5,276);
p[2]=new Product(3,"Pen",73.4,3345);
/*
for(int i=0; i<p.length;i++){

p[i]= new Product(i+1,"Milk");



}*/

for(int i=0; i<p.length;i++){

System.out.println("Id is :"+p[i].getId()+"  The name is :"+p[i].getName());



}





}











}
