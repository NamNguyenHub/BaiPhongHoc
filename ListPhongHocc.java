package nguyenThanhNam_19514681_PhongHoc;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHocc {
	private List<PhongHoc> dsP;
	
	public ListPhongHocc() {
		dsP = new ArrayList<PhongHoc>();
	}
	public boolean themPhong(PhongHoc p) {
		if(dsP.contains(p))
			return false;
		dsP.add(p);
		return true;
	}
	public PhongHoc timPhong(String maPhong) {
		for (PhongHoc p : dsP) {
			if(p.getMaPhong().equalsIgnoreCase(maPhong))
				return p;
		}
		return null;
	}
	public List<PhongHoc>danhSachDc(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc p : dsDC) {
			if(p.getDatChuan())
				dsDC.add(p);
		}
		return dsDC;
	}
	public void sapXepTheoDayNha() {
		dsP.sort((p1,p2)->p1.getDayNha().compareToIgnoreCase(p2.getDayNha()));
	}
	public void sapXepTheoDienTich() {
		dsP.sort((p1,p2)-> Double .compare(p2.getDienTich(), p1.getDienTich()));
	}
	public void sapXepTheoSoBongDen() {
		dsP.sort((p1,p2)-> Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
	}
	public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
		PhongHoc p = timPhong(maPhong);
		if(p!=null)
		dsP.remove(p);
	}
	public void xoaPhong(String maPhong) {
		PhongHoc p= timPhong(maPhong);
		if(p!=null)
			dsP.remove(p);
	}
	public int tongSoPhong() {
		return dsP.size();
	}
	
	public List<PhongMT> dsPhongMtCo60may(){
		List<PhongMT> dsP60 = new ArrayList<PhongMT>();
		for (PhongHoc p : dsP) {
			if(p instanceof PhongMT && ((PhongMT) p).getSoMayTinh()>=60)
					dsP60.add((PhongMT) p);
			 return dsP60;
				}
		return dsP60;
		}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (PhongHoc p : dsP) {
			sb.append(p.toString()).append("\n");
		}
		return sb.toString();
	}
	}


