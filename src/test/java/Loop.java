import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Bai 1: Tinh tong cac so tu 1 - 100
//        int sum = 0;
//        for (int iterator = 1; iterator <= 100; iterator++){
//            sum = sum + iterator;
//        }
//        System.out.println(sum);

        // Bai 2: Tinh tong cac so chan tu 1 - 100
//        int sum = 0;
//        for (int iterator = 1; iterator <= 100; iterator++){
//            if (iterator % 2 == 0){
//                sum = sum + iterator;
//            }
//        }
//        System.out.println(sum);

        // Bai 3: In ra bang cuu chuong. Nhap tu ban phim
          int sum = 0;
        Scanner sc = new Scanner(System.in);
//        System.out.println("In bang cuu chuong so: ");
//        int so = sc.nextInt();
          for(int i = 2; i <= 10; i++){
              for (int j = 1; j <= 10; j++) {
                  sum = i * j;
                  System.out.print(i + " * " + j + " = " + sum + "\t");
              }
              System.out.println(" ");
          }
    }
}
