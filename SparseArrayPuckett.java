import java.util.Vector;

public class SparseArrayPuckett {
    public static void main(String[] args) {
        long[][] someArray = {{1,2,3},
                              {2,3,4},
                              {3,4,5}};
        compress(someArray);
    }
    public static long[][] compress(long[][] someArray) {
        long length = someArray[0].length;
        long width = someArray.length;
        Vector<Long> compressedVector = new Vector<>();
        long zeroCount = 0;
        for (int row = 0; row < width; row++) {
            for (int column = 0; column < length; column++) {
                if (someArray[row][column] == 0) {
                    zeroCount++;
                } else {
                    compressedVector.add(zeroCount);
                    zeroCount = 0;
                }
            }
        }
        return someArray;
    }
    public static long[] toArray(Vector<Long> someVector) {
        int length = someVector.size();
        long[] someArray = new long[length];
        for (int index = 0; index < length; index++) {

        }
    }
}
