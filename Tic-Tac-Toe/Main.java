import java.util.Scanner;
public class Main
{

  public static void main(String[] args)
  {
    Game game = new Game(new HumanPlayer("x",1,new Scanner(System.in)), new HumanPlayer("o",2,new Scanner(System.in)), new Scanner(System.in));
    while(game.game())
   {
      
    
    }
   // System.out.println("Press any key to exit.");
    
    
  
  }

}