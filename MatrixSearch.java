public class MatrixSearch {

    public static void main(String[] args) {
        
    }

    static int[] binarySearch(int[] row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (row[mid] == target) {
                return new int[] { 0, mid };
            }
            if (row[mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            return binarySearch(matrix[0], 0, cols - 1, target);
        }
        // You'll need to implement the logic for searching multiple rows here
        // For now, just return [-1, -1] to indicate that the target was not found
        return new int[] { -1, -1 };
    }
}