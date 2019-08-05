import java.util.HashSet;

class ValidSudoku {

    public boolean isRowValid(char[][] board, int row){
        HashSet<Integer> rowSet = new HashSet<>();

        for(int i=0;i<board[0].length;i++){
            if(rowSet.contains(board[row][i])){
                return false;
            }
            else{
                if(board[row][i] != '.'){
                    rowSet.add(board[row][i]);
                }
            }
        }
        return true;
    }

    public boolean isColValid(char[][] board, int col){
        HashSet<Integer> colSet = new HashSet<>();

        for(int i=0;i<board.length;i++){
            if(colSet.contains(board[i][col])){
                return false;
            }
            else{
                if(board[i][col] != '.'){
                    colSet.add(board[i][col]);
                }
            }
        }
        return true;
    }

    public boolean isBoxValid(char[][] board, int row, int col){
        // 
        int rowStartIndex = (row/3) * 3;
        int rowEndIndex = (row/3)* 3 + 3;

        int colStartIndex = (col/3) * 3;
        int colEndIndex = (col/3) * 3 + 3;

        //
        HashSet<Integer> boxSet = new HashSet<>();


        for(int i=rowStartIndex;i<rowEndIndex;i++){
            for(int j=colStartIndex;j<colEndIndex;j++){
                if(boxSet.contains(board[i][j]){
                    return false;
                }
                else{
                    if(board[i][j] != '.'){
                        boxSet.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }

    public boolean isValid(char[][] board, int row, int col){

        // if row is valid
        // if col is valid
        // if current box is valid

        return isRowValid(board, row) && isColValid(board, col) && isBoxValid(board, row, col);

        
    }
    public boolean isValidSudoku(char[][] board) {



        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(!isValid(board, i, j)){
                    return false;
                }
            }
        }
       
        return true;
    }
}

class Solution {
    public static void main(String[] args){
        System.out.println("Valid Sudoku");
    }
}