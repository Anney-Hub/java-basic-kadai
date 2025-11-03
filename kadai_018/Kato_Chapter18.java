package kadai_018;

abstract public class Kato_Chapter18 {
	
//	全員加藤で同じ住所なので親で指定して宣言する
	public String familyName = "加藤";
	public String address = "東京都中野区〇×";
	
	public String givenName;
	
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName +"です");
	}

	public void execIntroduce() {
		System.out.println("住所は" + this.address + "です");
	}

	//	抽象メソッドは具体内容を書かずに全体の型だけ親で指定する
	abstract public void eachIntroduce();
	


}
