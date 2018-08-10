import java.util.Scanner;

/**
 * Target Practice
One player artillery game

Player shoots a cannon at a stationary target, adjusting pitch and power of their shot each round until target is hit.  

Target, cannon, and cannonball objects are encapsulated, inherit from GameObject class, and all have a position values. 

Target’s position initialized at game start, random value between 25-100

Cannon has pitch and power values, and a shoot method. Position initialized at 0, shooting moves the cannon back by a distance of 10% of power. Power and pitch should be limited so that shots should have a max distance of 200, minimum of 1


Cannonball created upon shooting, has shot method that gets pitch and power values from cannon and returns new position.

Rounds continue until target is hit, Player is then prompted for new game or quit.



 * @author gabe
 *
 */



public class Game {

	public static void main(String[] args){
		
		
		System.out.println("TARGET PRACTICE");
				
		//game
		boolean quit = false;
		//Cannon cannon = new Cannon(0);
		
		while (quit == false)
		{
			Cannon cannon = new Cannon(0);
			Target target = new Target(100); //(randomly generated each round, from 25-100)

		//round 	
				while (target.getHit() == false)
				{
					System.out.println("Cannon position: "+cannon.getPosition()+".");
					System.out.println("Target position: "+target.getPosition()+".");
					System.out.println("-------------------------------");
					
					System.out.println("Enter pitch (0-90):");
					Scanner scan = new Scanner(System.in);
					int initPitch = (90-scan.nextInt())/90;
					cannon.setPitch(initPitch);
					
					System.out.println("Enter power (0-100):");
					int initPower = scan.nextInt();
					cannon.setPower(initPower);
					
					CannonBall cannonBall = new CannonBall();
					cannon.shoot();
					
					int n = cannonBall.getPosition()-target.getPosition();
			
					if (n==0) 
					{
					target.setHit(true);
					System.out.println("you destroyed the target!");
					}
					else if (n>0)
					{System.out.println("You overshot by "+n+".");}
					else 
					{System.out.println("You undershot by "+(-n)+".");}
				
				}	
				Scanner scan = new Scanner(System.in);
				System.out.println("1, New Game 2. Quit");  
				int q = scan.nextInt();
				if (q == 2) 
					{quit = true;}
		}	


	}

}
