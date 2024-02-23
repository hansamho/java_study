package java_ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		
//		ArrayList<Language> arrayList= new ArrayList<Language>();
		
		

		List<String> listStrings=new ArrayList<String>();
		
//		listString.set(0, null);
//		listString.set(1, 1);
//		listString.set(2, "Tony");
//		listString.set("Tony");
		
		listStrings.add("Stark");
		listStrings.add("Tony");
		
		for(int i=0;i<listStrings.size(); i++) {
			System.out.println(listStrings.get(i));
		}
		System.out.println("=========");
		
		for(String listString: listStrings) {    //데이터 있는 만큼 루프해서 값 출력
			System.out.println(listString);
		}
		
		System.out.println("========");
		
		List<Language> languages= new ArrayList<Language>(); //list에 객체를 담는다.
		
		Language language1=new Language();
		Language language2=new Language("KO", 1);
		
		languages.add(language1);
		languages.add(language2);
		languages.add(new Language("EN", 2));
		
		for(Language language: languages) {
			System.out.println(language.getName()+"|"+language.getVersion());
		}
		
		
		
		
		
	}

}
