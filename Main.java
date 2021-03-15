import mypack.*;
import java.io.File;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
       
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to The LockedMe.com \n");
        System.out.println("\t Devloper : Mahak Shukla \n");
        System.out.println("\t Company  : Lockers Pvt Ltd \n");
        System.out.println("**************************************");
        Main m =new Main();
        optionsSelection();
       

    }
    private static void optionsSelection() {
        String[] arr = {"1. Retrive file names ",
                "2. Bussiness Level Operation",
                "3. Close the application"
        };
        int[] arr1 = {1,2,3};
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
                    File dir = new File("C:\\Users\\mashukla\\eclipse-workspace\\files\\");
                         String[] child = dir.list();
                         
                         if (child == null) {
                            System.out.println( "Either dir does not exist or is not a directory");
                         } else {
                            for (int i = 0; i< child.length; i++) {
                               String filename = child[i];
                               System.out.println(filename);
                            }
                         }
                        optionsSelection();
                        break;
                       
                    case 2:
                       BusinessLO blo= new BusinessLO();
                       blo.selection();
                       optionsSelection();
                        break;
                   
                    case 3:
                        closeApp();
                        break;
                       
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }

}
