package entities;

public class Note {
	public String Name;
	public double noteA;
	public double noteB;
	public double noteC;
	
	public double FinalGrade() {
		return noteA + noteB + noteC;
	}
	public double Difference(){
		return 100 - FinalGrade();
	}
	public String Passed() {
		return "FINAL GRADE = "
				+ String.format("%.2f", FinalGrade())
				+ "\nCongratulations, you passed.";
	}
	public String Failed() {
		return "FINAL GRADE = "
				+ String.format("%.2f", FinalGrade())
				+ "\nFAILED"
				+ "\nMISSING "
				+ String.format("%.2f", Difference())
				+ " POINTS.";
	}
}
