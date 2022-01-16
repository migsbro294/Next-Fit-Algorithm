
import java.util.Scanner;
public class NextFit { 

//Next fit algorithm

 static void NextFitt(int blockSize[], int m, int processSize[], int n) { 
     int frag[] = new int[20],j=1; 
     int 	flag = 0;
     System.out.print("\n\nProcess No.	Process Size	Block no.       Fragment\n"); //displaying the result 
     for (int i = 0; i < n; i++) {  // pick each process and find suitable blocks 
         // according to its size ad assign to it
         // Do not start from beginning 
         while (j < m ) { 
             if (blockSize[j] >= processSize[i]) { 
            	 System.out.print("P"+(i + 1) + " \t\t  " + processSize[i] + "\t\t"  + (j+1) + "\t\t"); 
                 // Reduce available memory in this block. 
                 blockSize[j] -= processSize[i]; 
                 frag[j]=blockSize[j];
                 System.out.println(frag[j]);
                 break; 
             }else {//counting how many times it loops through the block
            		flag++;
             }

             if(flag>m) {//if there is no match it set flag to zero break out from the blocks
            	 System.out.println("P"+(i + 1) + " \t\t  " + processSize[i] + "\t\t"  + "BLOCK..."+"\tBLOCK..."); 
            	 //help in traversing the blocks when there is no match 
            	 flag = 0;
            	 break;
             }
            
             // mod m will help in traversing the blocks from 
             // starting block after we reach the end.  
             j = (j + 1) % m; 
         } 
     } 

 } 

//Driver program 
 public static  void main(String[] args) { 
	 Scanner in =new Scanner(System.in);
	
	 int num;
     int block[] = {100,500,200,450}; //Initially the block
     System.out.print("\n\tPlacement Algorithm Scheme - Next Fit\n");
    
     System.out.print("\nEnter the Number of Process:");
     num=in.nextInt();
     
     int processSize[] = new int[num];
     
     System.out.print("\nEnter the size of the Processes :-\n");
     for(int i =0;i<num;i++) {
    	 System.out.print("Process "+ (i+1)+":");
    	 processSize[i]=in.nextInt();
     }
   
     int m = block.length; 
     NextFitt(block, m, processSize, num); 
 } 
} 

 
