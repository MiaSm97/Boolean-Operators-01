package exercise.operations;

public class Start {
    public static void main(String[] args) {

         /*2 <= 2 ---> true
           !true ---> false
           true && false ---> false
           result: false*/

        System.out.println(2 <= 2 && !true);



         /*!false ---> true
           3 > 2 ---> true
           true && true ---> true
           result: true*/

        System.out.println(!false && 3 > 2);



        /*!t ---> true
          true || true ---> true
          !true ---> false
          result: false*/

        boolean t = false;
        boolean f = true;
        System.out.println(!(!t || f));


        
        /*6 > 6 ---> false
          true && true ---> true
          !true ---> false
          false ^ false ---> false
          result: false*/

        System.out.println(6 > 6 ^ !(true && true));
    }


}
    /*Try to solve on paper the following boolean algebra operations:

        [A]: 2 <= 2 && !true
        [B]: !false && 3 > 2
        [C]: considering that t=false and f=true: !(!t || f)
        [D]: 6 > 6 ^ !(true && true)
        Then compare your solutions with a Java program that tests the validity of your assumptions.*/