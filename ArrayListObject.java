import java.util.ArrayList;
public class ArrayListObject {
	
public static void main(String[]args){
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("RISDAYANTI", "DO217318","B","MAJENE"));
	Data.add(new Mahasiswa("NURLINA","D0217326","B","MAJENE"));
	Data.add(new Mahasiswa("MULIANA","D0217323","B","MAJENE"));
	Data.add(new Mahasiswa("ASWANDI","D0217011","B","MAJENE"));
	
	Data.forEach(data ->{;
		System.out.println("Nama : " + data.getNama() + ", Nim : " + data.getNim() + ", Kelas : " + data.getKelas() + ". Alamat : " + data.getAlamat());
		});
	
	

		
	
}

}
