package kadai_021;

import java.util.HashMap;
import java.util.Map;


public class Dictionary_Chapter21 {
	
	 public void dicdic(String[] word) {

//	HashMapの宣言 String + String
	Map<String,String> engDic = new HashMap<String,String>();
	
	engDic.put("apple","りんご");
	engDic.put("peach","桃");
	engDic.put("banana", "バナナ");
	engDic.put("lemon", "レモン");
	engDic.put("pear", "梨");
	engDic.put("kiwi", "キウイ");
	engDic.put("strawberry", "いちご");
	engDic.put("grape", "ぶどう");
	engDic.put("muscat", "マスカット");
	engDic.put("cherry", "さくらんぼ");

	for ( int i = 0; i < word.length; i++) {
		 String words = word[i];
			
		
			if ( engDic.containsKey(words) ) {
				String value = engDic.get(words);
				System.out.println( words + "の意味は" + value );
			}else {
				System.out.println( words + "は辞書にはないです");
//				break;
			}
		}
	}
	
}
