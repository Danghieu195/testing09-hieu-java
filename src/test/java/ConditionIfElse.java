import java.util.Scanner;

public class ConditionIfElse {
    public static void main(String[] args) {
        // Bai 1: Nhap so nguyen tu ban phim. Kiem tra chan hay le
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi ban nhap so nguyen: ");
//        int num1 = scanner.nextInt();
//        if (num1 % 2 == 0) {
//            System.out.println("So " + num1 + " la so chan");
//        } else {
//            System.out.println("So " + num1 + " la so le");
//        }

        // Bai 2: Nhap so nguyen tu ban phim. Kiem tra so nhap vao la
        //       so nguyen duong, nguyen am hay la so 0
        //      input : So nguyen nhap tu ban phim => Scanner
        //      output : La so duong/am/so 0
        //      process : if - else if - else hoac if - if - if
        //      So nguyen duong > 0
        //      So nguyen am < 0
        //      So 0 == 0
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi ban nhap so nguyen: ");
//        int num1 = sc.nextInt();
//        if (num1 > 0){
//            System.out.println("So ban vua nhap la so nguyen duong");
//        } else if (num1 < 0 ){
//            System.out.println("So ban vua nhap la so nguyen am");
//        } else {
//            System.out.println("So ban vua nhap la so 0");
//        }

        // Bai 3: Tim so lon nhat trong 3 so duoc nhap tu ban phim
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi ban nhap so thu 1: ");
//        int num2 = sc.nextInt();
//        System.out.println("Moi ban nhap so thu 2: ");
//        int num3 = sc.nextInt();
//        System.out.println("Moi ban nhap so thu 3: ");
//        int num4 = sc.nextInt();
//
//        int max = num2;
//        if (num3 > max){
//            max = num3;
//        }if (num4 > max) {
//            max = num4;
//        }
//        System.out.println("So lon nhat la " + max);

        // Bai 4: Tinh tien taxi
        // 1km dau tien = 15000 VND
        // Tu km 2 tro di = 12000 VND
        // Tinh tien cuoc taxi voi so km nhap tu ban phim
        // VD: 3km => 15000 + 2*12000
        // VD: 1.2km => 15000 + 1*12000

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so km : ");
        float soKm = sc.nextFloat();
//        Cach 1 : if - else

//        Cach 2 : Dung 2 bien if rieng biet
    }

}
