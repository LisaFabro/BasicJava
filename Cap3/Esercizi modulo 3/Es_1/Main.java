package Es_1;
public class Main {
    //Scrivere un programma che contenga una classe chiamata Es_1.Animale ed un metodo chiamato faiIlVerso()
    // che stampi il verso dell'animale. Crea poi una sottoclasse chiamata Es_1.Gatto che fa override del
    // metodo faiIlVerso() per miagolare. Prova quindi a far stampare il verso di Es_1.Animale e di Es_1.Gatto.
   public static void main(String[] args) {
       Animale animale = new Animale();
       Gatto gatto = new Gatto();

       animale.faiIlVerso();
       gatto.faiIlVerso();
   }
}
