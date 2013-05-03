package ac.id.unpas.rkppl;

public class Mahasiswa {
	
	private String nama;
	private String nrp;
		
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNrp("098000012");
		mahasiswa.setNama("XXXx");
	}

}
