public class Student {
    private String name;
    private String surname;
    private int id;
    public Student(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return id;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public String setSurname(String surname){
        this.surname = surname;
        return surname;
    }
    public int setId(int id){
        this.id = id;
        return id;
    }
    @Override
    public String toString() {
        return "Cap2_es1Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}