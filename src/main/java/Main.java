import java.util.*;

public class Main {

    public static Integer[][] start(int n) {
        Integer[][] result = new Integer[n][];
        Random random = new Random();
        Set<Integer> generated = new HashSet<>();
        for (int i = 0, l = 0; i < n; i++) {
            while (generated.size() < i + 1) {
                l = Math.abs(random.nextInt()) / 1000000;
                generated.add(l);
            }
            result[i] = new Integer[l];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt();
            }
        }
        for (int i = 0; i < result.length; i++) {
            Arrays.sort(result[i]);
            if (i % 2 != 0) {
                Collections.reverse(Arrays.asList(result[i]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[][] mass = start(scanner.nextInt());
        for (Integer[] mas : mass) {
            for (Integer m : mas) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
