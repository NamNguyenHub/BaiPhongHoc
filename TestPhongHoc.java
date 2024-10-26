package nguyenThanhNam_19514681_PhongHoc;

import java.util.List;

public class TestPhongHoc {

	public static void main(String[] args) {
		ListPhongHocc ph = new ListPhongHocc();
		 
		ph.themPhong(new PhongLT("A01", "Day A", 100, 50, true));
		ph.themPhong(new PhongMT("B02", "Day B", 300, 40, 100));
		ph.themPhong(new PhongMT("C03", "Day C", 200, 60, 90));
		ph.themPhong(new PhongTN("B01", "Day B", 75, 50,"Hoa Hoc", 30, true ));
		
		System.out.println("Danh sach phong hoc:");
		System.out.println(ph);
		
		String mp="A01";
		System.out.println("Phong hoc voi ma:"+mp);
		System.out.println(ph.timPhong(mp));
		
		List<PhongHoc> pDC = ph.danhSachDc();
		System.out.println("Danh sach phong dat chuan:");
		for (PhongHoc p : pDC) {
			System.out.println(p);
		}
		ph.sapXepTheoDayNha();
		System.out.println("Danh sach phong theo day nha");
		System.out.println(ph);
		
		ph.sapXepTheoDienTich();
		System.out.println("Danh sach sap xep theo dien tich");
		System.out.println(ph);
		
		ph.sapXepTheoSoBongDen();
		System.out.println("Danh sach sap xep theo so bong den");
		System.out.println(ph);
		
		ph.xoaPhong("A01");
		System.out.println("Danh sach phong sau khi xoa");
		System.out.println(ph);
		
		System.out.println("Tong so phong hoc:"+ph.tongSoPhong());
		
		List<PhongMT> p60 = ph.dsPhongMtCo60may();
		System.out.println("Danh sach may tinh co 60 may:");
		for(PhongMT p : p60) {
			System.out.println(p);
		}
	}

}
