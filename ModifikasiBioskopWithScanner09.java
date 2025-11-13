import java.util.Scanner;
public class ModifikasiBioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >=1 && baris <=4 && kolom >=1 && kolom <=2) {
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("data berhasil dimasukkan.");
                        } else {
                            System.out.println("kursi telah terisi oleh "+penonton[baris-1][kolom-1]);
                        }
                    } else {
                        System.out.println("posisi tidak valid. Baris (1-4), kolom (1-2).");
                    }
                    break;
                case 2: {
                    System.out.println("\nDaftar Penonton");
                    for(int i=0; i<penonton.length;i++){
                        for(int j=0; j< penonton[i].length;j++) {
                            String isi = (penonton[i][j] == null) ? "[*]" : penonton[i][j];
                            System.out.printf("Baris %d Kolom %d: %s\n", (i+1), (j+1), isi);
                        }
                    } 
                    break;
                }
                case 3: {
                    System.out.println("--- Program selesai ---");
                    return;
                }
                default:
                    System.out.println("pilihan tidak valid. Silahkan pilih (1-3)");;
            }
        }
    }
}