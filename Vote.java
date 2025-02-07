import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        try{
        File file=new file("input.txt");
        Scanner sc=new Scanner(file);
        int age=sc.nextInt();
        if (age>=18) {
           return "Eligible";
        }else {
           return "Not Eligible";
        }
    }
  catch (FileNotFoundException e){
    System.out.println("Error:File not found");
    e.printstacktrace();
  }
}
}
