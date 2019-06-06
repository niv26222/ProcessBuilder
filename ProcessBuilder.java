// Java code illustrating ProcessBuilder command(List<String> command) 
import java.lang.*; 
import java.io.*; 
import java.util.*; 
class ProcessBuilderDemo 
{ 
    public static void main(String[] arg) throws IOException 
    { 
        // creating list of process 
        List<String> list = new ArrayList<String>(); 
        list.add("notepad.exe"); 
        list.add("xyz.txt"); 
  
        // create the process 
        ProcessBuilder build = new ProcessBuilder(list); 
          
        // checking the command in list 
        System.out.println("command: " + build.command()); 
          
    } 
} 