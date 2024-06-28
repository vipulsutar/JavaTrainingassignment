package registeration;

public class premiumCalculationDo {
	static double premiumCalTermins(double sumAssured){
		double premium = sumAssured*0.0001;
		return premium;
	}
	static double premiumCalHealthins(double sumAssured){
		double premium = sumAssured*0.0001*1.25;
		return premium;
	}
}
