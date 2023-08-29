import java.util.Scanner;
/*Name: Kaustubh Sagale
  Roll Number: 27051
  SE-IT-B
*/
abstract class shape_27051{
    abstract public void area();
}
class triangle extends shape_27051{

    double base;
    double height;

    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ther base:");
        base=sc.nextDouble();
        System.out.println("Enter ther height:");
        height=sc.nextDouble();
    }
    @Override
    public void area(){
        input();
        System.out.println("Area of triangle is :"+(0.5*base*height));
    }
}
class rectangle extends shape_27051{

    double side;
    double bre;


    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter ther lenght:");
        side=sc.nextDouble();
        System.out.println("Enter ther breadth:");
        bre=sc.nextDouble();
    }
    @Override
    public void area(){
        input();
        System.out.println("Area of rectangle is :"+(side*bre));
    }
}

public class Main
{
    public static void main(String[] args) {
        triangle obj=new triangle();
        
        obj.area();

        rectangle obj2=new rectangle();
       
        obj2.area();


    }
}