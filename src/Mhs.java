import java.util.Scanner;
public class Mhs {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    String nama, nim, alamat;
    char ulang = 'y';
    int pilih;
    float uts, uas;
    
    System.out.print("Masukkan nama : ");
     nama = input.nextLine();
    System.out.print("Masukkan NIM : ");
     nim = input.nextLine();
    System.out.print("Masukkan Alamat : ");
     alamat = input.nextLine();
    System.out.print("Masukkan Nilai UTS : ");
     uts = input.nextFloat();
    System.out.print("Masukkan Nilai UAS : ");
     uas = input.nextFloat();
    
    while(ulang == 'y'){
        System.out.println("Menu");
        System.out.println("1. Lihat Detail Data");
        System.out.println("2. Edit Data");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Nama : " + nama);
                System.out.println("NIM : " + nim);
                System.out.println("Alamat : " + alamat);
                char ifsi = nim.charAt(2);
                if (ifsi == '3') {
                    System.out.println("Jurusan : Informatika");
                }
                else if (ifsi == '4') {
                    System.out.println("Jurusan : Sistem Informasi");
                }
                System.out.println("Nilai : " + ((uts+uas)/2));
                break;
            case 2:
                Scanner masuk = new Scanner(System.in);
                System.out.print("Masukkan nama : ");
                 nama = masuk.nextLine();
                System.out.print("Masukkan NIM : ");
                 nim = masuk.nextLine();
                System.out.print("Masukkan Alamat : ");
                 alamat = masuk.nextLine();
                System.out.print("Masukkan Nilai UTS : ");
                 uts = masuk.nextFloat();
                System.out.print("Masukkan Nilai UAS : ");
                 uas = masuk.nextFloat();   
                 break;
        }
        System.out.print("Back to menu (y/n) : ");
        ulang = input.next().charAt(0);
    }
    }
    
}
