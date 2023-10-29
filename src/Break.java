public class Break {
    //Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
    // e stampa tutti i numeri fino al valore immesso, la stampa dovrà interrompersi
    // se il valore è uguale a 5.
    public static void main(String args[]) {
        int num= 9;
        stopAt(num);
    }

    public static void stopAt(int x){
        for(int i=0 ; i<x ;i++){
            if(i == 5){
                break;
            };
            System.out.println(i);
        }
    }
}
