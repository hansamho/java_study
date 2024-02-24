package java_ch15.first.study;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		List<Language> languages=new ArrayList<Language>();
		
		Language languages1=new Language();
		Language languages2=new Language("KR", 1);
		
		languages.add(languages1);
		languages.add(languages2);
		languages.add(new Language("KR", 2));
		
		for(Language language: languages) {
			System.out.println(language.getName()+"|"+language.getVersion());
		}
		
	}

}
