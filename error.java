class error
{
public static void main(String args[])
{
try{
System.out.println("open files");
int l=100;
System.out.println(l);
int r=l/0;

}
catch(ArithmeticException ae)
{
System.out.println(ae);
System.out.print("close files");
}
}
}