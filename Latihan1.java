import java.util.Scanner;

class Barang {
	private String kodeBarang;
	private String namaBarang;
	private String produsen;
	private int beratBersih;
	private int hargaBeli;
	private int hargaJual;

	Barang(String kodeBarang, String namaBarang, String produsen, int beratBersih, int hargaBeli, int hargaJual) {
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
		this.produsen = produsen;
		this.beratBersih = beratBersih;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}
	public void setkodeBarang(String kodeBarang){
		this.kodeBarang = kodeBarang;
	}
	public String getkodeBarang(){
		return kodeBarang;
	}
	public void setnamaBarang(String namaBarang){
		this.namaBarang = namaBarang;
	}
	public String getnamaBarang(){
		return namaBarang;
	}
	public void setprodusen(String produsen){
		this.produsen = produsen;
	}
	public String getprodusen(){
		return produsen;
	}
	public void setberatBersih(int beratBersih){
		this.beratBersih = beratBersih;
	}
	public int getberatBersih(){
		return beratBersih;
	}
	public void sethargaBeli(int hargaBeli){
		this.hargaBeli = hargaBeli;
	}
	public int gethargaBeli(){
		return hargaBeli;
	}
	public void sethargaJual(int hargaJual){
		this.hargaJual = hargaJual;
	}
	public int gethargaJual(){
		return hargaJual;
	}
}

public class Latihan1{
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Latihan1 r = new Latihan1();
		r.runThis();
	}
	public void runThis(){
		Barang barang1 = inputData();
		viewData(barang1);
	}
	public Barang inputData(){
		String kode, nama, produsen;
		int beratBersih, hargaBeli, hargaJual;

		System.out.println("  === Inputan Data Barang ===");
		System.out.print("Kode                : ");
		kode = input.nextLine();       
		System.out.print("Nama                : ");
		nama = input.nextLine();       
		System.out.print("Produsen            : ");
		produsen = input.nextLine();       
		System.out.print("Berat Bersih        : ");
		beratBersih = input.nextInt();       
		System.out.print("Harga Beli          : ");
		hargaBeli = input.nextInt();       
		System.out.print("Harga Jual          : ");
		hargaJual = input.nextInt();

		Barang barang = new Barang(kode, nama, produsen, beratBersih, hargaJual, hargaBeli);
		return barang;

	}
	public void viewData(Barang barang){
		System.out.println("=== Menampilkan Data Barang === ");
		System.out.println("Nama            : " + barang.getnamaBarang());
		System.out.println("Kode            : " + barang.getkodeBarang());
		System.out.println("Produsen        : " + barang.getprodusen());
		System.out.println("Berat Bersih    : " + barang.getberatBersih() + " Kg");
		System.out.println("Harga beli      : Rp " + barang.gethargaBeli());
		System.out.println("Harga jual      : Rp " + barang.gethargaJual());
	}
}


