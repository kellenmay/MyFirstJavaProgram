public class Main {
    public static void main(String[] args){
//        System.out.println("\"Hello World\"");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//
//        int x;
//        x = 123;
//        int y;
//        y = 134
//        System.out.println(x);
//        System.out.println(x+x);
//        System.out.println(x+y);
        String x = "hello";
        String y = "World";
        System.out.println(x);
        System.out.println(y);
        String temp;
        temp = x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);

    }
}
