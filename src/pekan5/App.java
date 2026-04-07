
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pekan5;

/**
 *
 * @author hi
 */
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
    	
       Scanner input = new Scanner(System.in);
       
    // tipe data conventional -> int, string, boolean, double, dst
    // class/object -> anggap saja sama seperti tipe data, tapi hasil buatan sendiri
       
//     Contoh buat array pakai tipe data conventional
       String[] nama = new String[5];
//     Contoh buat array pakai tipe data Object
       Student[] students = new Student[5];
       String inputNim, inputNama;
       
//     membuat
       for(int i=0; i<=4; i++) {
    	   System.out.println("Masukin Nim ke-" + (i+1) + ":" );
    	   inputNim = input.nextLine();
    	   System.out.println("Masukin Nama ke-" + (i+1) + ":" );
    	   inputNama = input.nextLine();
    	   students[i] = new Student(inputNim, inputNama);
       }
       
//     nampilin
       for(int i=0; i <= 4; i++) {
    	   System.out.println(students[i].toString());
       }
       Courses pelajaran1 = 
//    		   dari constructor public Courses(String nama, String code, Student student)
    		   new Courses("DPBO", "C1", new Student("10", "Mozart"));
//     Pemanggilan nilai dari object dalam object/class dalam class
       System.out.println(pelajaran1.getStudent().getNim());
    }
}

class Student {
	String nim, nama;
	
	// constructor:     // params:
	public Student(String nim, String nama) {
		// assign
		this.nim = nim;
		this.nama = nama;
	}

	// getter setter
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}

	@Override
	public String toString() {
		return "Student [nim=" + nim + ", nama=" + nama + "]";
	}
	
}



class Courses {
	String nama, code;
//	Object dalam object/variabel class dalam class
	Student student;
	
//	Constructor                              
//	Student student artinya kalian menerima param berupa object
	public Courses(String nama, String code, Student student) {
		// assign
		this.nama = nama;
		this.code = code;
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void createStudent(Student student) {
		this.student = student;
	}
}