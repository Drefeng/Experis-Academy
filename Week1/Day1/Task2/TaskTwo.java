public class TaskTwo{
    public static void main(String[] args){
    
    try{
        String name = args[0];
        System.out.println("Hello, your name is " + name + " starts with an " + name.charAt(0) + " and is " + name.length() + " characters long.");
        }
    catch(Exception e){
        System.out.println("Input can not be 0!");
        }

    }
} 