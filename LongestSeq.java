import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class LongestSeq
{
    
    public static void findLIS(int[] arr)
    {
        List<List<Integer>> LIS = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            LIS.add(new ArrayList<>());
        }
        LIS.get(0).add(arr[0]);
        for (int i = 1; i < arr.length; i++)
        {
            
            for (int j = 0; j < i; j++)
            {
                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            }
            LIS.get(i).add(arr[i]);
        } 
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (LIS.get(j).size() < LIS.get(i).size()) {
                j = i;
            }
        }
 
        System.out.print(LIS.get(j));
    }
 
    public static void main(String[] args)
    {
        
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        n=sc.nextInt();  
        if(n<=100) {
        //creates an array in the memory of length 10  
        int[] arr = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {    
               arr[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   
        {  
        System.out.println(arr[i]);  
        }  
          
        findLIS(arr);
        }
        else
        {
        	System.out.println("Range EXCEEDS 100.... plz check");
        }
    }
}
