/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Siti Ainun Fatimah
 */
public class Kambing {
    public void tambahKambing(){
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambahkan " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    Kambing kambingJantan = new Kambing();
    kambingJantan.tambahKambing();
    }
}
