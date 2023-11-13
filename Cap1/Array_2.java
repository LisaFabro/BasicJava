public class Array_2 {
    //Metodo che crea un array e lo riempie con dei caratteri.
    //Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.
    public static void main(String[] args){
        char[] caratteri= newArr();
        System.out.println("Il numero di volte in cui è presente il carattere 'a' è " + checkArr(caratteri));
    }
    public static char[] newArr(){
        char[] array= new char[]{'f', 'ì', '+', 't', 'a'};
        return array;
    }
    public static int checkArr(char[] arr) {
        int countA = 0;
        for (char character : arr) {
            if (character == 'a') {
                countA++;
            }
        }
        return countA;
    }
}
