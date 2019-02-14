/** 
 *  @author Billy Infante.
 *  It's bad practice to use public setters in constructors,
 *  because another subclasses which extends this class could override the setters.
 *  And then your constuctor will not set the fields problably.
 */

public class Person{
    private String firstName, lastName, phoneNumber;
     
    
    //Default constructor
    public Person(){

    }

    public Person(String firstName, String lastName, String phoneNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
    }


    public String getFirstName(){
      return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
      }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    @Override
    public String toString(){
        return String.format("%s\t%s\t%s", getFirstName(), getLastName(), getPhoneNumber());
    }



    private void setFirstName(String firstName){ 
        if(firstName.isEmpty()){
            throw new IllegalArgumentException("Must contain a name");
        }
        else{       
        this.firstName = firstName.trim();
        }

    }

    private void setLastName(String lastName){        
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("Must contain last name");
        }
        else{
            this.lastName = lastName.trim();
        }
    }


    private void setPhoneNumber(String phoneNumber){
        if(phoneNumber.isEmpty()){
            throw new IllegalArgumentException("Must contain phone number");
        }        
        else{
            this.phoneNumber = phoneNumber.trim();
        }

    }



}