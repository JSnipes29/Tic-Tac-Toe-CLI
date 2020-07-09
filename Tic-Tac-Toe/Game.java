import java.util.Scanner;
public class Game
{
  private HumanPlayer playerOne;
  private HumanPlayer playerTwo;
  private static String[][] board;
  private static boolean[][] boolBoard;
  private Scanner input;
  public void start()
  {
    System.out.println("!!!Welcome to Tic-Tac-Toe!!!");
    
    
    
  }
  public int gameMode()
  {
    System.out.println("Enter 1 for one player mode or enter 2 for two player mode:");
    String choice = input.nextLine();
    while(!choice.equals("1") && !choice.equals("2"))
    {
      System.out.println("Please enter 1 for one player mode or 2 for two player mode:");
      choice = input.nextLine();
    
    }
    return Integer.parseInt(choice);
  
  }
  public Game(HumanPlayer p1, HumanPlayer p2, Scanner scan)
  {
    playerOne = p1;
    playerTwo = p2;
    board = new String[3][3];
    boolBoard = new boolean[3][3];
    input = scan;
  
    start();
  }
  public boolean game()
  {
    int count = 0;
    instructions();
    clearBoard();
    while(true)
    {
    playerOne.choose();
    printBoard();
    count++;
    if(checkWinner(playerOne))
    {
      System.out.println("Player one won!!!");
      break;
    
    }
   playerTwo.choose();
    printBoard();
    count++;
    if(checkWinner(playerTwo))
    {
      System.out.println("Player two won!!!");
      break;
    }
    if(count >= 9)
    {
      System.out.println("The game ended in a tie.");
      break;
    
    }
    }
    System.out.println("Would you like to play again? [Y/N]");
    String playAgain = input.nextLine();
    while(!playAgain.equals("y") && !playAgain.equals("Y") && !playAgain.equals("N") && !playAgain.equals("n"))
    {
      System.out.println("Please enter y or n to continue.");
      playAgain = input.nextLine();
    
    }
    if(playAgain.equals("y") || playAgain.equals("Y"))
    {
      return true;
    
    }
    else
    {
      return false;
    }
  }
  public void instructions()
  {
    System.out.println("Type the number that you would like to place your piece");
    int index = 1;
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        board[i][j] = "" + index;
        index++;
        
      }
    
    }
    printBoard();
    
  
  
  
  }
  public void clearBoard()
  {
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        board[i][j] = " ";
      
      }
    
    
    }
    for(int r = 0; r < boolBoard.length; r++)
    {
      for(int c = 0; c < boolBoard[r].length; c++)
      {
        boolBoard[r][c] = false;
      
      }
    }
    
    
  }
  public static  boolean changeBoard(HumanPlayer player, int selection)
  {
    selection -= 1;
    if(boolBoard[selection / 3][selection % 3] == true)
    {
      return false;
      
      
    }
    else
    {
      boolBoard[selection / 3][selection % 3] = true;
      board[selection / 3][selection % 3] = player.getPiece();
      
      
      
      return true;
    }
    
    
    
  }
  public void printBoard()
  {
    for(int i = 0; i < board.length; i++)
    {
      for(int c = 0; c < board[i].length; c++)
      {
        if(c == 2)
        {
          System.out.print(board[i][c]);
        }
        else
        {
          System.out.print(board[i][c] + " | ");
        
        }
      
      }
      System.out.println();
    }
    
  }
  public boolean checkWinner(Player player)
  {
    
    if((board[0][0].equals(player.getPiece()) && board[0][1].equals(player.getPiece()) && board[0][2].equals(player.getPiece())) ||
  (board[1][0].equals(player.getPiece()) && board[1][1].equals(player.getPiece()) && board[1][2].equals(player.getPiece())) ||
  (board[2][0].equals(player.getPiece()) && board[2][1].equals(player.getPiece()) && board[2][2].equals(player.getPiece())) ||
  (board[0][0].equals(player.getPiece()) && board[1][0].equals(player.getPiece()) && board[2][0].equals(player.getPiece())) ||
  (board[0][1].equals(player.getPiece()) && board[1][1].equals(player.getPiece()) && board[2][1].equals(player.getPiece())) ||
  (board[0][2].equals(player.getPiece()) && board[1][2].equals(player.getPiece()) && board[2][2].equals(player.getPiece())) || 
  (board[0][0].equals(player.getPiece()) && board[1][1].equals(player.getPiece()) && board[2][2].equals(player.getPiece())) ||
  (board[2][0].equals(player.getPiece()) && board[1][1].equals(player.getPiece()) && board[0][2].equals(player.getPiece())))
    {
    
      return true;
    
    
    }
    
    
    
    return false;
  }




}