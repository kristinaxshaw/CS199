// Kristina Shaw
// CS 176
// Input Output Files

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
      boolean fileFound = false;
      
      // loops until file is found
      while(fileFound == false) 
      {
    	  try {
    		  // creates keyboard scanner for user input
    		  Scanner keyboard = new Scanner(System.in);
        	  System.out.println("Please enter the path to open "
        	  		+ "the input file for example "
        	  		+ "C:\\\\Downloads\\\\lines.txt : ");
        	  String inputFileName = keyboard.next();
        	  
        	  // input file object given the file address that was entered
        	  File inputFile = new File(inputFileName);
        	  //output file found in project file or created in project file
              PrintWriter outputFile = new PrintWriter("outlines.txt");
        	  
              // scanner for input file
              Scanner in = new Scanner(inputFile);
              // while there are lines in the input file
              while (in.hasNext()) 
              {
              // send line to output file
              String what = in.next();
              outputFile.println(what);
              }
              // close scanners
              in.close();
              outputFile.close();
              keyboard.close();
              
              // set to true to stop the loop since file has been found
              fileFound = true;
              System.out.println("Input file found, data sent to output file.");
          }

          catch(FileNotFoundException e)
          {
        	  System.out.println("File is not found, please try again");
          }
      }
 
      
   }
}