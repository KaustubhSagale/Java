import java.util.Scanner;
/*Name: Kaustubh Sagale 
  Roll Number: 27051
  SE-IT-B
*/
class publication {
    private String title;
    private double price;
    private int copies;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    publication() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the title:");
            title = sc.nextLine();
            System.out.print("Enter the price of book:");
            price = sc.nextDouble();
            System.out.print("Enter the number of copies:");
            copies = sc.nextInt();



            System.out.println("You entered the book info as follows:");
            System.out.println("Title:" + title);
            System.out.println("Price:" + price);
            System.out.println("Copies:" + copies);

    }
}
class book extends publication{
    private String author;
    private int salecopy;
    private double income;


    public void setAuthor(String author){
        this.author=author;
    }
    public void setSalecopy(int salecopy){
        this.salecopy=salecopy;
    }
    public void setIncome(double income){
        this.income=income;
    }
    book (double price){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter thw author name:");
        author=sc.nextLine();
        System.out.print("Enter the number of copies sold:");
        salecopy=sc.nextInt();
        income=salecopy*price;
        System.out.println("Your income is :"+income);
    }

}


public class Main {
    public static void main(String[] args) {

        System.out.println("...Welcome to BookShop...");
        book pb=new book(45);
        pb.setAuthor("Shayamachi Aai");



    }
}