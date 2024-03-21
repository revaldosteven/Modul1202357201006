
package modul1202357201006;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class NilaiBaru {
    
    public static void main(String[] args) {
        
        int [][] data = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
       
        JOptionPane.showInternalConfirmDialog( null, Arrays.deepToString(data));
       
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Baris : "));
        
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kolom : "));
        
        
        int nilaibaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Baru : "));
        
        if (baris >= 0 && baris < data.length && kolom >= 0 && kolom < data[0].length) {
            data[baris][kolom] = nilaibaru;
            JOptionPane.showInputDialog(null, "Nilai Pada Index " + "(" + baris + "," + kolom + ")" + "diubah Menjadi" + nilaibaru);
            JOptionPane.showConfirmDialog(null, Arrays.deepToString(data));
        }else {
            JOptionPane.showConfirmDialog(null, "Index" + "(" + baris + "," + kolom + ")" + "Tidak Tersedia");
        }
    }  
    }
