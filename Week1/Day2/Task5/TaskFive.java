import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  @author Thinh To, Billy Infante
 */

public class TaskFive{
    public static void main(String[] args){
        String name;
        String[] contacts = {"Billy Infante", "Thinh To", "Craig Marais", "Sanay Moe Oo", "Ralf Fajardo"};

        List<String> contactList = new ArrayList<>(Arrays.asList(contacts));

        if(args.length > 0 ){
            name = args[0];
        
        }
        else{
            System.out.println("Input expected");
            return;
        }

        
        for(String contact : contactList){
            if(contact.toLowerCase().contains(name.toLowerCase())){
                System.out.println(contact + " *");
            }
            else{
                System.out.println(contact);
            }
        }
       
    }
}