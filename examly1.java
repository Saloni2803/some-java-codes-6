 int n,f=0,i=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
String arr[]=new String[n];
for(i=0;i<n;i++)
arr[i]=next();
String k;
k=s.next();
boolean sr;
for(int i=0;i<n;i++)
{
sr=k.equals(arr[i]);
if(sr==true)
{
a=i;
f=1;
}
}
if(f==1)
System.out.print("Element is found at index"+a);
else
System.out.print("The String"+k+" is not found");