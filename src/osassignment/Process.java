package osassignment;

import java.util.Random;

public class Process {
    
    int[] arr;int PC=0,now_exec=0,next_proc_exec,q,exec_time,inst_length,i,j,k,id,color,rem_inst,IR=0,next_Id,last_exec,next_inst_exec=0;
    
    public Process(int q,int inst_length,int id,int next_proc_exec) {
        rem_inst=inst_length;
        color=id;
        next_inst_exec+=q;
        IR+=(q-1);
        this.q=q;
        this.next_proc_exec=next_proc_exec;
        exec_time=inst_length;
        this.inst_length=inst_length;
        PC=(OSAssignment.p[next_proc_exec]).next_inst_exec;
        arr=new int[inst_length];
        for(i=0;i<inst_length;i++){
            arr[i]=((int)(Math.random()*80))+1;
        }
        this.id=id;
    }
    
    void PCB(int next_proc_exec){
        IR+=(q-1);
        PC=(OSAssignment.p[next_proc_exec]).next_inst_exec;
    }
    
    void PSW(){
        next_inst_exec+=q;
        rem_inst-=q;
        now_exec+=q;
    }

    public String toString() {        
        StringBuilder sb=new StringBuilder((char)27+"[3"+id+1+"m");
        sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        sb.append("PCB\n");
        sb.append("ID->"+id+"\n");
        sb.append("IR->p"+id+"["+IR+"]\n");
        sb.append("PC->p"+next_proc_exec+"["+PC+"]\n");
        sb.append("flag->"+OSAssignment.flag+"\n");
        sb.append("PCI\n");
        sb.append("Sheduling Algorithem->Round Robin\n");
        sb.append("q->"+q+"\n");
        sb.append("Running State->"+OSAssignment.run_state+"\n");
        sb.append("PCW\n");
        sb.append("Total Instructions=Execution Time->"+exec_time+"\n");
        sb.append("next instructio->"+next_inst_exec+"\n");
        sb.append("Processed Data:\n");
        for(int i=now_exec;i<(now_exec+q);i++){
            sb.append("p"+id+"["+i+"]->"+arr[i]+"\n");
        }
        
        return sb.toString();
    }
    
}

