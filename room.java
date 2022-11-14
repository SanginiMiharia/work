class room
{
private int l,b; 
room(int x,int y)
{ this.l=x; this.b=y;}
}
class test extends room
{
public static void main(String args[])
{
room r=new room(10,20); 
System.out.println(r.l,r.b);
}
}
