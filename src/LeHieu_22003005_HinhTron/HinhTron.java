package LeHieu_22003005_HinhTron;

public class HinhTron {
	public static final double PI= 3.1416;
	private double bankinh;
	private ToaDo tam;
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public HinhTron() {}
	
	public HinhTron(double BanKinh, ToaDo tam) {
		this.bankinh =BanKinh; 
		this.tam = tam;
	}
	public double getDienTich() {
		return getBankinh()*getBankinh()*PI;
	}
	@Override
	public String toString() {
	    return String.format("Ban Kinh: %-5s; Dien Tich: %-10s", getBankinh(), getDienTich());
	}
	
}
