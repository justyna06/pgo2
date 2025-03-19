public class main {
    public static int[] filterEvenIndexOddValue(int[] array){

        int counter = 0;
        for(int i = 0; i < array.length; i += 2){
            if(array[i] % 2 == 0){
                counter++;
            }
        }
        int[] result = new int[counter];
        int index = 0;

        for(int i = 0; i < array.length; i += 2){
            if(array[i] % 2 == 0){
                result[index++] = array[i];
            }
        }
        return result;
    }
}
