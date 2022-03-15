
public class NeedCredit implements Credit{
	//ihtiyaç kredisi
	private int tax=21;//vergi
	@Override
	public void calculate(int year, double price) {
		double yearlyInterest = (price*tax/100);//yıllık faiz
		double totalPrice=price;//toplam fiyat
		for (int i = 0; i < year; i++) {
			totalPrice+=yearlyInterest;
		}
		System.out.println("İhtiyaç kredisi miktarı : "+totalPrice);
	}
	
	
}
