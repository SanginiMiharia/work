class Player
{
private int age; private int height; private String name;
Player(int age,int height,String name)
{
this.age=age; this.height=height; this.name=name;
System.out.println("player class constructor called");
}

public String ToString()
{
return("/n"+"age of "+getname()+" is "+getage()+" and height is "+getheight());
}

void setage(int age)
{
this.age=age;
}

void setheight(int height)
{
    this.height=height;
}

void setname(String name)
{
this.name=name;
}

int getage()
{
return age;
}

int getheight()
{
return height;
}

String getname()
{
return name;
}
}

class cricket_player extends Player
{
private int average; private int max_runs;
cricket_player(int age,int height,String name,int average,int max_runs)
{
super(age,height,name); this.average=average; this.max_runs=max_runs;
System.out.println("cricket constructor called ");
}

public String toString()
{
return("/n"+getmaxruns()+" are his max runs and has an average of "+getaverage());
}
void setaverage(int average)
{
this.average=average;
}
void setmaxruns(int max_runs)
{
this.max_runs=max_runs;
}

int getaverage()
{
return average;
}

int getmaxruns()
{
return max_runs;
}

}

class football_player extends Player
{
private int max_goal;
football_player(int age,int height,String name,int max_goal)
{
super(age,height,name); this.max_goal=max_goal;
System.out.println("football constructor called");
}
public String toString()
{
return("/n"+getmaxgoal()+" is the maximum no of goals this player has achieved.");
}

void setmaxgoal(int max_goal)
{
this.max_goal=max_goal;
}

int getmaxgoal()
{
return max_goal;
}

}

class hockey_player extends Player
{
private int intervals;
hockey_player(int age,int height,String name,int intervals)
 
{
super(age,height,name); this.intervals=intervals;
System.out.println("hockey constructor called");

}

public String toString()
{
return("/n"+" there will be "+getinterval()+"intervals in this hockey match");
}

void setintervals(int intervals)
{
this.intervals=intervals;
}

int getinterval()
{
return intervals;
}
}

class main32
{
public static void main(String[] args)
{
hockey_player h1=new hockey_player(21,6,"dhanchand",4);

System.out.println(h1);

football_player f1=new football_player(22,5,"ronaldo",300);


System.out.println(f1);

cricket_player c1=new cricket_player(33,6,"rohit",112,322);

System.out.println(c1 );

}
}