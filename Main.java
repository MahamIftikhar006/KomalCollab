import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop(new Person("Komal Fawad","komalfawad2112@gmail.com"), "MM Alam Road, Lahore");

        Shop shop1 = new Shop("La Cornucopia");

        System.out.println("Restaurant Name : " +shop1.getShopName());

        shop.Ownerdetails();

        shop.Address();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("----------------");
            System.out.println("      Menu      ");
            System.out.println("----------------");
            System.out.println("1. Add Product");
            System.out.println("2. Sale Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Display Product");
            System.out.println("5. Modify Product");
            System.out.println("6. Search Product");
            System.out.println("7. Show Revenue");
            System.out.println("0. Exit");
            System.out.println("");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    shop.add();
                    break;
                case 2:
                    shop.sale();
                    break;
                case 3:
                    shop.remove();
                    break;
                case 4:
                    shop.display();
                    break;
                case 5:
                    shop.modify();
                    break;
                case 6:
                    shop.search();
                    break;
                case 7:
                    shop.showRevenue();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
            }

            }


        }
    }
