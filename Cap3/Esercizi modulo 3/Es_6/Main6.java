package Es_6;
public class Main6 {
    //Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea()
    // che stampi l'area della forma specifica. Crea poi due sottoclassi Triangolo e Rettangolo che
    // estendono Forma e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.
    public static void main(String[] args){
        Forma6 forma = new Forma6();
        Rettangolo6 rettangolo = new Rettangolo6(10,3);
        Triangolo6 triangolo = new Triangolo6(4,6);

        System.out.println("Valore default = " + forma.calcolaArea());
        System.out.println("Area del " + tipoForma.Rettangolo + " = " + rettangolo.calcolaArea());
        System.out.println("Area del " + tipoForma.Triangolo + " = " + triangolo.calcolaArea());
    }
}
