public class Medium48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i<n;i++){
            for (int j =0; j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Medium48 medium48 = new Medium48();
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        medium48.rotate(matrix);
        for (int[] rows : matrix) {
            for (int element : rows) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }

}
