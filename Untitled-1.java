import java.util.*
package employee;
interface employee
{
    public void Salary(protected String name,private int sal,int hours)
}
class salary implements employee
{
    public void Salary(protected String name,private long int acc,int hours)
    {
        Scanner s1=new Scanner(System.in)
        System.out.println("Enter number of hours worked:");
        hours=s1.nextline();
        if(hours>0 && hours<=3)
        {
            sal=5000;
            System.out.println("Salary earned: "+sal);
        }
        else if(hours>3 && hours<=5)
        {
            sal=10000;
            System.out.println("Salary earned: "+sal);
        }
        else
        {
            sal=15000;
            System.out.println("Salary earned: "+sal);
        }
    }
    class reward extends salary implements Employee
    {
        if(sal==5000)
        System.out.println("Nothing");
        else if(sal==10000)
        System.out.println("Considered for promotion");
        else
        System.out.println("Promotion granted");
    }
    package Employee;

    
}