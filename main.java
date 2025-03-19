public class main {
    public static int[] filterEvenIndexOddValue(int[] array){

        int count = 0;
        for(int i = 0; i < array.length; i += 2){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for(int i = 0; i < array.length; i += 2){
            if(array[i] % 2 == 0){
                result[index++] = array[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int[] result = filterEvenIndexOddValue(array);

        System.out.println(result);

    }
}
