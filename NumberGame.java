public class NumberGame
{
  public static void main(String[] args)
{
   Scanner sc=nw Scanner(System.in);
int chances=8;
int finals=0;
boolean playAgain=true;
System.out.println("Welcome buddy");
System.out.println("hey Buddy you have about"+chances+"to win the game");
while(playAgain)
{
int rand=getrandN(1,100);
Boolean guess=false;
for(int i=0;i<chances;i++)
{
System.out.println("Enter your guess:");
int user=sc.nextInt();
if(user==rand)
{
guess=true;
finals+=1;
System.out.println("you won it.");
break;}
else if(user>rand)
{
System.out.println("Too high");
}
else
{
System.out.println("Too low");
}
}
if(guess==false)
{
System.out.println("sorry buddy u lost the chances.The number is"+rand);
}
System.out.println("do you want to play again(y/n)");
String pA=sc.next();
playAgain=pA.equalsIgnoreCase("y");
}
System.out.println("that's it  buddy,hope you enjoyed it");
System.out.println("here is your score"+finals);
public static int getrandN(int min,int max)
{
return (int)(math.random()*(max-min+1)+min);
}
}