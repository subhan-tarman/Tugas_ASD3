import java.util.ArrayList;

public class StackString {

	ArrayList<String> Mahasiswa = new ArrayList<String>();
	int top = -1;
	
public void push(String value){
	Mahasiswa.add(value);
	top = top+1;
	}

public String pop (){
	String value = Mahasiswa.get(top);
	Mahasiswa.add(value);
	top = top+1;
	return value;
	}

public void cetak (){
	System.out.println(Mahasiswa.toString());
}
}

