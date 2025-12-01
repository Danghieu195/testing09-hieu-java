import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong phan tu: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        // B1: dem so lan xuat hien cua 1 phan tu bat ky trong mang

        int count = 0;
        System.out.println("Moi ban nhap phan tu muon dem: ");
        int number = sc.nextInt();
        for(int num: arrayList){
            if (num == number){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Khong co phan tu " + number + " nao trong mang");
        } else {
            System.out.println("So lan xuat hien " + number + " la: " + count);
        }

        // B2: tim max, min trong mang
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
    }
}
