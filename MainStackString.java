
public class MainStackString {
	
	public static void  main(String[] args) {
	StackString Nama = new StackString();
	Nama.cetak();
	
	Nama.push("khodijah");Nama.cetak();
	Nama.push("aisyah");Nama.cetak();
	Nama.push("fatimah");Nama.cetak();
	Nama.push("Risda");Nama.cetak();
	
	String nm = Nama.pop();Nama.cetak();
	System.out.println(nm);
	}

}
