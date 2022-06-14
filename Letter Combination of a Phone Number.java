import java.util.Scanner;
class Mobile
{
    char a[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                  {'t','u','v'},{'w','x','y','z'}};
    char l[][]= new char[5][5];
    String n;
    int i,j;
    Scanner sc=new Scanner(System.in);
    void Insert()
    {
        System.out.println("Enter a Digit (2-9):");
        n=sc.nextLine();
    }
    void Porcess()
    {
        for(i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='2')
            {
                l[i]=a[0];
            }
            if(n.charAt(i)=='3')
            {
                l[i]=a[1];
            }
            if(n.charAt(i)=='4')
            {
                l[i]=a[2];
            }
            if(n.charAt(i)=='5')
            {
                l[i]=a[3];
            }
            if(n.charAt(i)=='6')
            {
                l[i]=a[4];
            }
            if(n.charAt(i)=='7')
            {
                l[i]=a[5];
            }
            if(n.charAt(i)=='8')
            {
                l[i]=a[6];
            }
            if(n.charAt(i)=='9')
            {
                l[i]=a[7];
            }
        }
        if(n.length()==0)
        {
            System.out.println("[]");
        }
        if(n.length()==1)
        {
            for(j=0;j<l[0].length;j++)
            {
                System.out.print(l[0][j]+" ");
            }
        }
        else
        {
            for(i=0;i<l[0].length;i++)
          {
                for(j=0;j<l[1].length;j++)
            {
            System.out.print(l[0][i]+" "+l[1][j]+" ");
            }
          }
        }
        System.out.println();
    }
}
class MobileDemo
{
    public static void main(String args[])
    {
        Mobile ob=new Mobile();
        ob.Insert();
        ob.Porcess();
    }
}