package Sep.ex_16092024;

public class Logical_Operators {
    public static void main(String[]args){

       int x = 5;
       int y = 3;
       int a = 8;
       int b = 5;

       boolean m = true;
       boolean n = true;
       boolean p= true||false;
       System.out.println(p);

       System.out.println((x>y)&&(a>b));
        System.out.println((x>y)||(a>b));
        System.out.println(!(x==y));
        System.out.println(!(x>y));

    }
}
