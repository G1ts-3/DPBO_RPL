/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
public class Anime {
    private String judul,genre;
    private double rating;
    private int jumlahEpisode;
    
    public Anime(String judul, String genre, double rating, int jumlahEpisode){
        this.judul=judul;
        this.genre=genre;
        this.rating=rating;
        this.jumlahEpisode=jumlahEpisode;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getJumlahEpisode() {
        return jumlahEpisode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setJumlahEpisode(int jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }
    
    public void displayData(){
        System.out.println("Judul       : "+judul);
        System.out.println("Genre       : "+genre);
        System.out.println("Rating      : "+rating);
        System.out.println("Jumlah Eps  : "+jumlahEpisode);
    }
}
