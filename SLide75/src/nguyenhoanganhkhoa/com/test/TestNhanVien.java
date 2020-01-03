package nguyenhoanganhkhoa.com.test;

import java.util.Scanner;

import nguyenhoanganhkhoa.com.module.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1,nv2;
		System.out.print("Nhập mã NV1 : ");
		String maNV1 = new Scanner(System.in).nextLine();
		System.out.print("Nhập tên NV1 : ");
		String tenNV1 = new Scanner(System.in).nextLine();
		System.out.print("Nhập số SP NV1 : ");
		int soSPNV1 = new Scanner(System.in).nextInt();
		nv1 = new NhanVien (maNV1, tenNV1, soSPNV1);
		
		System.out.print("Nhập mã NV2 : ");
		String maNV2 = new Scanner(System.in).nextLine();
		System.out.print("Nhập tên NV2 : ");
		String tenNV2 = new Scanner(System.in).nextLine();
		System.out.print("Nhập số SP NV2 : ");
		int soSPNV2 = new Scanner(System.in).nextInt();
		nv2 = new NhanVien (maNV2, tenNV2, soSPNV2);
		
		System.out.println("-----------------------------------------");
		System.out.println("THÔNG TIN NHÂN VIÊN");
		System.out.println("Nhân viên 1 : Mã NV : " + nv1.getMa() + "\tTên : " + nv1.getTen() + "\tSố sản phẩm : " + nv1.getSoSP());
		System.out.println("Nhân viên 2 : Mã NV : " + nv2.getMa() + "\tTên : " + nv2.getTen() + "\tSố sản phẩm : " + nv2.getSoSP());
		
		System.out.println("-----------------------------------------");
		System.out.println("Lương nhân viên 1 : " + nv1.getLuong());
		System.out.println("Lương nhân viên 2 : " + nv2.getLuong());
		
		System.out.println("-----------------------------------------");
		if (nv1.lonHon(nv2))
			System.out.println("Nhân viên " + nv1.getTen() + " có mức bán SP cao hơn");
		else
			System.out.println("Nhân viên " + nv2.getTen() + " có mức bán SP cao hơn");
		/*
		if (nv1.getSoSP()>nv2.getSoSP())
			System.out.println("Nhân viên " + nv1.getTen() + " có mức bán SP cao hơn");
		else
			System.out.println("Nhân viên " + nv2.getTen() + " có mức bán SP cao hơn");
			*/

	}

}
