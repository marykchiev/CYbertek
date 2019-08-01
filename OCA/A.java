package OCA;

class A {

    A( ) {

        this(1);

        System.out.println("M");

    }

    A(int i) {

        System.out.println("N");

    }

}

class B extends A {



}



public class Test {

   public static void main(String[] args) {

        new B( );

    }

}
