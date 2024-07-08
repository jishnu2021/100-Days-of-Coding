public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            // Update the current row index
            currentRow += goingDown ? 1 : -1;
        }

        
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion solution = new ZigzagConversion();

        
        System.out.println(solution.convert("PAYPALISHIRING", 3)); 
        System.out.println(solution.convert("PAYPALISHIRING", 4)); 
        System.out.println(solution.convert("A", 1)); 
    }
}
