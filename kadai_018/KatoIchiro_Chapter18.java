package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

//	mainで名前を渡して変数givenNameにセットする
	public void setGivenName( String name ) {
		this.givenName = name;
	}
	
//	抽象メソッドの実装
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}



}
