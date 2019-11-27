class ex2
{
static void valid(int i)throws ex1
{
if(i<18)
throw new ex1("not valid");
else
System.out.print("valid");
}

public static void main(String args[])
{
try
{
valid(12);
}
catch(ex1 e)
{
System.out.print(e);
}
}
}
class ex1 extends Exception
{
ex1 (String st)
{
super(st);
}
}

 	