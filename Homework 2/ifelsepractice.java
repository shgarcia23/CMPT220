//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class Main {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("which animal are you ");
    System.out.println("How old are you?");
    int age=sc.nextInt();

    System.out.println("whats your favorite color between (red,blue,yellow)");
    sc.nextLine();
    String color=sc.nextLine();

    System.out.println("Male or female");
    String gender=sc.nextLine();

    if(age >= 20 && color.equals("red") && gender.equals("male") ){
        System.out.println("rat");
    }
    else if (age<20 && color.equals("red") && gender.equals("male")){
        System.out.println("cat");
    }
    else if (age>20 && color.equals("red")&& gender.equals("female")){
        System.out.println("dog");
    }
    else if (age<20 && color.equals("red")&& gender.equals("female")){
        System.out.println("rat");
    }
    else if(age>20 && color.equals("blue") && gender.equals("male") ){
        System.out.println("rat");
    }
    else if (age<20 && color.equals("blue") && gender.equals("male")){
        System.out.println("cat");
    }
    else if (age>20 && color.equals("blue")&& gender.equals("female")){
        System.out.println("dog");
    }
    else if (age<20 && color.equals("blue")&& gender.equals("female")){
        System.out.println("rat");
    }
    else if(age>20 && color.equals("yellow") && gender.equals("male") ){
        System.out.println("rat");
    }
    else if (age<20 && color.equals("yellow") && gender.equals("male")){
        System.out.println("cat");
    }
    else if (age>20 && color.equals("yellow")&& gender.equals("female")){
        System.out.println("dog");
    }
    else if (age<20 && color.equals("yellow")&& gender.equals("female")){
        System.out.println("rat");
    }




    
    else {System.out.println("not a combo");}
}
}


