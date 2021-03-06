import java.util.Scanner;
public class Client_Application
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice 1.Simple Interest 2.Compound Interest 3.Construction");
        int ch = sc.nextInt();
        if(ch==1)
        {
            double principal_amount,rate_of_interest,time;
            System.out.println("Enter Principal Amount");
            principal_amount = sc.nextDouble();
            System.out.println("Enter rate of interest");
            rate_of_interest = sc.nextDouble();
            System.out.println("Enter time");
            time = sc.nextDouble();
            Simple_Interest  obs = new Simple_Interest(rate_of_interest,time,principal_amount);
            System.out.println("Simple Interest is : " +obs.Cal_Interest());
        }
        else if(ch==2)
        {
            double principal_amount,rate_of_interest,time,no_of_compound_periods;
            System.out.println("Enter Principal Amount");
            principal_amount = sc.nextDouble();
            System.out.println("Enter rate of interest");
            rate_of_interest = sc.nextDouble();
            System.out.println("Enter time");
            time = sc.nextDouble();
            System.out.println("Enter no_of_compound_periods");
            no_of_compound_periods = sc.nextDouble();
            Compound_Interest  obs = new  Compound_Interest(rate_of_interest,time,principal_amount,no_of_compound_periods);
            System.out.println("Compound Interest is : "+obs.Cal_Interest());
        }
        else if(ch==3)
        {
            String material_type;
            boolean fully_automated;
            System.out.println("Enter details as follows \n 1.Total area of house(in square feet )\n  2.Automted house house are not\n 3.material type\n");

            double total_area = sc.nextDouble();
            fully_automated = sc.nextBoolean();
            material_type = sc.next();
            Construction c = new Construction(material_type,total_area,fully_automated);
            double d = c.total_Construction_Cost();
            System.out.println("Total Construction cost is:"+ d);
        }
        else
        {
            System.out.println("You have entered the invalid option");
        }

    sc.close();
    }
}
