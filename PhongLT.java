package nguyenThanhNam_19514681_PhongHoc;

public class PhongLT extends PhongHoc {
	private boolean coMayChieu;
	

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}


	public PhongLT() {
		super();
		this.coMayChieu = false;
	}
	

	public PhongLT(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}


	public boolean isCoMayChieu() {
		return coMayChieu;
	}


	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}


	@Override
	public boolean getDatChuan() {
		
		return (duSang() && coMayChieu);
	}
	
	@Override
	public String toString() {
		String mayChieu = coMayChieu? "Co may chieu": "Khong co may chieu";
		return super.toString()+String.format("%s", mayChieu);
	}
}
