import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws FileNotFoundException  {
        File file = new File("C:\\Users\\shish\\Desktop\\CSC 485\\HW 0\\New folder\\shishir_ghorashainee_hw0\\src\\Program1.java");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}