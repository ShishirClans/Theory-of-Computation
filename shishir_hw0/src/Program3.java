import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String userInput = sc.nextLine();
        System.out.println();
        System.out.println("public class Program3 {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        System.out.println(\"" + userInput.replace("\"", "\\\"") + "\");");
        System.out.println("    }");
        System.out.println("}");
    }
}
