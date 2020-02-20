public class Construction
{
    String material;
    boolean fully_automated;
    double area;
    double total_const_cost;
    Construction(String material_type, double total_area,boolean fully_auto )
    {
        material=material_type;
        area=total_area;
        fully_automated = fully_auto;
    }
    public double total_Construction_Cost()
    {
        //System.out.println(material);
        //System.out.println(area);
        //System.out.println(fully_automated);
        if(!fully_automated) {

            if (material.equals("standard materials"))
                total_const_cost = (1200 * area);
            else if (material.equals("above standard materials")) {
                total_const_cost = (1500 * area);
            } else if (material.equals("high standard materials")) {
                total_const_cost = (1800 * area);
            }
        }
        else
            {
            total_const_cost = (2500 * area);
        }

        return this.total_const_cost;

        /*if(material.equals("standard materials"))
        {
            total_const_cost=1200;
            if(fully_automated)
            {
                total_const_cost=total_const_cost+700;
            }
            total_const_cost=total_const_cost*area;
        }
        else if(material.equals("above standard materials"))
        {
            total_const_cost=1500;
            if(fully_automated)
            {
                total_const_cost=total_const_cost+700;
            }
            total_const_cost=total_const_cost*area;
        }
        else if(material.equals("high standard materials"))
        {
            total_const_cost=1800;
            if(fully_automated)
            {
                total_const_cost=total_const_cost+700;

            }
            total_const_cost=total_const_cost*area;

        }
        else if(material.equals("above  standard materials"))
        {
            total_const_cost=2500;
            if(fully_automated)
            {
                total_const_cost=total_const_cost+700;
            }
            total_const_cost=total_const_cost*area;
        }
        else
        {
            final double v = 0.0;
            return v;
        }
        return total_const_cost;*/
    }
}
