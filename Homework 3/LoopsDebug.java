import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the fatorial: ");
        Scanner sc=new Scanner(System.in);
        int user_num =sc.nextInt();
        int sum=1;
        //here's a hint
        for (int i = 1; i <= user_num; i++){
        sum *=i;

        }
        System.out.println(sum);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int usernumONe_=sc.nextInt();
        int sumone=0;
        for (int i = 1; i <= usernumONe_; i+=2){
            sumone=sumone+i;
        }
        System.out.println(sumone);
        //No hint! what do you need to complete this task?


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            run=false;
          System.out.println(
          "I printed once!");
        }

        //P5: Take a string from the user and print them the reverse!
       System.out.println("Problem 5");
       String userinput=sc.nextLine();
       char ch;

        //hint
        String reverse = "";
        userinput=sc.nextLine();
        for(int i =0 ;i<userinput.length();i++){
            ch=userinput.charAt(i);
            reverse=ch+reverse;

        }System.out.println("reverse input"+"="+reverse);

    }
}

       

    }
}
