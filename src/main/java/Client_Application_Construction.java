import java.util.Scanner;
import java.io.IOException;

public class Client_Application_Construction
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String material_type;
        double total_area;
        boolean automated_house;
        System.out.println("Enter details as follows 1.material type \n 2.Total area of house(in square feet )\n 3.Automted house house are not");
        material_type = sc.next();
        total_area = sc.nextDouble();
        automated_house = sc.nextBoolean();
        Construction c = new Construction(material_type,total_area,automated_house);
        double d = c.total_Construction_Cost();
        System.out.println("Total Construction cost is:"+ d);
        sc.close();
    }

}
