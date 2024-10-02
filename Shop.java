import java.util.Scanner;

public class Shop {

    private String shopName;
    private String address;
    private Person owner;
    private Product list[] = new Product[500];

    private static int count = 0;
    private static double revenue = 0;

    public Shop(String shopName, String address, Person owner, Product[] list) {
        this.shopName = shopName;
        this.address = address;
        this.owner = owner;
        this.list = list;

    }

    public Shop(Person owner, String address){
        this.owner = owner;
        this.address = address;
        this.list = new Product[100];
    }

    public Shop(Person owner) {
        this.owner = owner;
    }

    public Shop(String shopName){
        this.shopName = shopName;
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Add Menu");
        System.out.println("Product Details");
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Price: ");
        double price = input.nextDouble();
        System.out.println("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        list[count++] = product;
        System.out.println("Product Added");
    }

    public void sale(){
        Scanner input = new Scanner(System.in);
        System.out.println("Sale Menu");
        System.out.println("Product ID : ");
        String id = input.nextLine();
        for (int i = 0; i < count; i++) {
            if (list[i] != null && list[i].getId().equals(id)) {
                if (list[i].getQuantity() > 0){
                    list[i].setQuantity(list[i].getQuantity() - 1);
                revenue += list[i].getPrice();
                System.out.println("Sale Successfully");
            }
                else {
                    System.out.println("Sale Failed");
                }
        }
        }
    }

    public void remove(){
        Scanner input = new Scanner(System.in);
        System.out.println("Remove Menu");
        System.out.println("Product ID : ");
        String id = input.nextLine();
        for (int i = 0; i < count; i++) {
            if(list[i] != null && list[i].getId().equals(id)){
                list[i] = null;
                System.out.println("Product Removed Successfully");
                return;
            }
            else {
                System.out.println("Product Not Found");
            }

        }
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            if(list[i] != null){
                System.out.println(list[i]);
                System.out.println("------------------");
            }
        }
    }

    public void modify(){
        Scanner input = new Scanner(System.in);
        System.out.println("Modify Menu");
        System.out.println("Product ID : ");
        String id = input.nextLine();
        for (int i = 0; i < count; i++) {
            if(list[i] != null && list[i].getId().equals(id)){
                System.out.println("Enter name : ");
                list[i].setName(input.nextLine());
                System.out.println("Enter price : ");
                list[i].setPrice(input.nextDouble());
                System.out.println("Enter quantity : ");
                list[i].setQuantity(input.nextInt());
                System.out.println("Modified Successfully");
            }
        }
    }

    public void search(){
    Scanner input = new Scanner(System.in);
        System.out.println("Search Menu");
        System.out.println("Enter Product ID to search : ");
        String id = input.nextLine();
        for (int i = 0; i < count; i++) {
            if(list[i] != null && list[i].getId().equals(id)){
                System.out.println(list[i]);
            }

            else {
                System.out.println("Product Not Found");
            }
        }


    }
    public void showRevenue(){
        System.out.println("Total revenue: " + revenue);
    }

    public void Ownerdetails(){
        System.out.println("Owner Details |"+ new Person(owner.getName(), owner.getEmail()));
    }

    public void Address(){
        System.out.println("Address : " + getAddress());
    }

}
