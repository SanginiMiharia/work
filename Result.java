import java.util.*;
class Result
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Marks:-\n");
int marks[]=new int[10];
for(int i=0;i<10;i++)
{
marks[i]=sc.nextInt();
}
for(int i=0;i<marks.length;i++)
{
for(int j=0;j<marks.length-1-i;j++)
{ if(marks[j]>marks[j+1])
{
int temp=marks[j];
marks[j]=marks[j+1];
marks[j+1]=temp;
}
}
}
System.out.println("Result:-");
for(int i=0;i<10;i++)
{
if(marks[i]<=50 && marks[i]>=40)
System.out.println(marks[i]+" PASS");
else if(marks[i]<=75 && marks[i]>=51)
System.out.println(marks[i]+" MERIT");
else if(marks[i]>75)
System.out.println(marks[i]+"DISTINCTION");
 else
System.out.println(marks[i]+" FAIL");
}
}
}
