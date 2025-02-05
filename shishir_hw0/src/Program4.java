
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) throws FileNotFoundException {
        long beginTime = System.currentTimeMillis();

        // Read integers from the file
        ArrayList<Integer> list = new ArrayList<>();
        File file = new File("C:\\Users\\shish\\Desktop\\CSC 485\\HW 0\\New folder\\shishir_ghorashainee_hw0\\testfilesforq4\\t1.txt");
        if (file.exists()) {
            try (Scanner sc = new Scanner(file)) {
                while (sc.hasNextInt()) {
                    list.add(sc.nextInt());
                }
            }
        }

        // Generate and check the possible combinations
        int[] array = list.stream().mapToInt(i -> i).toArray();
        int n = array.length;
        for (int i = 2; i <= n; i++) {
            createCombination(array, new int[i], 0, 0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - beginTime) + " milliseconds.");
    }

    // Generate combinations and check if they sum to 27
    private static void createCombination(int[] arr, int[] data, int start, int depth, int r) {
        if (depth == r) {
            int sum = 0;
            for (int num : data) sum += num;
            if (sum == 27) {
                System.out.print("YES ");
                for (int num : data) System.out.print(num + " ");
                System.out.println();
            }
            return;
        }

        for (int i = start; i <= arr.length - r + depth; i++) {
            data[depth] = arr[i];
            createCombination(arr, data, i + 1, depth + 1, r);
        }
    }
}
