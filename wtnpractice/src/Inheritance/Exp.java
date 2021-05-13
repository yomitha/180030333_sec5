import java.io.*;
import java.util.*;
class Exp
{
public static void main(String args[])
{
int l,h;
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
h=sc.nextInt();
int max=0;
for(int i=l;i<=h;i++)
{
int c=0;
if(i%2==0)
{
while(i!=0)
{
i=i/2;
c=c+1;
}
}
if(c>max)
{
max=i;
}
}
System.out.println(max);
}
}