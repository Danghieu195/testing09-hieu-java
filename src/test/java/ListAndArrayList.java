import java.util.Scanner;

public class ListAndArrayList {
    public static void main(String[] args) {

//        B1 : tinh tong cac so trong mang
        Scanner sc = new Scanner(System.in);
//        Nhap so luong phan tu cua mang
//        Array chua phan tu
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] listInt = new int[n];
        int sum = 0;
//        Nhap so nguyen vao trong mang listInt
        for(int i = 0; i < n; i++) {
            System.out.print("Moi ban nhap so thu  " + (i+1) );
            listInt[i] = sc.nextInt();
            sum = sum + listInt[i];
        }
//            In mang listInt
            for (int i = 0; i < n; i++){
                System.out.println(listInt[i]);
            }
        System.out.print("Tong cua mang la: " + sum);

        // B2: Tim so lon nhat va so nho nhat trong mang
        int max = listInt[0];
        for (int i = 0; i < n; i++){
            if (listInt[i] > max){
                max = listInt[i];
            }
        }
        System.out.println("So lon nhat trong mang la : " + max);
        int min = listInt[0];
        for (int i = 0; i < n; i++){
            if (listInt[i] < min){
                min = listInt[i];
            }
        }
        System.out.println("So nho nhat trong mang la : " + min);

//        B3: Dem so luong chan va le trong mang
        int countChan = 0;
        int countLe = 0;
        for (int i = 0; i < n; i++){
            if (listInt[0] % 2 == 0) {
                countChan++;
            } else {
                countLe++;
            }
        }
        System.out.println("Co " + countChan + " so chan trong mang");
        System.out.println("Co " + countLe + " so le trong mang");
        }
    }
