package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
	List<StudentInfo> danhSachSinhVien ;
	
	public StudentList() {
		this.danhSachSinhVien = new ArrayList<StudentInfo>();
	}
	
	public void addStudent(StudentInfo studentInfo) {
		this.danhSachSinhVien.add(studentInfo);
	}
	
	public StudentInfo studentWithMaxAverageScore() {
		headerTable();
		StudentInfo found_sv = this.danhSachSinhVien.get(0);
		for (StudentInfo sv: this.danhSachSinhVien) {
			if (sv.getAverageScr() > found_sv.getAverageScr()) {
				found_sv = sv;
			}
		}
		return found_sv;
	}
	
	
	public List<StudentInfo> findStudentById(int studentId){
		List<StudentInfo> rs = new ArrayList<StudentInfo>();
		headerTable();
		for (StudentInfo sv : this.danhSachSinhVien) {
			//headerTable();
			if (sv.getStudentId() == studentId) {
				rs.add(sv);
			}
		}
		return rs;
	}
	
	
	public List<StudentInfo> findStudentByName(String studentName){
		List<StudentInfo> rs = new ArrayList<StudentInfo>();
		headerTable();
		for (StudentInfo sv : this.danhSachSinhVien) {
			//headerTable();
			if (sv.getFullName().toLowerCase().equals(studentName.toLowerCase())) {
				rs.add(sv);
			}
		}
		return rs;
	}
	
	public void xoaSinhVienTheoMSSV(int _maSoSV) {
		Scanner sc = new Scanner(System.in);
		char opt; 
		int stt=0;
		for (StudentInfo sv : this.danhSachSinhVien){
			
			if (sv.getStudentId() == _maSoSV) {
				System.out.print("*** Press Y for removing and N for process cancel ***");
				opt = sc.next().toLowerCase().charAt(0);
				stt++;
				switch (opt){
					case 'y':{
						System.out.println("*** Student code with "+ sv.getStudentId()+" has been Removed ***");
						this.danhSachSinhVien.remove(sv);
					}
					default: break;
				}
				//if (this.danhSachSV.size() == 0) break;
			}
		}
		if (stt == 0) System.out.println("*** Given Student Code Not Found ***");
	}
	
	public void printAllStudentInfo() {
		int cnt = 0;
		headerTable();
		for(StudentInfo sv: this.danhSachSinhVien) {
			cnt++;
			sv.studentOutput(cnt);
		}
	}
	
	public void printWeakStudents() {
		int cnt = 0;
		headerTable();
		for(StudentInfo sv: this.danhSachSinhVien) {
			cnt++;
			if (sv.getRankLevel().equals("Weak")) {
				sv.studentOutput(cnt);
			}
			
		}
	}
	
	public void headerTable() {
		System.out.println("-----------------------------------*** STUDENT INFORMATION ***-----------------------------------\n");
		System.out.print("STT \t|");
		System.out.print("MSSV    \t|");
		System.out.print("Ten SV         \t|");
		System.out.print("Diem Toan\t|");
		System.out.print("Diem Ly  \t|");
		System.out.print("Diem Hoa \t|");
		System.out.print("Diem TB  \t|");
		System.out.print("Xep loai \t\n");
	}
	
}
