abstract class Worker
{
    private String name; private int salary_rate;
    Worker(String name,int salary_rate)
    {
    this.name=name; this.salary_rate=salary_rate;
    System.out.println("worker constructor called");
    }
    
    
    void setname(String name)
    {
    this.name=name;
    }
    
    void setsalaryrate(int salary_rate)
    {
    this.salary_rate=salary_rate;
    }
    
    String getname()
    {
    return name;
    }
    
    int getsalaryrate()
    {
    return salary_rate;
    }
    abstract int compay(int hours);
    
    }
    
    class DailyWorker extends Worker
    {
    
    DailyWorker(String name, int salary_rate)
    {
    super(name,salary_rate);
    
    System.out.println("daily class constructor called");
    }
    int compay(int hours)
    {
    return hours*getsalaryrate();
    }
    
    public String toString()
    {
        return("salary of "+getname()+" is "+compay(45));
    }
    
    
    
    
    }
    
    class SalariedWorker extends Worker
    {
    SalariedWorker(String name,int salary_rate)
    {
    super(name,salary_rate);
    System.out.println("salaried class constructor called");
    }
    
    
    int compay(int hours)
    {
    return getsalaryrate()*40;
    }
    public String toString()
    {
    return("salary of "+getname() +" is "+compay(45) );
    }
    
    }
    
    class main
    {
    public static void main(String[] args)
    {
    SalariedWorker s1=new SalariedWorker("rahul",100); System.out.println(s1);
    
    DailyWorker d1 =new DailyWorker("anjali",80); System.out.println(d1);
    }
    
    }
    
     
    