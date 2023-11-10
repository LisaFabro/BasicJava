package Es_8;

public class Main8 {
    //Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode in un indice specifico
    // all'interno di una stringa e lo stampi. Il metodo dovrà avere nel costruttore una stringa ed una posizione
    // e dovrà resituire il carattere in unicode o una stringa di errore. Per la creazione della stringa
    // di risultato dovrebbe essere utilizzato StringBuilder.

    public static void main(String[] args){
        String phrase = "oggi è una brutta giornata";
        String result = findUnicode(phrase, 50);

        System.out.println(result);
    }
    public static String findUnicode(String phrase, int index){
        StringBuilder answer = new StringBuilder();
        if (index>0 && index <= phrase.length()){
            answer.append(phrase.codePointAt(index));
         }else{
        answer.append("error");
    }
        return answer.toString();
    }
}
