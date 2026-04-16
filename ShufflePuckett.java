import java.util.ArrayList;
import java.util.Random;

public class ShufflePuckett {
    public static void main(String[] args) {
        int[] someArray = {1, 2, 3, 4, 5, 6, 7};
         for (int number : shuffle(someArray)) {
            System.out.println(number);
         }
        checkRandomness(10000000);
    }

    public static int[] shuffle(int[] someArray) {
        int[][] indexArray = new int[someArray.length][2];
        Random rng = new Random();
        ArrayList<Integer> someArrayList = new ArrayList<Integer>();
        for (int index = 0; index < someArray.length; index++) {
            someArrayList.add(someArray[index]);
            indexArray[index][0] = index;
            indexArray[index][1] = rng.nextInt(someArray.length);
        }

        int temp = 0;
        for (int index = 0; index < someArray.length; index++) {
            temp = someArrayList.get(indexArray[index][1]);
            someArrayList.set(indexArray[index][1], someArrayList.get(index));
            someArrayList.set(index, temp);
        }

        for (int index = 0; index < someArray.length; index++) {
            someArray[index] = someArrayList.get(index);
        }

        return someArray;
    }

    public static int checkRandomness(int maxTrials) {
        int[] someArray = {1, 2, 3, 4, 5, 6, 7};
        float[] averageArray = new float[7];
        int[] runningSums = new int[someArray.length];
        for (int iteration = 0; iteration < maxTrials; iteration++) {
            someArray = shuffle(someArray);
            for (int index = 0; index < someArray.length; index++) {
                runningSums[index] += someArray[index];
            }
        }
        for (int index = 0; index < someArray.length; index++) {
            averageArray[index] = (float)(runningSums[index]) / (float)(maxTrials);
            System.out.println(averageArray[index]);
        }
        return 0;
    }
}