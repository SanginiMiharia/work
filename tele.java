class tele
{
private int min; tele(int min)
{
    this.min=min;
    }
    
    void setmin(int min)
    {
    this.min=min;
    }
    
    int getmin()
    {
    return min;
    }
    
    }
    
    class ordinary extends tele
    {
    ordinary(int min)
    {
    super(min);
    System.out.println("ordinary constructor called");
    }
    int ordinary()
    {
    return getmin()*10;
    }
    public String toString()
    {
    return("total charges for ordinary call will be "+ordinary());
    }
    
    }
    
    
    class urgent extends tele
    {
    urgent(int min)
    {
    super(min);
    System.out.println("urgent constructor called");
    }
    int urgent()
    {
    return getmin()*20;
    }
    public String toString()
    {
    return("total charges for urgent call will be "+urgent());
    
}

}


class light extends tele
{
light(int min)
{
super(min);
System.out.println("light constructor called");
}
int light()
{
return getmin()*30;
}
public String toString()
{
return("total charges for lightening call will be "+light());
}

}

class main4
{
public static void main(String[] args)
{

ordinary o1=new ordinary(3); System.out.println(o1); urgent u1=new urgent(2); System.out.println(u1); light l1=new light(9); System.out.println(l1);
}

}
