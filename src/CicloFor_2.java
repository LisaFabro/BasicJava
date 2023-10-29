public class CicloFor_2 {
    //metodo che prende in ingresso un numero e il massimo numero di risultati
    // che vuoi avere e stampi tutti i numeri naturali in ordine inverso
    // (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi
    // 3 risultati mi aspetto in uscita [6 5 4] stampati).
    public static void main(String args[]) {
        int numDb= 11;
        int var= 10;
        countDown(numDb, var);
    }
    public static void countDown(int num1, int num2){
        for(int i= 0 ; i<num2 ; i++){
            System.out.println(num1 + " meno " + i + " = " + (num1 - i));
        }
    }
}
