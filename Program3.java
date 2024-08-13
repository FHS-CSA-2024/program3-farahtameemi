//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

public class Program3 {
    public static void main(String[] args){
        //Make a scanner
        Scanner myScanner = new Scanner(System.in);
        //Create my variables (4)
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        //Ask for user input
        System.out.println("Please enter the length:");
        //Get input
        length = myScanner.nextInt();
        
        System.out.println("Please enter the width:");
        width = myScanner.nextInt();
        //Calculate
        
        //Output
        System.out.println("The length is: " + length);
        System.out.println("The width is: " + width); 
        
        
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("The Area is " + area);
        System.out.println("The Perimeter is " + perimeter);
        
        
    }
}




//Paste console output below:
/*
Please enter the length:
143
Please enter the width:
82
The length is: 143
The width is: 82
The Area is 11726
The Perimeter is 450

*/
