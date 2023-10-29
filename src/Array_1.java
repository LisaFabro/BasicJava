public class Array_1 {
    //Metodo che crea un array e lo riempie con i numeri da 1 a 10 e
    //calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
    public static void main(String[] args){
        int[] array = createArr();
        System.out.println(sumArray(array));
    }
    public static int[] createArr(){
        int[] array = new int[10];
        for(int i=0 ; i<array.length ; i++){
            array[i]= i+1;
        }
        return array;
    }
    public static int sumArray(int[] array){
        int sumElements= 0;
        for(int element : array){
            sumElements+= element;
        }
        return sumElements;
    }
}
