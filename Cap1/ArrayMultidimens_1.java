public class ArrayMultidimens_1 {
    //metodo che permette di inizializzare una matrice riempita con dei valori a
    // vostro piacimento e restituisca la somma degli elementi sulla prima riga
    public static void main(String[] args){
        System.out.println("La somma della prima riga è " + sommaPrimiEl(newArrMulti()));
    }
    public static int[][] newArrMulti(){
        int[][] matrix= new int[3][3];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                matrix[i][j]=3;
            }
        }
        return matrix;
    }
    public static int sommaPrimiEl(int[][] x){
        int sommaPrimaRiga = 0;
        for(int riga1: x[0]){
            sommaPrimaRiga+=riga1;
        }
        return sommaPrimaRiga;
    }
}