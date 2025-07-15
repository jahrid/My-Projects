import java.text.DecimalFormat;
import java.util.Scanner;
 
public class First {
    public static void main(String args[]) {
        System.out.println("Circle Area and Perimeter Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Radius: ");
        float r=sc.nextFloat();
        double area=Math.PI*Math.pow(r, 2);
        double per=2*Math.PI*r;

        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Area: "+df.format(area));
        System.out.println("Perimeter: "+df.format(per));

    
    }
}
