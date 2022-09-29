
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner input=new Scanner("System.in");
  
  String word1= input.nextLine();
  String word2= input.nextLine();
  int num1=input.nextInt();
  int num2=input.nextInt();
  
  if(num1==num2 && (word1).equals (word2)) {
   System.out.println("AND");
    
}else if(num1==num2 || (word1).equals(word2)); {
    System.out.println("OR");  

}  
}
}