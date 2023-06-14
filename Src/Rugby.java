import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[25];
        int[] array2 = new int[25];
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(22) + 18;
            array2[i] = random.nextInt(22) + 18;
            sumTeam1 += array1[i];
            sumTeam2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(sumTeam1);
        System.out.println(sumTeam2);
        System.out.println((double)sumTeam1/ array1.length);
        System.out.println((double)sumTeam2/ array2.length);
    }
}
