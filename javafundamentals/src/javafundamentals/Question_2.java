package javafundamentals;

public class Question_2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Enter 1 argument");
            return; 
        }

        String sample = args[0];
        System.out.println("Welcome " + sample);
    }
}
