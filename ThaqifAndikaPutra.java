
package programberbasisobjek;

public class ThaqifAndikaPutra {
    public static void main(String[] args) {
        // TODO code application logic here
        double Nilai1;
       double Nilai2;
       double hasil;
 
       Scanner keyboard = new Scanner(System.in);
 
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 =keyboard.nextInt();
//
      // penjumlahan
       hasil = Nilai1 + Nilai2;
       System.out.println("Hasil = " + hasil);
//
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
//
      // pengurangan
       hasil = Nilai1 - Nilai2;
       System.out.println("Hasil = " + hasil);
//
        System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
    // perkalian
       hasil = Nilai1 * Nilai2;
       System.out.println("Hasil = " + hasil);
//
     System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
//
//        // Pembagian
       hasil = Nilai1 / Nilai2;
       System.out.println("Hasil = " + hasil);
//
       System.out.print("Input angka-1: ");
       Nilai1 = keyboard.nextInt();
       System.out.print("Input angka-2: ");
       Nilai2 = keyboard.nextInt();
 
       // Sisa Bagi
       hasil = Nilai1 % Nilai2;
       System.out.println("Hasil = " + hasil);
       
       // Operator perbandingan
        boolean samaDengan = angka1 == angka2;
        boolean tidakSamaDengan = angka1 != angka2;
        boolean kurangDari = angka1 < angka2;
        boolean lebihDari = angka1 > angka2;
        boolean kurangAtauSamaDengan = angka1 <= angka2;
        boolean lebihAtauSamaDengan = angka1 >= angka2;

        System.out.println("Hasil perbandingan:");
        System.out.println(angka1 + " == " + angka2 + " : " + samaDengan);
        System.out.println(angka1 + " != " + angka2 + " : " + tidakSamaDengan);
        System.out.println(angka1 + " < " + angka2 + " : " + kurangDari);
        System.out.println(angka1 + " > " + angka2 + " : " + lebihDari);
        System.out.println(angka1 + " <= " + angka2 + " : " + kurangAtauSamaDengan);
        System.out.println(angka1 + " >= " + angka2 + " : " + lebihAtauSamaDengan);
        
        // Bitwise XOR (^)
        int angka1 = 5; // Representasi biner: 0101
        int angka2 = 3; // Representasi biner: 0011
        int hasil = angka1 ^ angka2; // Hasil dari angka1 ^ angka2
        
        System.out.println("Hasil XOR: " + hasil); // Output: 6 (Representasi biner: 0110)
    }