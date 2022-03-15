
public class OfficerCredit implements Credit {

	//memur kredisi
	private int tax=20;//vergi
	@Override
	public void calculate(int year, double price) {
		double yearlyInterest=(price*tax/100);//yıllık faiz
		double totalPrice=price;//toplam fiyat
		
		for (int i = 0; i < year; i++) {
			totalPrice+=yearlyInterest;
		}
		System.out.println("Memur kredisi miktarı :" +totalPrice);
	}

}
