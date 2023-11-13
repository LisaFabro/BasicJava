public class CicloFor_1 {
    //Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
    // restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.
    public static void main(String args[]) {
        int numDb = 3;
        printTab(numDb);
    }

    public static void printTab(int x){
        int  mult=0;
        for (int y=1 ; y<=10 ; y++){
            int result= x*y;
            System.out.println(x + " * " + y + " = " + result);
        };
    }
}
