package Es_3;
public class Main3 {
    //A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area
    // aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area
    // per quest'ultima figura
    public static void main(String[] args){
        Forma3 forma = new Forma3();
        Rettangolo3 rettangolo = new Rettangolo3(3, 5);
        Triangolo3 triangolo = new Triangolo3(4, 7);

        System.out.println("I valori inseriti  per il calcolo delle aree sono base e altezza " + forma.calcolaArea());
        System.out.println("Area del Rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del Triangolo: " + triangolo.calcolaArea());
    }
}
