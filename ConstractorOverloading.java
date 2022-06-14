class Constructor
{
    int p,q;
    public Constructor()
    {}
    public Constructor(int x,int y)
    {
        p=x;
        q=y;
     }
    
    public int add(int i,int j)
    {
        return(i+j);
    }
    public int add(int i,int j,int k)
    {
        return(i+j+k);
    }
    public float add(float f1,float f2)
    {
        return (f1+f2);
    }
    public void printData()
    {
    System.out.println("p=" +p);
    System.out.println("q=" +q);
    }
}
class ConstructorOverloading
{
    public static void main(String args [])
    {
        int x=12, y=3,z=10;
        Constructor c=new Constructor();
        Constructor c1=new Constructor(x,y);
        c1.printData();
        float m=1.2F, n=2.9F;
        int k=c.add(x,y);
        int s=c.add(x,y,z);
        float f1=c.add(m,n);
        System.out.println("k="+k);
        System.out.println("s="+s);
        System.out.println("f1="+f1);
    }
}