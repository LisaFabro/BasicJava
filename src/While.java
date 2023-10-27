public class While {
    public static void main(String[] args) {
        int limite = 5;
        System.out.println("La somma dei numeri precedenti a " + limite + " è " + sum(limite));
    }
    public static int sum(int x){
        int num= 0;
        int somma= 0;
        while (num < x){
            somma= somma + num;
            num++;
        }
        return somma;
    }
}
