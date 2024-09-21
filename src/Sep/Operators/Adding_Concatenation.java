package Sep.Operators;

public class Adding_Concatenation {

    public static void main(String[]args){

        /*Concatenation it's normal + operator only but + operator behave differently
        -> if it's integer then it will do the addition math ex: a+b +first_name+last_name= 50prabhakkewat
        -> if it's string then it will do the combine and concat string parameter
        ex: first_name+Last_name+a+b=prabhakewat2030
         */


        String First_name = "Prabha";
        String Last_name  = "Kewat";

        System.out.println(First_name + Last_name );


        int a = 20;
        int b = 30;

        System.out.println(First_name + Last_name +   a+b );
        System.out.println(a+b + First_name + Last_name);

        /* if want to write prabhakewat50 with string then will use braket(a+b)
        ex: s.o.p(first_name+last_name+(a+b));output prabhakewat50
         */

        System.out.println(First_name + Last_name +   (a+b) );
    }
}
