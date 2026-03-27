/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan4;

/**
 *
 * @author hi
 */
public class Main {
    public static void main(String[] args) {
//        int[] arr1=new int[5];
//        arr1[0]=10;
//        arr1[1]=50;
//        arr1[2]=30;
//        arr1[3]=40;
//        arr1[4]=20;
//        for(int i = 0; i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }
//        
//        String[] buah=new String[]{"apel","mangga"};
//        
//        for (String b : buah){
//            System.out.println(b);
//        }
        
        //Array of Object
        
//        Buku[] b = new Buku[2];
//        
//        
//        Buku b1=new Buku("Naruto","Kashimoto",10000);
//        
//        b[0]=b1;
//        try {
//            for(int i = 0;i<b.length;i++){
//                System.out.println("Nama Buku: "+b[i].getJudul());
//                System.out.println("Pengarang Buku: "+b[i].getPengarang());
//                System.out.println("Harga Buku: "+b[i].getHarga()+"\n");
//            }
//        } catch (NullPointerException e) {
//            System.out.println("Nama Buku: "+null);
//            System.out.println("Pengarang Buku: "+null);
//            System.out.println("Harga Buku: "+null+"\n");
//        }
//        for(Buku a : b){
//            System.out.println("Nama Buku: "+a.getJudul());
//            System.out.println("Pengarang Buku: "+a.getPengarang());
//            System.out.println("Harga Buku: "+a.getHarga());
//        }

        Book b1 = new Book("Software Engineering", "Ian Sommerville", "90001");
        Book b2 = new Book("Computer Architecture", "William Stallings", "90002");
        Book b3 = new Book("Artificial Intelligence Basics", "Stuart Russell", "90003");
        Book b4 = new Book("Web Development", "David Flanagan", "90004");
        Book b5 = new Book("Cyber Security", "Charles Brooks", "90005");

        User rina = new User("Rina", "M010", "Mahasiswa");
        User andi = new User("Andi", "D010", "Dosen");

        System.out.println("-- Scenario 1: Normal Borrowing --");
        b1.borrowBook(rina);
        b2.borrowBook(andi);
        System.out.println();

        System.out.println("-- Scenario 2: Borrowing Unavailable Book --");
        if (!b1.borrowBook(andi)) {
            System.out.println("Buku tidak available atau user tidak dapat meminjam buku lebih banyak.");
        }
        System.out.println();

        System.out.println("-- Scenario 3: Reserving Unavailable Book --");
        b2.borrowBook(rina, "High");
        System.out.println();

        System.out.println("-- Scenario 4: Borrowing Beyond Limit --");
        b3.borrowBook(rina);
        new Book("Mobile Programming", "A", "1").borrowBook(rina);
        new Book("Big Data Analytics", "B", "2").borrowBook(rina);
        new Book("Cloud Infrastructure", "C", "3").borrowBook(rina);
        rina.displayBorrowedBooks();
        System.out.println();

        System.out.println("-- Displaying Book Info --");
        b1.displayBookInfo();
        b2.displayBookInfo();
        b4.displayBookInfo();
        b5.displayBookInfo();
    }
}
