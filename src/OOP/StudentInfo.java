package OOP;

import java.util.Scanner;

public class StudentInfo {
	String fullName; 
	int studentId; 
	float mathsScr; 
	float physicScr;
	float chemistryScr;
	float averageScr=0;
	String rankLevel="Unclassified";
	
	public StudentInfo() {
		
	}
	
	public StudentInfo(String fullName, int studentId, float mathsScr, float physicScr, float chemistryScr) {
		this.fullName = fullName; 
		this.studentId = studentId;
		this.mathsScr = mathsScr;
		this.physicScr = physicScr;
		this.chemistryScr = chemistryScr;
	}
	
	public void studentInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten sinh vien: ");
		this.fullName = sc.nextLine();
		System.out.print("Nhap MSSV: ");
		this.studentId = sc.nextInt();
		do {
			System.out.print("Diem toan: ");
			this.mathsScr = sc.nextFloat();
		}while(this.mathsScr<0 || this.mathsScr>10);
		do {
			System.out.print("Diem ly: ");
			this.physicScr = sc.nextFloat();
		}while(this.physicScr<0 || this.physicScr>10);
		do {
			System.out.print("Diem hoa: ");
			this.chemistryScr = sc.nextFloat();
		}while(this.chemistryScr<0 || this.chemistryScr>10);
	}
	public void studentOutput(int _stt) {
		
		System.out.printf("%-4d\t|",_stt);
		System.out.printf("%-8d\t|",this.studentId);
		System.out.printf("%-15s\t|",this.fullName);
		System.out.printf("%9.2f\t|",this.mathsScr);
		System.out.printf("%9.2f\t|",this.physicScr);
		System.out.printf("%9.2f\t|",this.chemistryScr);
		System.out.printf("%9.2f\t|",this.averageScr);
		System.out.printf("%-9s\t\n",this.rankLevel);

	}
	
	public void averageScore() {
		
		 this.averageScr =  (this.mathsScr + this.physicScr + this.chemistryScr)/3;
		 System.out.printf("Diem trung binh: %.2f", this.averageScr);
		 System.out.println("");
	}
	
	public void studyRankClassification() {
		if (this.averageScr>=9) {
			this.rankLevel="the best educated";
		}
		else if (this.averageScr>=8 && this.averageScr<9) {
			this.rankLevel="Excellent";
		}
		else if (this.averageScr>=7 && this.averageScr<8) {
			this.rankLevel="Good";
		}
		else if (this.averageScr>=5 && this.averageScr<7) {
			this.rankLevel="Medium";
		}
		else {
			this.rankLevel="Weak";
		}
		System.out.print("Xep loai: "+this.rankLevel);
	}
	
	
	//--------------------- GETER - SETTER ---------------------//
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public float getMathsScr() {
		return mathsScr;
	}
	public void setMathsScr(float mathsScr) {
		this.mathsScr = mathsScr;
	}
	public float getPhysicScr() {
		return physicScr;
	}
	public void setPhysicScr(float physicScr) {
		this.physicScr = physicScr;
	}
	public float getChemistryScr() {
		return chemistryScr;
	}
	public void setChemistryScr(float chemistryScr) {
		this.chemistryScr = chemistryScr;
	}

	public float getAverageScr() {
		return averageScr;
	}

	public void setAverageScr(float averageScr) {
		this.averageScr = averageScr;
	}

	public String getRankLevel() {
		return rankLevel;
	}

	public void setRankLevel(String rankLevel) {
		this.rankLevel = rankLevel;
	}
	
	
}
