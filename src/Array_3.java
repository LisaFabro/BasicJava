public class Array_3 {
    //metodo che permetta di rimuovere gli elementi duplicati in un array di interi.
    // L'array ottenuto dovrà essere stampato a video.
    public static void main(String[] arg) {
        int[] numDb = {1, 3, 45, 6, 8, 45, 1, 9};
        System.out.println(java.util.Arrays.toString(noDoubleNum(numDb)));
        //java.until. altrimenti stampa l'hashcode
    }

    public static int[] noDoubleNum(int[] arr) {
        int end = arr.length;  //creo la variabile per la lunghezza di arr2

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {    //accedo all'array e confronto i valori tra 2 posizioni
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;        //mi sposto di una posizione se ho valori uguali
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];               //il valore che voglio prenda
                    }
                    end--; //vado poi ad accorciare la lunghezza dell'array x i valori uguali che tolgo
                    j--;
                }
            }
        }

        int[] arr2 = new int[end];  //lunghezza di arr2
        for (int i = 0; i < end; i++) {   //ciclo e inserisco gli elementi in arr2
            arr2[i] = arr[i];
        }
        return arr2;
    }
}