import file.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args) {
    try{
      File file=new File("input.txt");
      int even=0,odd=0;
       Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        even++;
    }else{
        odd++;
        }
    }
      System.out.println("odd:"+odd+"\neven:"+even);
      sc.close();
    }catch(FileNotFoundException e){
       System.out.println("Error:File not found.");
      e.printStackTrace();
    }
  }
}
      
      
   
	
