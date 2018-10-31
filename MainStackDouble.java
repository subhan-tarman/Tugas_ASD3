
public class MainStackDouble {
	
	public static void main(String[]args) {
		StackDouble Tinggi = new StackDouble();
		Tinggi.cetak();
		
		Tinggi.push(145.5);Tinggi.cetak();
		Tinggi.push(150.65);Tinggi.cetak();
		Tinggi.push(160.5);Tinggi.cetak();
		
		Double tg = Tinggi.pop();Tinggi.cetak();
		System.out.println(tg);
		
	}

}
