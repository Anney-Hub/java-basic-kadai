package kadai_018;

public class KatoExec_Chapter18 {
	
	public static void main(String[] args) {
		
	KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
	KatoIchiro_Chapter18 ichi = new KatoIchiro_Chapter18();
	KatoHanako_Chapter18 hana = new KatoHanako_Chapter18();
	
	taro.setGivenName();
	taro.execIntroduce();

	System.out.println("");
	
	ichi.setGivenName();
	ichi.execIntroduce();
	
	System.out.println("");
	
	hana.setGivenName();
	hana.execIntroduce();
	
	}

}
