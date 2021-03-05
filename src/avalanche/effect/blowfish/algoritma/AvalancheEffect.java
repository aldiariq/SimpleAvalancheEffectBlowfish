/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalanche.effect.blowfish.algoritma;

/**
 *
 * @author aldiariq
 */
public class AvalancheEffect {

    public double hitungAvalanche(String hasilenkrip1, String hasilenkrip2) {
        StringBuilder hasil1 = ambilBit(hasilenkrip1);
        StringBuilder hasil2 = ambilBit(hasilenkrip2);
        
        System.out.println("Bit Kalimat Pertama \t\t: " + hasil1);
        System.out.println("Bit Kalimat Kedua \t\t: " + hasil2);
        
        int jumlahbit = hasil1.length();
        int jumlahbitberbeda = 0;

        if (hasil1.length() == hasil2.length()) {
            for (int i = 0; i < jumlahbit; i++) {
                if (hasil1.charAt(i) != hasil2.charAt(i)) {
                    jumlahbitberbeda = jumlahbitberbeda + 1;
                }
            }
        }else {
            return 0;
        }
        
        return (jumlahbitberbeda * 100) / jumlahbit;
    }

    private StringBuilder ambilBit(String kalimat) {
        byte[] bytes = kalimat.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append("");
        }
        return binary;
    }

}
