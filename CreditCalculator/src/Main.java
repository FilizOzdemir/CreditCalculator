
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Credit> credits = new ArrayList <Credit>();
		credits.add(new NeedCredit());//ihtiyaç kredisi
		credits.add(new CarCredit());//Taşıt kredisi
		credits.add(new OfficerCredit());//Memur kredisi
		
		Customer customer1= new Customer(1,"FİLİZ");
		

		Application application = new Application(credits,customer1);
		application.customerApplication(3,50000);//yıl,kredi miktarı
		
	}

}
