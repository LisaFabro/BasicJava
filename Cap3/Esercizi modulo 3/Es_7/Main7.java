package Es_7;
public class Main7 {
    //Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
    //Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi
    // sul risultato del confronto. Per la creazione della stringa di risultato usa StringBuilder.
    public static void main(String[] args){
        String phrase1 = "oggi è una bella giornata";
        String phrase2 = "oggi è una brutta giornata";

        System.out.println(compPhrases(phrase1, phrase2));
    }
    public static String compPhrases(String var1, String var2){
        int result = var1.compareToIgnoreCase(var2);
        StringBuilder answer = new StringBuilder();
        answer.append("Le due stringhe sono ");
        if(result == 0){
            answer.append("uguali");
        }else{
            answer.append("diverse");
        }
        return answer.toString();
    }
}
