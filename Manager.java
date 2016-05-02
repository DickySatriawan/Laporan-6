/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceSoalBAB6;
import java.util.Calendar;
/**
 *
 * @author DS
 */


public class Manager extends Pegawai {

    private float bonus;
    private float tunjanganLamaKerja;
    private float tunjanganIstri;
    private float tunjanganAnak;
    private float tunjanganJabatan;

    public Manager(String nama, String ID, boolean punyaIstri, int jumlahAnak, long tahunKerja, float gaji) {
        super(nama, ID, "Manager", punyaIstri, jumlahAnak, tahunKerja, gaji);
        this.calculateBonus();
        this.calculateTunjanganIstri();
        this.calculateTunjanganAnak();
        this.calculateTunjanganJabatan();
    }

    private void calculateBonus() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        long masaKerja = currentYear - super.getTahunKerja();
        if (masaKerja > 10) {
            bonus += (0.1f * (float) (masaKerja)) * super.getGaji();
            calculateTunjanganKerja(masaKerja);
        } else if (masaKerja <= 10 && masaKerja >= 6) {
            bonus += (0.05f * (float) (masaKerja)) * super.getGaji();
        }

    }

    private void calculateTunjanganKerja(float masaKerja) {
        tunjanganLamaKerja += (0.1f * masaKerja) * super.getGaji();
    }

    private void calculateTunjanganIstri() {
        float total = super.getGaji() + bonus + tunjanganLamaKerja;
        if (super.isPunyaIstri()) {
            tunjanganIstri += 0.1f * total;
        }
    }

    private void calculateTunjanganAnak() {
        float total = super.getGaji() + bonus + tunjanganLamaKerja;
        if (super.getJumlahAnak() <= 3 && super.getJumlahAnak() > 0) {
            tunjanganAnak += ((float) (super.getJumlahAnak()) * 0.15f) * total;
        } else {
            tunjanganAnak += (3f * 0.15f) * total;
        }
    }

    private void calculateTunjanganJabatan() {
        float total = super.getGaji() + bonus + tunjanganLamaKerja;
        tunjanganJabatan += 0.1f * total;
    }

    private float getTotalGaji() {
        return super.getGaji() + bonus + tunjanganAnak + tunjanganIstri
                + tunjanganJabatan + tunjanganLamaKerja;
    }

    public String toString() {
        return String.format("Nama \t\t\t: %s\nID Kerja \t\t: %s\nJabatan \t\t: %s\nPunya Istri \t\t: %s\n"
                + "Jumlah Anak \t\t: %s\nTahun Kerja \t\t: %s\nGaji Pokok \t\t: %.2f\nBonus \t\t\t: %.2f\n"
                + "Tunjangan Lama Kerja \t: %.2f\nTunjangan Istri \t: %.2f\nTunjangan Anak \t\t: "
                + "%.2f\nTunjangan Jabatan \t: %.2f\nTotal Gaji \t\t: %.2f", super.getNama(),
                super.getIdKerja(), super.getJabatan(), super.isPunyaIstri() ? "Punya" : "Tidak punya",
                super.getJumlahAnak(), super.getTahunKerja(), super.getGaji(), bonus, tunjanganLamaKerja,
                tunjanganIstri, tunjanganAnak, tunjanganJabatan, getTotalGaji());
    }
}
