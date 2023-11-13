import java.util.Arrays;

public class ArrayMultidimens_2 {
    //Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di scambiare le sue
    // righe e le sue colonne stampandola a video. Matrice di partenza
    //Matrice risultato
    // 1 4
    // 2 5
    // 3 6
    public static void main(String[] args){
        int[][] numDb= {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(modMatrice(numDb)));
    }
    public static int[][] modMatrice(int[][] arr){
        int[][] arr2= new int[3][2];    //[0,1,2] sono le righe - [0,1] sono i val su riga
        for(int i=0 ; i<arr2[i].length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                arr2[j][i] = arr[i][j];
            }
        }
        return arr2;
    }
}
