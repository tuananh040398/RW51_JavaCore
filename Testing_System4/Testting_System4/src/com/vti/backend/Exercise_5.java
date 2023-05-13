package com.vti.backend;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.vti.entity.Bao;
import com.vti.entity.Canbo;
import com.vti.entity.Gender;
import com.vti.entity.Congnhan;
import com.vti.entity.HighSchoolStudentNew;
import com.vti.entity.Kysu;
import com.vti.entity.Nhanvien;
import com.vti.entity.Sach;
import com.vti.entity.Tapchi;
import com.vti.entity.Thuvien;

public class Exercise_5 {

	private ArrayList<Canbo> canboList;
	private ArrayList<Thuvien> thuvienList;
	private Scanner sc;

	public Exercise_5() {
		canboList = new ArrayList<Canbo>();
		sc = new Scanner(System.in);

	}

	public void Question_1() {

	}

	public void Queestion_2() {
		menu();
	}

	public void menu() {

		while (true) {
			System.out.println("==================================================");
			System.out.println("=========Lua chon chuc nang ban muon su dung=======");
			System.out.println("==	1. Them moi  can bo.");
			System.out.println("==	2. Tim kiem theo ho ten.");
			System.out.println("==	3. Hien thi thong tin ve danh sach can bo.");
			System.out.println("==	4. Nhap vao ten can bo va xoa can bo do.");
			System.out.println("==	5. Thoat khoi chuong trinh.");
			System.out.println("==================================================");

			int chucnang = Integer.parseInt(sc.nextLine());
			switch (chucnang) {
			case 1:
				themcanbo();
				break;
			case 2:
				timtheohoten();
				break;
			case 3:
				hienthiDScanbo();
				break;
			case 4:
				xoacanbo();
				break;
			case 5:
				return;
			default:
				System.out.println("Moi nhap lai so tren menu");
			}
		}

	}

	private void themcanbo() {
		System.out.println("=============Lua chon can bo muon them=============");
		System.out.println("1.Them moi can bo la cong nhan");
		System.out.println("2.Them moi can bo la ky su");
		System.out.println("3.Them moi can bo la nhan vien");

		int themcanbo = Integer.parseInt(sc.nextLine());

		switch (themcanbo) {

		case 1:
			System.out.println("Nhap ten cong nhan: ");
			String hotencn = sc.nextLine();
			sc.nextLine();
			System.out.println("Nhap tuoi: ");
			byte tuoicn = sc.nextByte();
			System.out.println("Nhap gioi tinh: " + "\n" + "1.Male" + "\n" + "2.Female" + "\n" + "3.Unknown");
			int chongioitinhcn = sc.nextInt();
			Gender gioitinhcn = null;

			switch (chongioitinhcn) {
			case 1:
				gioitinhcn = Gender.male;
				break;
			case 2:
				gioitinhcn = Gender.female;
				break;
			case 3:
				gioitinhcn = Gender.unknown;
				break;
			}

			sc.nextLine();
			System.out.println("Nhap dia chi cua cong nhan: ");
			String diachicn = sc.nextLine();
			System.out.println("Nhap cap bac cua cong nhan: ");
			byte capbaccn = sc.nextByte();
			Canbo conNhan1 = new Congnhan(hotencn, tuoicn, gioitinhcn, diachicn, capbaccn);
			canboList.add(conNhan1);
			break;

		case 2:
			System.out.println("Nhap ten Ky su: ");
			String tenkS = sc.nextLine();
			sc.nextLine();
			System.out.println("Nhap tuoi: ");
			byte tuoiks = sc.nextByte();
			System.out.println("Nhap gioi tinh: " + "\n" + "1.Male" + "\n" + "2.Female" + "\n" + "3.Unknown");
			int chongioitinhks = sc.nextInt();
			Gender gioitinhks = null;

			switch (chongioitinhks) {
			case 1:
				gioitinhks = Gender.male;
				break;
			case 2:
				gioitinhks = Gender.female;
				break;
			case 3:
				gioitinhks = Gender.unknown;
				break;
			}
			System.out.println("Nhap dia chi ky su: ");
			String diachiks = sc.nextLine();
			sc.nextLine();
			System.out.println("Nhap nganh dao tao ky su: ");
			String nganhDTKS = sc.nextLine();
			Canbo kysu1 = new Kysu(tenkS, tuoiks, gioitinhks, diachiks, nganhDTKS);
			canboList.add(kysu1);
			break;

		case 3:
			System.out.println("Nhap ten nhan vien: ");
			String tennv = sc.nextLine();
			sc.nextLine();
			System.out.println("Nhap tuoi nhan vien: ");
			byte tuoinv = sc.nextByte();
			System.out.println("Nhap gioi tinh: " + "\n" + "1.Male" + "\n" + "2.Female" + "\n" + "3.Unknown");
			int chongioitinhnv = sc.nextInt();
			Gender gioitinhnv = null;
			switch (chongioitinhnv) {
			case 1:
				gioitinhnv = Gender.male;
				break;
			case 2:
				gioitinhnv = Gender.female;
				break;
			case 3:
				gioitinhnv = Gender.unknown;
				break;
			}

			System.out.println("Nhap dia chi nhan vien: ");
			String diachinv = sc.nextLine();
			sc.nextLine();
			System.out.println("Nhiem vu cua nhan vien: ");
			String nhiemvunv = sc.nextLine();
			Nhanvien nhanvien1 = new Nhanvien(tennv, tuoinv, gioitinhnv, diachinv, nhiemvunv);
			canboList.add(nhanvien1);
			break;
		default:
			break;
		}
	}

