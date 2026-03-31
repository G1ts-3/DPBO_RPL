/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan4;

/**
 *
 * @author hi
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private String[] reservationQueue;
    private int queueCount;

    //Konstruktor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.reservationQueue = new String[10]; 
        this.queueCount = 0;
    }

    public boolean borrowBook(User user) {
        if (available && user.canBorrow()) {
            available = false;
            user.addBorrowedBook(this);
            System.out.println(user.name + " telah meminjam buku: " + title);
            return true;
        }
        return false;
    }

    public boolean borrowBook(User user, String priority) {
        if (!available) {
            addToReservationQueue(user.getUserId(), priority);
            return false;
        }
        return borrowBook(user);
    }

    public void addToReservationQueue(String userId, String priority) {
        if (queueCount < reservationQueue.length) {
            reservationQueue[queueCount] = "-" + userId + " (Priority: " + priority + ")";
            queueCount++;
            System.out.println("User " + userId + " telah ditambahkan ke antrian reservasi dengan prioritas: " + priority);
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("Antrian Reservasi:");
        if (queueCount == 0) {
            System.out.println("Tidak ada reservasi!");
        } else {
            for (int i = 0; i < queueCount; i++) {
                System.out.println(reservationQueue[i]);
            }
        }
        System.out.println();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
