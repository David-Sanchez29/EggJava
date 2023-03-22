
package Arrays;
//-10 10

public class Varios {
    
    
    public static int []generaArrayInt(int dim, int rMin,int rMax){
        
        int array[]=new int[dim];
        int minimo=rMin;
        if (rMin<0)
            rMin=rMin*(-1);
        
        if (rMax<0)
            rMax=rMax*(-1);
        
        rMax=rMin+rMax;
        
        for (int i = 0; i < array.length; i++) {
           array[i]=(int)((Math.random()*(rMax+1))+minimo);
            
        }
        return array;
    }
    
    
    public static int[] devolverVector(){
        
        int[] vector = new int[5];
        

return vector;
    }

    
}
