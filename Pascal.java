public class Pascal {
    public static void main(String[] args) {

        for (int number : getRow(60)) {
            System.out.println(number);
        }
        
    }
    public static int[] getRow(int u_row) {
        int[] triangleRow = new int[u_row + 1];
        double row = (double)(u_row);
        int half = (int)(Math.floor(row / 2));
        int holder = 0;
        double previousRowAbove = row - 1;
        triangleRow[0] = 1;
        triangleRow[u_row] = 1;
        triangleRow[1] = u_row;
        triangleRow[(int)(row) - 1] = u_row;
        for (int index = 1; index < half; index++) {
            holder = (int)(previousRowAbove * (row / (index + 1)));
            triangleRow[index + 1] = (int)holder;
            triangleRow[(int)(row) - index - 1] = (int)holder;
            previousRowAbove = holder - previousRowAbove;
        }
        if ((row%2) != 0) {
            triangleRow[half] = (int)(previousRowAbove * (row / (half + 1)));
        }
        return triangleRow;
    }
}