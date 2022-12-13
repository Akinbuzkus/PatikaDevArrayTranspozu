
import java.util.Arrays;


public class PatikaDevArrayMatrisTranspozu {
    public static void main(String[] args) {
        
        int[][] matris={{1,2,3},{4,5,6}};
        int[][] transpoz=new int[matris[0].length][matris.length];
        
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                transpoz[j][i]=matris[i][j];
            }
        }
        System.out.println("Matris :");
        for(int[] mat:matris){
            for(int x:mat){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Transpoz :");
            for(int[] trans :transpoz){
                for(int k: trans){
                    System.out.print(k+" ");
                }
                System.out.println("");
            }
        
        
        
    }
}
