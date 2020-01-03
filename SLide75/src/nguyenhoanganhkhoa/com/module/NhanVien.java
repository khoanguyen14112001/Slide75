package nguyenhoanganhkhoa.com.module;

public class NhanVien {
	private String ma;
	private String ten;
	private int soSP;
	public NhanVien(String ma, String ten, int soSP) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soSP = soSP;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		if(soSP<0)
			this.soSP = 0;
		else 
			this.soSP = soSP;
	}
	public double getLuong()
	{
		double donGia = 0;
		if (this.soSP<199)
			donGia = 0.5;
		else if (this.soSP>=200&&soSP<400)
			donGia = 0.55;
		else if (this.soSP>=400&&soSP<600)
			donGia = 0.6;
		else if (this.soSP>=600)
			donGia = 0.65;
		double luong = donGia * this.soSP;
		return luong;
	}
	public boolean lonHon(NhanVien nv2)
	{
		return this.soSP >nv2.soSP;
	}

}
