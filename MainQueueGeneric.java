
public class MainQueueGeneric {

	public static void main(String[] args) {
		QueueGeneric<Integer> nilaiInteger = new QueueGeneric<Integer>();
		nilaiInteger.setNilai(87657);
		System.out.println(nilaiInteger.getNilai());
		
		QueueGeneric<String> nilaiString = new QueueGeneric<String>();
		nilaiString.setNilai("RISDAYANTI");
		System.out.println(nilaiString.getNilai());
	}

}