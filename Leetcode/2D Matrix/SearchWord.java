class Solution {
    int row;
    int col;
    
    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(crossWord(board,i,j,0,word))
                {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean crossWord(char[][] board, int i, int j, int startIndex, String word)
    {
        if(startIndex == word.length())
        {
            return true;
        }
        if(i > row -1 || i < 0 || j < 0 || j > col - 1|| board[i][j] != word.charAt(startIndex))
        {
             return false;
        }
        board[i][j] = '$';
        // check if next char in word can be found in any of the four directions - North, South, West Or East of the current position denoted by startIndex.
        boolean exists = crossWord(board, i-1, j, startIndex+1, word) ||
                         crossWord(board, i+1, j, startIndex+1, word) ||
                         crossWord(board, i, j-1, startIndex+1, word) ||
                         crossWord(board, i, j+1, startIndex+1, word);
        h the char at word's startIndex
        board[i][j] = word.charAt(startIndex);
        // if everything is fine, then exist will be true. Else it will be false
        return exists;
    }
}
