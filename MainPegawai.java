/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceSoalBAB6;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class MainPegawai {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b, s;
        int d, pegawai, j;
        long e;
        float f;
        boolean c;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                    MANAGER");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Nama                 : ");
        a = in.next();
        System.out.print("ID kerja             : ");
        b = in.next();
        System.out.print("Status (bujang/kawin): ");
        s = in.next();
        if (s.equalsIgnoreCase("kawin")) {
            c = true;
            System.out.print("Masukkan jumlah anak : ");
            d = in.nextInt();
        } else {
            c = false;
            d = 0;
        }

        System.out.print("Masukkan tahun masuk : ");
        e = in.nextLong();
        System.out.print("Masukkan gaji        : ");
        f = in.nextFloat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Manager x = new Manager(a, b, c, d, e, f);
        System.out.println(x);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                 PEGAWAI TETAP");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Masukkan jumlah pegawai  : ");
        pegawai = in.nextInt();
        for (int i = 1; i <= pegawai; i++) {
            System.out.println("-------------------------------------------------");
            c = true;
            System.out.println("PEGAWAI " + i);
            System.out.println("-------------------------------------------------");
            System.out.print("Nama                 : ");
            a = in.next();
            System.out.print("ID kerja             : ");
            b = in.next();
            System.out.print("Status (bujang/kawin): ");
            s = in.next();
            if (s.equalsIgnoreCase("kawin")) {
                c = true;
                System.out.print("Masukkan jumlah anak : ");
                d = in.nextInt();
            } else {
                c = false;
                d = 0;
            }

            System.out.print("Masukkan tahun masuk : ");
            e = in.nextLong();
            System.out.print("Masukkan gaji        : ");
            f = in.nextFloat();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            PegawaiT y = new PegawaiT(a, b, c, d, e, f);
            System.out.println(y);

        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("              PEGAWAI TIDAK TETAP");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Masukkan jumlah pegawai  : ");
        pegawai = in.nextInt();
        for (int i = 1; i <= pegawai; i++) {
            System.out.println("-------------------------------------------------");
            c = true;
            System.out.println("PEGAWAI " + i);
            System.out.println("-------------------------------------------------");
            System.out.print("Nama                 : ");
            a = in.next();
            System.out.print("ID kerja             : ");
            b = in.next();
            System.out.print("Status (bujang/kawin): ");
            s = in.next();
            if (s.equalsIgnoreCase("kawin")) {
                c = true;
                System.out.print("Masukkan jumlah anak : ");
                d = in.nextInt();
            } else {
                c = false;
                d = 0;
            }

            System.out.print("Masukkan tahun masuk : ");
            e = in.nextLong();
            System.out.print("Masukkan gaji        : ");
            f = in.nextFloat();
            System.out.print("Masukkan lama jam kerja : ");
            j = in.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            PegawaiTT z = new PegawaiTT(a, b, c, d, e, f, j);
            System.out.println(z);

        }
    }

}
