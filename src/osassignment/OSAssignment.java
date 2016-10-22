package osassignment;

import java.util.Scanner;

public class OSAssignment {
    
    static int flag=0;static Process[] p;static String run_state="running";
    
    public static void main(String[] args) {
        int q,n,i,j,k,l,next_proc_Id=0;int[] inst_length;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter no of processes:");
        n=in.nextInt();
        p=new Process[n];
        inst_length=new int[n];
        System.out.print("Enter no of Instruction space separated:");
        for(i=0;i<n;i++){
            inst_length[i]=in.nextInt();
        }
        System.out.print("Enter Quantum:");
        q=in.nextInt();
        for(i=0;i<n;i++){
            p[i]=new Process();
        }
        //here id=i
        for(i=0;i<n;i++){
            if(next_proc_Id>(n-1)){
                next_proc_Id=0;
            }
            else{
                next_proc_Id=i+1;
            }
            p[i]=new Process(q,inst_length[i],i,next_proc_Id);
        }
        i=j=0;
        while(true){
            if(i==0){
                for(j=0;j<n;j++){
                    System.out.println(p[j]);
                }
            }
            else{
                for(j=0;j<n;j++){
                    if(p[j].rem_inst!=0){
                        if(p[p[j].next_proc_exec].rem_inst!=0){
                            
                        }
                        else{
                            
                        }
                        p[j].PCB(1);
                        p[j].PSW();
                        System.out.println(p[j]);      
                    }
                }
            }
            i++;
            break;
        }
        
    }
    
}
