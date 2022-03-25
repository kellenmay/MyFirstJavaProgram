import java.nio.file.FileSystemNotFoundException;
import java.util.*;
import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthUI;

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

//        String x = "hello";
//        String y = "World";
//        System.out.println(x);
//        System.out.println(y);
//        String temp;
//        temp = x;
//        x=y;
//        y=temp;
//        System.out.println(x);
//        System.out.println(y);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What is your favorite food?");
//        String food = scanner.nextLine();
//
//
//
//
//
//        System.out.println("Hello "+name);
//        System.out.println("You are "+age+" years old");
//        System.out.println("You enjoy eating "+food);

//        double friends = 10;
//        friends--;
//        System.out.println(friends);
//        friends = (double) friends % 3;
//        System.out.println(friends);
//        friends++;
//        friends = friends % 3;
//        System.out.println(friends);

//        String name = JOptionPane.showInputDialog("Enter your name");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//
//        JOptionPane.showMessageDialog(null, "Hello "+name+". You are "+age+ " years old and you are "+height+" cm tall.");

//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.abs(y);
//
//        System.out.println(z);

//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//
//        z = Math.sqrt((x*x)+(y*y));

//        System.out.println("The hypotenuse is : "+z);

//        scanner.close();
//
//        Random random = new Random();
//
//        int x = random.nextInt(6)+1;
//        double y = random.nextDouble();
//        boolean z = random.nextBoolean();
//
//        System.out.println(z);


//        int age = 75;
//
//        if(age>=18 && age<75){
//            System.out.println("You are an Adult!");
//        }
//        else if(age>=75) {
//            System.out.println("Ok Boomer");
//        }
//        else{
//            System.out.println("You are NOT an Adult");
//        }

//        String day = "Pizza";
//        switch(day){
//            case "Sunday": System.out.println("It is Sunday!");
//            break;
//            case "Monday": System.out.println("It is Monday!");
//            break;
//            case "Tuesday": System.out.println("It is Tuesday!");
//            break;
//            case "Wednesday": System.out.println("It is Wednesday!");
//            break;
//            case "Thursday": System.out.println("It is Thursday!");
//            break;
//            case "Friday": System.out.println("It is Friday!");
//            break;
//            case "Saturday": System.out.println("It is Saturday!");
//            break;
//            default: System.out.println("This is not a day");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game *pew pew*");
        }
        else{
            System.out.println("You quit the game");
        }

    }
}
