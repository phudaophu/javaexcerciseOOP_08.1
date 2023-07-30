package OOP;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Bài tập 01: Xây dựng chương trình cho phép người dùng nhập vào: Tên, Mã SV, điểm Toán, Lý Hóa. 
		 * Thực hiện các nghiệp vụ dưới đây. 
		   Tính điểm trung bình từng sinh viên ( T + L + H)/3
		   Xếp loại từng sinh viên theo: >=9 -> Xuất Sắc, 9<Giỏi<=8, 8<Khá<=7, <7<=6, <=5, còn lại Yếu.
		 * 
		 */
		StudentList listStudent1 = new StudentList();
		chonMenuBt1(listStudent1);
			
		
		/* Bài tập OOP 02: Xây dựng chương trình cho phép người dùng nhập vào: Tên, Mã SV, điểm Toán, Lý Hóa. 
		 * Thực hiện các nghiệp vụ dưới đây:
		 * 
		   1.Tính điểm trung bình từng sinh viên ( T + L + H)/3 
	 	   2.Xếp loại từng sinh viên theo: >=9 -> Xuất Sắc, 9<Giỏi<=8, 8<Khá<=7, <7<=6, <=5, còn lại Yếu.
		   3.In ra SV có ĐTB cao nhất. In ra danh sách theo mẫu 
• 		   4.In ra tất cả sinh viên Yếu. In ra danh sách theo mẫu 
		   5.Tìm sinh viên theo tên. In ra danh sách theo mẫu 
		   6.Tìm sinh viên theo mã 
		   7.Xóa 1 sinh viên theo mã sinh viên

		 * 
		 * 
		 * */
	
//		StudentList listStudent2 = new StudentList();
//		chonMenuBt2(listStudent2);
		
		
// End Main
	}
//Start Function
	public static void chonMenuBt2(StudentList dssv) {
		Scanner scan = new Scanner(System.in);
		int _userInput,stt;
		boolean exit = false; 
		do {
			Menu_bt2();
			_userInput = Integer.parseInt(scan.next());
			switch (_userInput) {
				case 1:{
					//nhap sinh vien
					StudentInfo sv = new StudentInfo();
					sv.studentInput();
					// Tinh diem TB
					sv.averageScore();
					// Xep loai
					sv.studyRankClassification();
					dssv.addStudent(sv);
					//thongBao();
				}break;
				
				case 2:{
					//xuat sinh vien
					//dssv.headerTable();
					dssv.printAllStudentInfo();
					
					
				}break;
				
				case 3:{
					//xuat sinh vien

					//dssv.sinhVienCoDiemTBCaoNhat().xuatSinhVien(1);
					dssv.studentWithMaxAverageScore().studentOutput(1);
					
				}break;
				
				case 4:{
					//xuat sinh vien
					//dssv.headerTable();
					//System.out.print("");
					//xdssv.xuatTatCaSinhVienYeu();
					dssv.printWeakStudents();
					//thongBao();
					
				}break;
				
				case 5:{
					//xuat sinh vien

					String tenSV;
					stt = 0;
					tenSV = thongBao_NhapTenSV();
					List<StudentInfo> dsSinhVienTimDuoc = dssv.findStudentByName(tenSV);
					for (StudentInfo svTimDuoc : dsSinhVienTimDuoc) {
						stt++;
						svTimDuoc.studentOutput(stt);
					}
					if (stt == 0) {
						System.out.println("/t*** Khong tim thay sinh vien ***");
					}
					
					//thongBao();
					
				}break;
				
				case 6:{
					//xuat sinh vien

					int masoSV;
					stt = 0;
					masoSV = thongBao_NhapMaSoSV();
					List<StudentInfo> dsSinhVienTimDuoc = dssv.findStudentById(masoSV);
					for (StudentInfo svTimDuoc : dsSinhVienTimDuoc) {
						stt++;
						svTimDuoc.studentOutput(stt);
					}
					if (stt == 0) {
						System.out.println("/t*** Khong tim thay sinh vien ***");
					}
					
				}break;
				
				case 7:{
					
					int masoSV;
					masoSV = thongBao_NhapMaSoSV();
					dssv.xoaSinhVienTheoMSSV(masoSV);

				}break;
				
				case 0:{
					exit = true;
					System.out.println("Stop!!!");
				}
				break;
				default:{
					System.out.println("Vui long nhap so co gia tri tu 0 den 7");
				}
			}
		}while (!exit);
	}
	
	public static void chonMenuBt1(StudentList dssv) {
		Scanner scan = new Scanner(System.in);
		int _userInput,stt;
		boolean exit = false; 
		do {
			Menu_bt1();
			_userInput = Integer.parseInt(scan.next());
			switch (_userInput) {
				case 1:{
					//nhap sinh vien
					StudentInfo sv = new StudentInfo();
					sv.studentInput();
					// Tinh diem TB
					sv.averageScore();
					// Xep loai
					sv.studyRankClassification();
					dssv.addStudent(sv);
					//thongBao();
				}break;
				
				case 2:{
					//xuat sinh vien
					//dssv.headerTable();
					dssv.printAllStudentInfo();
					
					
				}break;
				
				case 0:{
					exit = true;
					System.out.println("Stop!!!");
				}
				break;
				default:{
					System.out.println("Vui long nhap so co gia tri tu 0 den 7");
				}
			}
		}while (!exit);
	}
	public static void Menu_bt1() {
		System.out.println("\n Vui long chon so tinh nang duoi day: ");
		System.out.println("\t 1. Nhap vao sinh vien");
		System.out.println("\t 2. Xep loai sinh vien");
		System.out.println("\t 0. Thoat chuong trinh");
		System.out.print("So ban chon la:>  ");
	
	}
	
	public static void Menu_bt2() {
		System.out.println("\n Vui long chon so tinh nang duoi day: ");
		System.out.println("\t 1. Nhap vao sinh vien");
		System.out.println("\t 2. Xep loai sinh vien");
		System.out.println("\t 3. Tim sinh vien co diem trung binh cao nhat");
		System.out.println("\t 4. In ra tat ca sinh vien yeu");
		System.out.println("\t 5. Tim sinh vien theo ten");
		System.out.println("\t 6. Tim sinh vien theo ma so SV");
		System.out.println("\t 7. Xoa sinh vien");
		System.out.println("\t 0. Thoat chuong trinh");
		System.out.print("So ban chon la:>  ");
	
	}
	public static String thongBao_NhapTenSV() {
		Scanner sc = new Scanner(System.in);
		String _tenSV;
		System.out.print("\n Vui long nhap vao ten sinh vien: ");
		_tenSV =  sc.nextLine();
		return _tenSV;
	}
	public static int thongBao_NhapMaSoSV() {
		Scanner sc = new Scanner(System.in);
		int _masoSV;
		System.out.print("\n Vui long nhap vao ma so sinh vien: ");
		_masoSV =  sc.nextInt();
		return _masoSV;
	}
//	
}
