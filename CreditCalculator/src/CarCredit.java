
public class CarCredit implements Credit{

	//Tasit/araba kredisi
	private int tax=18;//vergi
	@Override
	public void calculate(int year, double price) {
		
	double yearlyInterest=(price*tax/100);//yeralyInterest:yıllık faiz
	double totalPrice=price;//total price:toplam fiyat(kredi miktarı)
	
	for (int i = 0; i < year; i++) {
		totalPrice+=yearlyInterest;
	}
		System.out.println("Araba/taşıt kredisi miktarı = "+totalPrice);
	}

}
