import java.io.*;
import java.util.*;




/**
 * @author Billy Infante
 */

public class Program{
    public static void main(String[] args) {
        String fileName;
        int lineCounter, wordsCounter;
        List<String> words = new ArrayList<>();
        Scanner search = new Scanner(System.in);

        wordsCounter = 0;
        lineCounter = 0;


        if(args.length > 0 ){
            fileName = args[0];
        
        }
        else{
            System.out.println("Expect file name and type as argument!");
            return;
        }

        
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] tmpArray;

            while ((line = bufferedReader.readLine()) != null) {
                tmpArray = line.split("[\\s.,!()+]");
                words.addAll(Arrays.asList(tmpArray));
                lineCounter++;
         }
            
            System.out.println("Enter search term: ");
            String word = search.next();

            for(String items : words){
                if(word.equalsIgnoreCase(items)){
                    wordsCounter++;
                }
            }
            System.out.println("Search word: " + word + ","+ " Found: " + wordsCounter);
            System.out.println("Size in byte: " + file.length());
            System.out.println("Name: " + file.getName());
            System.out.println("line: " + lineCounter);
			
            //list of words
            //System.out.println(words);
        }
        catch(FileNotFoundException e){
            System.out.print(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}   


