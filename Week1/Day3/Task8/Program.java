import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *  @author Billy Infante
 */

public class Program{
    public static void main(String[] args){


        String name;
        Person[] contacts = {
            new Person("Billy", "Infante", "111 11 111"),
            new Person("Thinh", "To", "222 22 222"),
            new Person("Craig", "Marais", "333 33 333"),
            new Person("Ralf", "Fajardo", "444 44 444"),
            new Person("Sanay", "Oo", "555 55 555"),
            
            };

        List<Person> contactList = new ArrayList<>(Arrays.asList(contacts));

        if(args.length > 0 ){
            name = args[0];
        
        }
        else{
            System.out.println("Input expected");
            return;
        }

        
        for(Person contact : contactList){
            if(contact.toString().toLowerCase().contains(name.toLowerCase())){
                System.out.println(contact + " *");
            }
            else{
                System.out.println(contact);
            }

            
        }
       
    }
}