public class Main {
    //Scrivere un programma che contenga una classe che definisce uno Studente che abbia
    // come proprietà nome, cognome ed identificativo.
    //Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
    //Nel main dichiarare un oggetto di tipo Studente.
    public static void main(String[] args){
        Student student1 = new Student("Gino", "Rossi", 123456);

        System.out.println("Il nome dello studente è: " + student1.getName());
        System.out.println("Il cognome dello studente è: " + student1.getSurname());
        System.out.println("ID studente: " + student1.getId());

        student1.setName("Stefano");
        student1.setSurname("Verdi");
        student1.setId(123444);
        System.out.println("Richiesta di modifica nome: " + student1.getName());
        System.out.println("Richiesta di modifica cognome: " + student1.getSurname());
        System.out.println("Richiesta di modifica ID: " + student1.getId());
    }
}