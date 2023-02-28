package application;

import java.util.Scanner;

import entities.Note;

public class Program {
	public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	Note note = new Note ();
	
	System.out.println("Enter the data: ");
	note.Name = sc.nextLine();
	note.noteA = sc.nextDouble();
	note.noteB = sc.nextDouble();	
	note.noteC = sc.nextDouble();
	
	if(note.noteA > 30.00) {
		System.out.println("Value of the first invalid note!");
		}
		else if(note.noteB > 35.00 || note.noteC > 35.00) {
			System.out.println("Value of the second or third invalid note");
				}
				else if (note.FinalGrade() >= 60.00) {
					System.out.println(note.Passed());
					}
					else {
						System.out.println(note.Failed());
						}
	sc.close();
	}
}
