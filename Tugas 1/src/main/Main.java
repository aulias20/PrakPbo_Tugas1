package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        String nama;
        int jumlah, batas, max=0, min=100; float total=0;
        System.out.println("Masukkan nama : ");
        nama = scanInput.nextLine();
        System.out.println("Berapa banyak nilai yang di-input? : ");
        jumlah = scanInput.nextInt();
        int nilai[] = new int[jumlah];
        for (batas = 0; batas < jumlah; batas++) {
            System.out.println("Nilai ke-" + (batas + 1) + " : ");
            nilai[batas] = scanInput.nextInt();
            if (nilai[batas] > 100) {
                System.out.println("Nilai melebihi jangkauan!");
                batas = jumlah; max=0; min=0;
            } else {
                if (nilai[batas] > max) {
                    max = nilai[batas];
                }
                if (nilai[batas] < min) {
                    min = nilai[batas];
                }
                total = total + nilai[batas];
            }
        }
        System.out.println("== OUTPUT ==");
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Rata-rata : " + (total / jumlah));
    }
}
