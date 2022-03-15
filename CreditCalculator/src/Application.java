import java.util.List;

public class Application {

	private List<Credit> credits;//kredi interface
	private Customer customer;//kullanıcı
	
	public Application(List<Credit> credits, Customer customer) {

		this.credits = credits;
		this.customer = customer;
	}
	void customerApplication(int year,double price) {
		if(credits.size()>0) {//1 veya 1'den fazla kredi girilmiş ise
			System.out.println(customer.getId()+" / "+customer.getName()+" adlı kişinin isteği kredi miktarı:");
			for (Credit credit : credits) {
				credit.calculate(year, price);//yıl,kredi miktarı
			}
		}
		else {
			System.out.println("Lütfe En Az Bir Kredi seçiniz : ");
		}
	}
		
}
