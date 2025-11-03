package kadai_018;

public class KatoExec_Chapter18 {
	
	public static void main(String[] args) {
		
	KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
	KatoIchiro_Chapter18 ichi = new KatoIchiro_Chapter18();
	KatoHanako_Chapter18 hana = new KatoHanako_Chapter18();
	
	taro.setGivenName("太郎");
	taro.commonIntroduce();
	taro.execIntroduce();
	taro.eachIntroduce();

	System.out.println("");
	
	ichi.setGivenName("一郎");
	ichi.commonIntroduce();
	ichi.execIntroduce();
	ichi.eachIntroduce();
	
	System.out.println("");
	
	hana.setGivenName("花子");
	hana.commonIntroduce();
	hana.execIntroduce();
	hana.eachIntroduce();
	
	}

}
