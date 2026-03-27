/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan4;

/**
 *
 * @author hi
 */
public class User {
    public String name;
    private String userId;
    private String userType;
    private Book[] borrowedBooks;
    private int borrowLimit;
    private int borrowDuration;
    private int currentBorrowedCount;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.userType = "Anggota Lainnya";
        this.borrowLimit = 3;
        this.borrowDuration = 7;
        this.borrowedBooks = new Book[borrowLimit];
        this.currentBorrowedCount = 0;
    }

    public User(String name, String userId, String userType) {
        this.name = name;
        this.userId = userId;
        this.userType = userType;
        if (userType.equals("Mahasiswa")) {
            this.borrowLimit = 5;
            this.borrowDuration = 14;
        } else if (userType.equals("Dosen")) {
            this.borrowLimit = 10;
            this.borrowDuration = 30;
        } else {
            this.borrowLimit = 3;
            this.borrowDuration = 7;
        }
        this.borrowedBooks = new Book[borrowLimit];
        this.currentBorrowedCount = 0;
    }

    public boolean canBorrow() {
        return currentBorrowedCount < borrowLimit;
    }

    public void addBorrowedBook(Book book) {
        if (canBorrow()) {
            borrowedBooks[currentBorrowedCount] = book;
            currentBorrowedCount++;
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Buku yang dipinjam oleh " + name + ":");
        for (int i = 0; i < currentBorrowedCount; i++) {
            System.out.println("-" + borrowedBooks[i].getTitle());
        }
        if (currentBorrowedCount >= borrowLimit) {
            System.out.println(name + " telah memenuhi batas maksimal meminjam buku");
        }
    }

    public String getUserId() {
        return userId;
    }

    public String getUserType() {
        return userType;
    }
}
