import java.io.*;
public class P4 
{
    public static void main(String[] args) 
    {
        try 
        {  
            // creating an instance of the File class to open file  
            FileReader filereader = new FileReader("DSA.txt");   
        }  
        // catching exception thrown by the try block  
        catch(Exception e) {  
            System.out.println(e);  
        }       
    }    
}
