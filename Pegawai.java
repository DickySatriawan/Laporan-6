/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceSoalBAB6;

/**
 *
 * @author DS
 */
public class Pegawai {
private String nama;
    private String ID;
    private String jabatan;
    private boolean punyaIstri;
    private int jumlahAnak;
    private long tahunKerja;
    private float gaji;

 public Pegawai(String nama, String ID, String jabatan, boolean punyaIstri, int jumlahAnak, long tahunKerja, float gaji) {
        this.nama = nama;
        this.ID = ID;
        this.jabatan = jabatan;
        this.punyaIstri = punyaIstri;
        this.jumlahAnak = jumlahAnak;
        this.tahunKerja = tahunKerja;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }
    public String getIdKerja() {
        return ID;
    }
    public String getJabatan() {
        return jabatan;
    }
    public float getGaji() {
        return gaji;
    }
    public boolean isPunyaIstri() {
        return punyaIstri;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public long getTahunKerja() {
        return tahunKerja;
    }
}

