package chapter3;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Petr", "Denis"};
        for (int i = 0; i < names.length; i++) {
            System.out.println( names[i]);

        }
        for (String element : names) {
            System.out.print(element + " ");
        }
    }
}
