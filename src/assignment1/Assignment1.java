package assignment1;

import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args){
        int[]array={12,23,-22,0,43,545,-4,-55,43,12,0,-999,-87};
        int negativni=0,pozitivni=0, nule=0;
    
        for(int i=0; i<array.length; i++){
            if(array[i]<0)
                negativni++;
        
         else if(array[i]>0)
        pozitivni++;
        
        else if(array[i]==0);
        nule++;
        }
        nule=array.length - negativni - pozitivni;
        
      
        int[] NegBr = new int[negativni];
        int[] PozBr = new int[pozitivni];
        int[] Nule = new int[nule];
        Nule = new int[nule];
        
        int j=0,k=0,h=0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]<0){
                NegBr[j]=array[i];
                j++;
            }
      
            else if (array[i]>0 && array[i]!=0){
                PozBr[k]=array[i];
                k++;
            }
            else if (array[i]==0){
               Nule[h] = array[i];              
}        
            }
    int i;
     System.out.println("Duplirani elementi su:");
     for (i=0;i<array.length;i++){
         for(j=i+1;j<array.length;j++){
             if(array[i]==array[j])
                 System.out.println( " " + array[i]);
             
         }
     }
        
        System.out.println("array=" + Arrays.toString(array));
        System.out.println("NegBr=" + Arrays.toString(NegBr));
        System.out.println("PozBr=" + Arrays.toString(PozBr));
        System.out.println("Nule=" + Arrays.toString(Nule));
    }
   
    } 


    