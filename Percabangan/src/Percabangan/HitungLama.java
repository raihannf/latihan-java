/*
Menghitung lama dalam jam dan menit berdasarkan selisih waktu dalam menit
berdasarkan jam mulai (jam, menit) dan jam selesai (jam, menit) yang diinput
*/
package Percabangan;

import java.util.Scanner;
import java.lang.Math;

public class HitungLama {
    public static void main(String[] args)
	{
		try (Scanner in = new Scanner(System.in)) {
			int jamMulai, menitMulai, jamKeluar, menitKeluar, lama, jam, menit, totalMenitMulai, totalMenitKeluar;

			System.out.print("Masukkan jam mulai: ");
			jamMulai = in.nextInt();
			
			System.out.print("Masukkan menit mulai: ");
			menitMulai = in.nextInt();

			System.out.print("Masukkan jam keluar: ");
			jamKeluar = in.nextInt();

			System.out.print("Masukkan menit keluar: ");
    		menitKeluar = in.nextInt();

			jamMulai = jamMulai * 60;
			jamKeluar = jamKeluar * 60;
			totalMenitMulai = jamMulai + menitMulai;
			totalMenitKeluar = jamKeluar + menitKeluar;

			if (totalMenitKeluar >= totalMenitMulai)
			{
				lama = (totalMenitKeluar - totalMenitMulai);
				System.out.printf("\nLama (Menit): %d menit \n", lama);
			}
			else
			{
				lama = Math.abs((totalMenitMulai - 720) - totalMenitKeluar);
				System.out.printf("\nLama (Menit): %d menit \n", lama);
			}

			jam = lama / 60;
			menit = lama % 60;

			System.out.printf("Lama (Jam, Menit): %d jam %d menit", jam, menit);
		}
	}
}
