
import java.util.Scanner;
import java.io.*;

public class FileFilter {
    public static void main (String [] args) throws IOException{
        Queue myQueue = new Queue(100);
        File input1 = new File("READDOCQ.txt");
        PrintWriter outputFile1 = new PrintWriter("FILTERED.txt");
        String Basket;
        
        if(!input1.exists()){
            System.out.println("File Does not exist");    
        }
        else{
            int it =0;
            Scanner read1 = new Scanner(input1);
            while(read1.hasNextLine()){
                Basket = read1.nextLine();
                
                boolean HasALine = read1.hasNextLine();
                
                if(HasALine){
                    Basket += "\n";
                }
                for(int i = 0; i<Basket.length();i++){
                char single = Basket.charAt(i);
                String pusher1 = Character.toString(single);
                myQueue.enqueue(pusher1);
                
            }
           }
          while(!myQueue.isEmpty()){
                String temp = myQueue.dequeue();
                String ch;
                char changer = temp.charAt(0);
                if(Character.isLowerCase(changer)){
                    ch = Character.toString(Character.toUpperCase(changer));
                }
                else if(Character.isUpperCase(changer)){ 
                    ch = Character.toString(Character.toLowerCase(changer));
                }
                else{
                    ch = Character.toString(changer);
                }
                
                outputFile1.print(ch);
        }
outputFile1.close();
          read1.close();
    }

}
}

