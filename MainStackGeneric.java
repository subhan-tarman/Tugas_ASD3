
public class MainStackGeneric {

	public static void main(String[] args) {
		StackGeneric tumpuk = new StackGeneric();
		 
		tumpuk.push("KHODIJAH");tumpuk.cetak();
		tumpuk.push("AISYAH");tumpuk.cetak();
		tumpuk.push("FATIMAH");tumpuk.cetak();
		tumpuk.push("RISDA");tumpuk.cetak();
		tumpuk.push("JAFAR");tumpuk.cetak();
	
		tumpuk.pop();tumpuk.cetak();

	}

}