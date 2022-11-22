Class Singleton
{
      public static void main(String ag[])
{
   A a1=A.getinstance();
   A a2=A.getinstance();
}}

Class A
{
  public static A a;
  private A()
   {
    }
public static A getinstance()
{
   if(a==null)
    {
      a= new A();
     }
    return a;
}}