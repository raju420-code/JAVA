public class type
{
    // Type Conversion and Casting
    public static void main(String a[])
    {
        byte b = 127;
        int d = b;
        
        int p = 45;
        byte q = (byte)p;

        int l = 257;
        byte m = (byte)l;

        float f = 5.9f;
        int t = (int)f;

        byte j = 10;
        byte k = 30;
        int result = (j*k);

        System.out.println(d);
        System.out.println(q);
        System.out.println(m);
        System.out.println(t);
        System.out.println(result);
    }
}