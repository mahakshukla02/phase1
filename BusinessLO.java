package mypack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BusinessLO {



public static void main(String[] args) {
          selection();
}

public static void selection() {
       String[] arr = {"1. ADD File ",
               "2. DELETE File",
               "3. SEARCH File",
               "4. QUIT"
       };
       int[] arr1 = {1,2,3,4};
       int  slen = arr1.length;
       for(int i=0; i<slen;i++){
           System.out.println(arr[i]);
           // display the all the Strings mentioned in the String array
       }
       System.out.println("\nEnter your choice:\t");
       Scanner sc = new Scanner(System.in);
       int  options =  sc.nextInt();
       for(int j=1;j<=slen;j++){
           if(options==j){
               switch (options){
                   case 1:
                    newFile();
                    selection();
                    break;
                   
                   case 2:
                    deleteFile();
                    selection();
                    break;
                   
                   case 3:
                    SearchFile();
                    selection();
                    break;
                   
                   case 4:
                    backMain();
                    //m.Main();
                    break;
                   
                   default:
                       System.out.println("You have made an invalid choice!");
                       break;
               }
           }
       }
}


public static void newFile() {
String strPath = "", strName = "";
    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name:");
        strName = br.readLine();
        System.out.println("Enter the file path:");
        strPath = br.readLine();
        File file1 = new File(strPath + "" + strName + ".txt");
        file1.createNewFile();
    }
    catch (Exception ex1) {
    }
}


public static void deleteFile() {

String strPath = "C:\\Users\\mashukla\\eclipse-workspace\\files\\", strName = "";
try {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the file name:");
   strName = br.readLine();
   Path pathOfFile1 = Paths.get(strPath + "" + strName + ".txt");
   Files.delete(pathOfFile1);
     }
catch (IOException e) {
    e.printStackTrace();
         }
}

public static void SearchFile() {
	try {
         String strName="";
         File strPath = new File("C:\\Users\\mashukla\\eclipse-workspace\\files\\");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the file name:");
          strName = br.readLine();
         FilenameFilter filter = new FilenameFilter() {
         public boolean accept(File strPath, String strName) {
         return strName.equalsIgnoreCase(strName);
          }
         };
        String[] files = strPath.list(filter);
        if (files == null) {
              System.out.println("File Not Found");
         }
        else {
           System.out.println("File Found");
        }
	}
	catch(IOException e){
		e.printStackTrace();
	}
}

private static void backMain() {
    System.out.println("Closing your operations... Back to Main Menu \nThank you!");
   
        }

}         