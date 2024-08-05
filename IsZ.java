public class IsZ {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution solution = new Solution();
        boolean isValid = solution.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + isValid);
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Create sets to track seen numbers in rows, columns, and boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];
                if (num == '.') continue;
                
                // Check row
                if (rows[r].contains(num)) return false;
                rows[r].add(num);
                
                // Check column
                if (cols[c].contains(num)) return false;
                cols[c].add(num);
                
                // Check 3x3 box
                int boxIndex = (r / 3) * 3 + c / 3;
                if (boxes[boxIndex].contains(num)) return false;
                boxes[boxIndex].add(num);
            }
        }
        
        return true;
    }
}
