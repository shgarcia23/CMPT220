/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter A word or name");
        Scanner sc=new Scanner(System.in);
        String userinput=sc.nextLine();
        for(int i =0 ;i<userinput.length();i++){
               
            System.out.println(userinput.charAt(i));  
    
            }

        }
    }
///since we had did the last problem in class i knew the the .
//length was the way to get the idex of the string so i kept on
// trying different things until i was able to get my output  
