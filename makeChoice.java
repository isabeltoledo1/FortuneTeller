import java.util.*;
class makeChoice{


public void choice (){
Scanner in = new Scanner (System.in);
Random rand = new Random();

 int number = 0;
 int choice = 0;
 String color = "";
 String play = "";
 
do{
System.out.println("Ask your Cootie Catcher a question: ");
in.nextLine();

System.out.println("Choose a color(red, yellow, green, blue): ");
color = in.nextLine();


//if (color.length() 
// switch case to print messages

 //ArrayList size 8 for each of the messages on the cootie catcher. 
ArrayList<String>messages = new ArrayList<>(); 
messages.add("Yes!");		//Adding messages
messages.add("Not Likely");
messages.add("Better luck next time");	
messages.add("Very Likely");
messages.add("You got this!");
messages.add("Try again tomorrow");
messages.add("You wish");
messages.add("Hmm. i'll think about it");


if (color.equalsIgnoreCase("yellow") || color == "blue")
{
System.out.println("Choose a number (1, 2, 5, 6)");
number = in.nextInt ();
do { System.out.println("Sorry, not a valid entry please choose (1, 2, 5 or 6)");
number = in.nextInt ();
in.nextLine();
}while (number != 1 && number !=2 && number != 5 && number != 6);
} 


else {
System.out.println("Choose a number (3, 4, 7, 8)");
number = in.nextInt ();
do { System.out.println("Sorry, not a valid entry please choose (3, 4, 7 or 8)");
number = in.nextInt ();
in.nextLine();
}while (number != 3 && number != 4 && number != 7 && number != 8);
} 


System.out.println ("Cootie says: " + messages.get(number)); 
System.out.println ("Press Q to quit or P to play again");
play = in.nextLine();
}while (!play.equalsIgnoreCase("Q"));



}
}
















