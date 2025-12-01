public class Function {

    //B1: Tinh tong 2 so, viet theo ham
    public static int sum2number(int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }

    // B2: Tinh tong cac so trong mang so nguyen
    public static int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
//        for(int i : array){
//            sum += i;
//        }
        return sum;
    }


    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int sum = sum2number(a,b);
        System.out.println(sum);

        int[] array = {1,2,3,4,5,6};
        int sumArray = sumArray(array);
        System.out.println(sumArray);
    }
}
