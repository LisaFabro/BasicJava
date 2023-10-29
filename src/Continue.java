public class Continue {
    //metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
    // la stampa dovrà saltare il valore uguale a 5.
    public static void main(String args[]) {
        int num= 7;
        print(num);
    }
    public static void print(int x){
        for(int i=0 ; i<=x ;i++){
            if(i == 5){
                continue;
            };
            System.out.println(i);
        }
    }
}
