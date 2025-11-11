import java.util.Scanner;

class Pelanggan {
	private String namaPelanggan;
	private String jenisLoundry;
	private String alamat;
	private String noTelpon;
	private double hargaPerkilo;
	private String tanggalPesan;
	private String tanggalAmbil;
	private double beratCuci;

	Pelanggan (String namaPelanggan, String jenisLoundry, String alamat, String noTelpon, 
		double hargaPerkilo, String tanggalPesan, String tanggalAmbil, double beratCuci){
		this.namaPelanggan = namaPelanggan;
		this.jenisLoundry = jenisLoundry;
		this.alamat = alamat;
		this.noTelpon = noTelpon;
		this.hargaPerkilo = hargaPerkilo;
		this.tanggalPesan = tanggalPesan;
		this.tanggalAmbil = tanggalAmbil;
		this.beratCuci = beratCuci;
	}
	public void setnamaPelanggan(String namaPelanggan){
		this.namaPelanggan = namaPelanggan;
	}
	public String getnamaPelanggan(){
		return namaPelanggan;
	}
	public void setjenisLoundry(String jenisLoundry){
		this.jenisLoundry = jenisLoundry;
	}
	public String getjenisLoundry(){
		return jenisLoundry;
	}
	public void setalamat(String alamat){
		this.alamat = alamat;
	}
	public String getalamat(){
		return alamat;
	}
	public void setnoTelpon(String noTelpon){
		this.noTelpon = noTelpon;
	}
	public String getnoTelpon(){
		return noTelpon;
	}
	public void sethargaPerkilo(double hargaPerkilo){
		this.hargaPerkilo = hargaPerkilo;
	}
	public double gethargaPerkilo(){
		return hargaPerkilo;
	}
	public void settanggalPesan(String tanggalPesan){
		this.tanggalPesan = tanggalPesan;
	}
	public String gettanggalPesan(){
		return tanggalPesan;
	}
	public void settanggalAmbil(String tanggalAmbil){
		this.tanggalAmbil = tanggalAmbil;
	}
	public String gettanggalAmbil(){
		return tanggalAmbil;
	}
	public void setberatCuci(double beratCuci){
		this.beratCuci = beratCuci;
	}
	public double getberatCuci(){
		return beratCuci;
	}
	public double gettotalHarga(){
		return hargaPerkilo * beratCuci;
	}
}

public class Mandiri2{
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Mandiri2 r = new Mandiri2();
		r.runThis();
	}

	public void runThis(){
		Pelanggan Pelanggan1 = inputData();
		viewData(Pelanggan1);
	}

	public Pelanggan inputData(){
		String namaPelanggan, jenisLoundry, alamat, noTelpon, tanggalPesan, tanggalAmbil;
		double beratCuci, hargaPerkilo;

		System.out.println("=== Detail Pesanan Loundry ===");
		System.out.print("Nama Pelanggan    : ");
		namaPelanggan = input.nextLine();
		System.out.print("Jenis Loundry     : ");
		jenisLoundry = input.nextLine();
		System.out.print("Alamat            : ");
		alamat = input.nextLine();
		System.out.print("No Hp             : ");
		noTelpon = input.nextLine();
		System.out.print("Tanggal Pesanan   : ");
		tanggalPesan = input.nextLine();
		System.out.print("Tanggal Selesai   : ");
		tanggalAmbil = input.nextLine();
		System.out.print("Harga Per-Kilo    : ");
		hargaPerkilo = input.nextDouble();
		System.out.print("Berat Loundry     : ");
		beratCuci = input.nextDouble();

		Pelanggan pelanggan = new Pelanggan(namaPelanggan, jenisLoundry, alamat, noTelpon, hargaPerkilo, tanggalPesan, tanggalAmbil, beratCuci);
		return pelanggan;
	}
	public void viewData(Pelanggan pelanggan){
		System.out.println("=== Pesanan Loundry ===");
		System.out.println("Nama                     : " + pelanggan.getnamaPelanggan());
		System.out.println("Jenis Loundry            : "+ pelanggan.getjenisLoundry());
		System.out.println("Alamat                   : " + pelanggan.getalamat());
		System.out.println("No Hp                    : " + pelanggan.getnoTelpon());
		System.out.println("Total Harga              : Rp " + pelanggan.gethargaPerkilo());
		System.out.println("Tanggal Pemenasan        : " + pelanggan.gettanggalPesan());
		System.out.println("Tanggal Loundry Selesai  : " + pelanggan.gettanggalAmbil());
		System.out.println("Berat Cucian             : " + pelanggan.getberatCuci() + " Kg");
		System.out.println("Total Harga Cucian       : Rp " + pelanggan.gettotalHarga());

	}
}