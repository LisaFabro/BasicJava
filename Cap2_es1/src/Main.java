public class Main {
    //Scrivere un programma che contenga una classe che definisce uno Studente che abbia
    // come proprietà nome, cognome ed identificativo.
    //Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
    //Nel main dichiarare un oggetto di tipo Studente.
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Gino";
        student1.surname = "Rossi";
        student1.id = 123456;

        System.out.println(student1);
    }
}