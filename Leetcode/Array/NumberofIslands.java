class Solution {
    public int numIslands(char[][] grid) 
    {
        int countIsland = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == '1')
                {
                    traverseIsland(i,j,grid);
                    countIsland++;
                }
                
            }
        }
        return countIsland;
    }
    public void traverseIsland(int x , int y , char[][] grid)
    {
        if ( x < 0 || x > grid.length-1 || y < 0 || y > grid[0].length-1 || grid[x][y] != '1')
        {
            return;
        }
            
        else
        {
            grid[x][y] = '2';
        }
        traverseIsland(x+1,y,grid);
        traverseIsland(x,y+1,grid);
        traverseIsland(x-1,y,grid);
        traverseIsland(x,y-1,grid);
        
    }
}
