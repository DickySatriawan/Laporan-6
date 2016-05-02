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
    public class PegawaiTT extends Pegawai {

    private int jamLembur;
    private float bonusLembur;

    public PegawaiTT(String nama, String idKerja, boolean punyaIstri, int jumlahAnak, long tahunKerja, float gaji, int jamLembur) {
        super(nama, idKerja, "Pegawai Tidak Tetap", punyaIstri, jumlahAnak, tahunKerja, gaji);
        this.jamLembur = jamLembur;
        this.calculateBonusLembur();
    }
    
    private void calculateBonusLembur() {
        if(jamLembur > 10) {
            bonusLembur += (float)(jamLembur) * 10000f;
        }
    }
    
    private float getTotalGaji() {
        return super.getGaji() + bonusLembur;
    }
    
    public String toString() {
        return String.format("Nama \t\t\t: %s\nID Kerja \t\t: %s\nJabatan \t\t: %s\nPunya Istri \t\t: %s\n"
                + "Jumlah Anak \t\t: %s\nTahun Kerja \t\t: %s\nGaji Pokok \t\t: %.2f\nJam Lembur \t\t: %d\n"
                + "Bonus Lembur \t\t: %.2f\nTotal Gaji \t\t: %.2f", super.getNama(), super.getIdKerja(),
                super.getJabatan(), super.isPunyaIstri()? "Punya" : "Tidak punya",
                super.getJumlahAnak(), super.getTahunKerja(), super.getGaji(), jamLembur,
                bonusLembur, getTotalGaji());
    }
    
}
