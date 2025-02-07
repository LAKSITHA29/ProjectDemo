import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        try{
        File file=new File("input.txt");
        Scanner sc=new Scanner(file);
        int age=sc.nextInt();
        if (age>=18) {
           System.out.println("Eligible");
        }else {
           System.out.println("Not Eligible");
        }
            sc.close();
    }
  catch (FileNotFoundException e){
    System.out.println("Error:File not found");
    e.printstackTrace();
  }
}
}
