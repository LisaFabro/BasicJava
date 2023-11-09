package Es_5;

public class Main5 {
    //Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
    //Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano
    // il metodo per il calcolo dell'area.
    public static void main(String[] args){
        Rettangolo5 rettangolo = new Rettangolo5(3,5);
        Triangolo5 triangolo = new Triangolo5(3,8);
        System.out.println("Area del Rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del Triangolo: " + triangolo.calcolaArea());
    }
}
