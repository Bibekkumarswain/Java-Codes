package Variables;

class Code3
{
    int a=10;//Instance Variable
    static double b=15.9;//static Variable
    public static void main(String[] args)
    {
        boolean c=true;//Local Variable

        Code3 i= new Code3();
        System.out.println(i.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("This is my integer value="+i.a+" "+"This is my double value="+b+" "+"This is my boolean value="+c);
    }
}