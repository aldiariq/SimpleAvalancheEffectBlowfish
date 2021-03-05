/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalanche.effect.blowfish;
import avalanche.effect.blowfish.algoritma.*;

/**
 *
 * @author aldiariq
 */
public class AvalancheEffectBlowfish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Avalanche Effect Algoritma Blowfish\n");
        Blowfish blowfish = new Blowfish();
        AvalancheEffect avalancheeffect = new AvalancheEffect();
        
        String teksasli = "TESENKRIPSI";
        String kuncipertama = "MASALALUBIARLAHMASALALU";
        String kuncikedua = "MASALALUBIARLAHMASALALU1";
        
        String hasilenkripsipertama = blowfish.enkripsi(teksasli, kuncipertama);
        String hasilenkripsikedua = blowfish.enkripsi(teksasli, kuncikedua);
        
        String hasildekripsipertama = blowfish.dekripsi(hasilenkripsipertama, kuncipertama);
        String hasildekripsikedua = blowfish.dekripsi(hasilenkripsikedua, kuncikedua);
        
        System.out.println("Input");
        System.out.println("Teks Asli \t\t\t: " + teksasli);
        System.out.println("Kunci Pertama \t\t\t: " + kuncipertama);
        System.out.println("Kunci Kedua \t\t\t: " + kuncikedua);
        System.out.println("Output");
        System.out.println("Hasil Enkripsi Kunci Pertama \t: " + hasilenkripsipertama);
        System.out.println("Hasil Enkripsi Kunci Kedua \t: " + hasilenkripsikedua);
        System.out.println("Hasil Dekripsi Kunci Pertama \t: " + hasildekripsipertama);
        System.out.println("Hasil Dekripsi Kunci Kedua \t: " + hasildekripsikedua);
        System.out.println("Nilai Avalanche Effect \t\t: " + avalancheeffect.hitungAvalanche(hasilenkripsipertama, hasilenkripsikedua));
    }
    
}
