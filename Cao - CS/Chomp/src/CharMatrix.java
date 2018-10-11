/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
//  int rows;
//  int cols;
  private char[][] grid;

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
	   //new char[rows][cols];- wrong, syntax error
	  grid = new char[rows][cols];
   for(int r = 0; r < grid.length; r++){
	   for(int c = 0; c < grid[0].length; c++){
		   grid[r][c]= ' ';
	   }
   }
	  //new CharMatrix(rows, cols, ' ');//**** cool code
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
	   grid = new char[rows][cols];//*******
	   for(int r = 0; r < grid.length; r++){
		   for(int c = 0; c < grid[0].length; c++){
			   grid[r][c]= fill;
		   }
	   }
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
   return grid.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
   return grid[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
  return grid[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
   grid[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
   return grid[row][col] == ' ';
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  //*********
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
	   for(int r = row0; r <= row1; r++){
		   for(int c = col0; c <= col1; c++){
			   grid[r][c]= fill;
		   }
	   }
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  for(int r = row0; r <= row1; r++){
		   for(int c = col0; c <= col1; c++){
			   grid[r][c]= ' ';
		   }
	   }
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
	  int counter = 0;
	  for(int i=0; i < grid[0].length; i++){
		  if (grid[row][i] != ' ')
			 counter++;
	  }
	  return counter;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
	  int counter =0;
   for(int i=0; i < grid.length; i++ ){
	   if(grid[i][col] != ' ')
		   counter++;
   }
   return counter;
  }
}