	private void timtheohoten() {
		System.out.println("Nhap ho ten can tim kiem: ");
		String timkiem = sc.nextLine();
		timkiem = timkiem.trim();
		timkiem = timkiem.replace("  ", " ");
		sc.nextLine();

		for (Canbo canbo1 : canboList) {
			if (canbo1.getName().equals(timkiem)) {
				System.out.println(canbo1);
			} else {
				System.out.println("Khong tim thay thon tin");
			}
		}
	}

	private void hienthiDScanbo() {
		for (Canbo canbo1 : canboList) {
			System.out.println(canbo1);
		}
	}

	private void xoacanbo() {
		System.out.println("Nhap ten can bo can xoa: ");
		String delcanbo = sc.nextLine();
		sc.nextLine();

		for (Canbo canbo2 : canboList) {
			if (canbo2.getName().equals(delcanbo.trim())) {
				canboList.remove(canbo2);
			}
		}
	}

	public void ThuVien() {
		while (true) {
			System.out.println("===================================================");
			System.out.println("=========Moi ban nhap chuc nang=========");
			System.out.println("1.Them moi tai lieu.");
			System.out.println("2.Xoa tai lieu theo ma tai lieu.");
			System.out.println("3.Hien thi thong tin ve tai lieu.");
			System.out.println("4.Tim kiem tai lieu theo loai: Sach, tap chi, bao.");
			System.out.println("5.Thoat khoi chuong trinh.");
			System.out.println("===================================================");

			int menuTV = Integer.parseInt(sc.nextLine());
			
			switch (menuTV) {
			case 1:
				themtailieu();
				break;
			case 2:
				xoatailieu();
				break;
			case 3:
				hienthitailieu();
				break;
			case 4:
				timtailieu();
				break;
			case 5:
				return;
			default:
				System.out.println("Moi ban nhap lai chuc nang.");
			}
		}

	}

	private void themtailieu() {
		while (true) {
			System.out.println("Nhap tai lieu muon them");
			System.out.println("1.Them sach.");
			System.out.println("2.Them tap chi");
			System.out.println("3.Them bao");

			int themTL = Integer.parseInt(sc.nextLine());
			sc.nextLine();

			switch (themTL) {

			case 1:
				System.out.println("Moi ban nhap ma sach: ");
				String maString = sc.nextLine();
				System.out.println("Moi ban nhap ten nha xuat ban: ");
				String nxbString = sc.nextLine();
				System.out.println("Moi ban nhap so ban phat hanh: ");
				short soban = sc.nextShort();
				sc.nextLine();
				System.out.println("Moi ban nhap ten tac gia: ");
				String tentgString = sc.nextLine();
				System.out.println("Moi ban nhap so trang sach: ");
				int sotrang = sc.nextInt();
				sc.nextLine();

				Thuvien sachThuvien = new Sach(maString, nxbString, soban, tentgString, sotrang);
				thuvienList.add(sachThuvien);
				break;
				
			case 2:
				System.out.println("Moi ban nhap ma tap chi: ");
				String matailieuString = sc.nextLine();
				System.out.println("Moi ban nhap ten nha xuat ban: ");
				String nxbString2 = sc.nextLine();
				System.out.println("Moi ban nhap so ban phat hanh: ");
				short soban2 = sc.nextShort();
				sc.nextLine();
				System.out.println("Moi ban nhap so phat hanh: ");
				int soph = sc.nextInt();
				sc.nextLine();
				System.out.println("Moi ban nhap so trang sach: ");
				byte thangph = sc.nextByte();
				
				Thuvien tapchiThuvien = new Tapchi(matailieuString, nxbString2, soban2, soph, thangph);
				thuvienList.add(tapchiThuvien);
				
			case 3:
				System.out.println("Moi ban nhap ma bao: ");
				String mabaoString = sc.nextLine();
				System.out.println("Moi ban nhap ten nha xuat ban:");
				String nxbString3 = sc.nextLine();
				System.out.println("Moi ban nhap so ban phat hanh: ");
				Short soban3 = sc.nextShort();
				sc.nextLine();
				System.out.println("Moi ban nhap ngay phat hanh: ");
				String ngayph = sc.nextLine();
				
				Thuvien baoThuvien = new Bao(mabaoString, nxbString3, soban3, ngayph);
				thuvienList.add(baoThuvien);
			default:
				break;
			}
		}
	}
	
	private void xoatailieu() {
		System.out.println("Nhap ma tai lieu can xoa: ");
		String xoatlString = sc.nextLine();
		thuvienList.removeIf(Thuvien -> Thuvien.getTailieuId().equals(xoatlString.trim()));
	}
	
	public void hienthitailieu() {
		for (Thuvien infoThuvien : thuvienList) {
			System.out.println(infoThuvien);
		}
	}
	
	public void timtailieu() {
		System.out.println("Nhap ma tai lieu can tim:");
		String matlString = sc.nextLine();
		for (Thuvien infoThuvien : thuvienList) {
			if (infoThuvien.getTailieuId().equals(matlString.trim())) {
				System.out.println(infoThuvien);
			}
		}
	}
}