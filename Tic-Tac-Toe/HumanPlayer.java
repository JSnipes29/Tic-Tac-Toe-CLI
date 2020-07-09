import java.util.Scanner;
public class HumanPlayer implements Player
{
  private String piece;
  private int player;
  private Scanner input;
  public HumanPlayer(String piece, int player, Scanner scan)
  {
    this.piece = piece;
    this.player = player;
    input = scan;
  
  
  }
  public void choose()
  {
    System.out.println("Player " + player +  ", select where you would like to go:");
    String selection = input.nextLine();
    while(!Function.tryParseInt(selection) || (Integer.parseInt(selection) < 1 || Integer.parseInt(selection) > 9) || !Game.changeBoard(this,Integer.parseInt(selection)))
    {
      System.out.println("Please select a number from 1 to 9, that isn't selected:");
      selection = input.nextLine();
      
      
    }
    
    
    
  }
  public String getPiece()
  {
    return piece;
  }



}