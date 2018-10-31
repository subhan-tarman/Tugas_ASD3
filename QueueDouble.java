
import java.util.ArrayList;


public class QueueDouble {
	ArrayList<Double> berat_badan= new ArrayList<Double>();
	int back = -1;
	
	public void insert(double value){
		berat_badan.add(value);
	}
	
	public double get(){
		double value = berat_badan.get(0);
		berat_badan.remove(0);
		return value;
	}
	
	public void cetak(){
		System.out.println("Data Berat Badan Mahasiswa"+berat_badan);
	}

}