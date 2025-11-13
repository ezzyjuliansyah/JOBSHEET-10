import java.util.Scanner;

public class Siakad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3]; 

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1) + ": ");
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            double rataSiswa = totalPerSiswa / 3;
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + " = " + rataSiswa);
            System.out.println();
        }

        System.out.println("\n=========================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah:");
        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataMatkul = totalPerMatkul / 4;
            System.out.println("Mata kuliah " + (j + 1) + " = " + rataMatkul);
        }
    }
}
