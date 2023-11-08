package Es_3;
public class Main {
    //A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area
    // aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area
    // per quest'ultima figura
    public static void main(String[] args){
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
