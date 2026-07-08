class Solution {
    public char[][] vertical(String s, int index, char[][] arr, int j, int rows) {
        for (int i = 0; i < rows; i++) {
            if (index < s.length()) {
                arr[i][j] = s.charAt(index);
                index += 1;
            }
        }
        return arr;
    }

    public char[][] diagonal(String s, int index, char[][] arr, int j, int rows) {
        int steps = rows - 2;
        rows = rows-1;
        for (int i = 0; i < steps; i++) {
            if (index < s.length()) {
                rows -= 1;
                arr[rows][j] = s.charAt(index);
                j += 1;
                index += 1;
            }
        }
        return arr;
    }

    public String convert(String s, int numRows) {
        int length = s.length();
        char[][] arr = new char[numRows][length];
        int index = 0;
        int column = 0;

        while (index < length) {
            arr = vertical(s, index, arr, column, numRows);
            index += numRows;
            column += 1;

            arr = diagonal(s, index, arr, column, numRows);
            if (numRows> 2){
            index += numRows - 2;
            column += numRows - 2;
            }
        }

        String generatedString = "";

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i][j] != '\0') {
                    generatedString += arr[i][j];
                }
            }
        }

        return generatedString;
    }
}