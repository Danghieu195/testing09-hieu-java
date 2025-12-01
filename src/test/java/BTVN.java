import java.util.Scanner;

public class BTVN {

    // Bai 1: Tinh tong cac so chan trong mang
//    public static int sumEven(int[] arr){
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr == null || arr[i] % 2 == 1) {
//                return -1;
//            } else if (arr[i] % 2 == 0) {
//                    sum = sum + arr[i];
//            }
//        }
//        return sum;
//    }


    // bai 2: Tim gia tri lon thu 2 trong mang
    // co may tham so ? => int[]
    // datatype la gi? => int
//    public static int findSecondLargest(int[] arr){
//        //C1: duyet tu cuoi mang
//        // Lay phan tu cuoi mang = max
//        Arrays.sort(arr);
//        int minValue = Integer.MIN_VALUE; // am vo cung
//        if (arr == null || arr.length < 2){
//            return -1;
//        }
//        int max = arr[arr.length-1];
//        for (int i = arr.length-2; i >= 0; i--) {
//            if (arr[i] != max) {
//                return arr[i];
//            }
//        }
//        return minValue;
//    }

    //Bai 3: Xoa so nguyen am trong chuoi
//    public static String xoaSoNguyenAm(String arr){
//        String result = "";
//        String[] input = arr.split(" ");
//        for(String p : input){
//            if(!p.isEmpty()) {
//                int num = Integer.parseInt(p);
//                if(num >= 0){
//                    result = result + " " + num;
//                }
//            }
//        }
//        return result;
//    }

    //Bai 4: Dem so tu trong mot chuoi

//    public static int countString(String arr){
//        if(arr == null || arr.length() == 0){
//            return -1;
//        }
//        String[] words = arr.split(" ");
//        return words.length;
//
//    }


    // Bai 5: In chu cai dau cua moi tu
//    public static String firstCharacter(String input ){
//        String[] arrWord = input.split(" ");
//        String result = "";
//        for(String word : arrWord){
//            result = result + word.toUpperCase().charAt(0) + " ";
//        }
//        return result;
//    }

    //Bai 6: Tinh thue thu nhap
    public static double countTax(double salary) {
        double tax = 0;

        if (salary <= 5) {
            tax = salary * 0.05;
        } else if (salary <= 10) {
            tax = 5 * 0.05 + (salary - 5) * 0.10;
        } else if (salary <= 18) {
            tax = 5 * 0.05 + 5 * 0.10 + (salary - 10) * 0.15;
        } else if (salary <= 32) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (salary - 18) * 0.20;
        } else {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (salary - 32) * 0.30;
        }
        return tax;
    }



   public static void main() {
     //Bai 1:
//       int[] arr = {3};
//       int[] arr = {1,6,8,4,5,7,10,88};
//       int sum = sumEven(arr);
//       System.out.println(sum);

    //Bai 3:
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Moi nhap chuoi so nguyen: ");
//         String input = sc.nextLine();
//         String result = xoaSoNguyenAm(input);
//         System.out.println("Chuoi so nguyen sau khi xoa so nguyen am : " + result);


    //Bai 2:
//       System.out.println("Bai 2: ");
//       int[] arrBai2 = {5,7,10,8,6};
//       int secondLargest = findSecondLargest(arrBai2);
//       System.out.println(secondLargest);

    //Bai 4:
//       System.out.println("Bai 4: ");
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Moi nhap chuoi: ");
//       String input = sc.nextLine();
//
//       int count = countString(input);
//       System.out.println(count);

    //Bai 5:
//    System.out.println("Bai 5: ");
//    String input = " Xin chao cac ban";
//    String result = firstCharacter(input);
//    System.out.println(result);


    //Bai 6:
       Scanner sc = new Scanner(System.in);

       System.out.print("Nhap thu nhap cua ban de tinh thue : ");
       double income = sc.nextDouble();
       double afterTax = countTax(income);
       double salaryAfterTax = income - afterTax;

       System.out.println("So tien ban phai dong thue la: " + afterTax);
       System.out.println("Thu nhap cua ban sau thue la: " + salaryAfterTax);

    }
}
