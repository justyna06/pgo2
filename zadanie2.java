public class zadanie2 {

    public static int findDominant(int[] array){

        int n = array.length;
        int show = n/2;

       for(int i=0;i<show;i++){
           if(array[i]==array[show-i-1]){
               return i;
           }
       }

        return show;
    }


    public static void main(String[] args) {

        int[] array = {3,3,3,2,2};
        int dom = findDominant(array);

        if(dom != -1){
            System.out.println("Element dominujacy" + dom);
        }else{
            System.out.println("Brak elementu dominujacego");
        }
    }
}
