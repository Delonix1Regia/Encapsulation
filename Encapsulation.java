// Pengaplikasian Encapsulation pada program kasir sederhana


import java.util.Scanner;

public class Tugas4 {
	private String judul;
	private String pengarang;
	private double harga;
	private int jumlah;
	private double total;

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPengarang() {
		return pengarang;
	}

	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}

	public double getHarga() {
		return harga;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public double getTotal() {
		total=harga*jumlah;
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Tugas4 data=new Tugas4();

		System.out.println("==========INPUT PEMBELIAN BUKU==========");
		System.out.print("Judul: ");
		String judul=input.nextLine();
		data.setJudul(judul);

		System.out.print("Pengarang: ");
		String pengarang=input.nextLine();
		data.setPengarang(pengarang);

		System.out.print("Harga Buku (Rp): ");
		double harga= input.nextDouble();
		data.setHarga(harga);

		System.out.print("Jumlah Pembelian: ");
		int jumlah=input.nextInt();
		data.setJumlah(jumlah);
		System.out.println();

		System.out.println("==========DATA PEMBELIAN==========");
		System.out.println("Judul: "+data.getJudul());
		System.out.println("Pengarang: "+data.getPengarang());
		System.out.println("Harga Buku (Rp): "+data.getHarga());
		System.out.println("Jumlah Pembelian: "+data.getJumlah());
		System.out.println();

		System.out.println("==========TOTAL PEMBAYARAN==========");
		System.out.println("Total (Rp): "+data.getTotal());
	}
}