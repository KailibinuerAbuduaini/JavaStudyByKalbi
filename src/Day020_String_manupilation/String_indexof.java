package Day020_String_manupilation;

public class String_indexof {

	public static void main(String[] args) {
	

		String word1="github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("java"));
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Pos of ."+i);
		System.out.println(url.charAt(i+1));
		
		System.out.println("---------");
		String title="Java - Google Search";
		int dash=title.indexOf("-");
		
		System.out.println(dash);
	
		System.out.println(title.charAt(dash-1));
		System.out.println(title.charAt(dash+1));
		System.out.println("Apple");
		
		String country="united state of america";
		int state=country.indexOf("state");
		System.out.println("position of states:"+state);
		System.out.println("---------");
		
		String word2="java, c++,python,tomcat,eclipse";
		int find=word2.indexOf("c++");
		System.out.println("position of find:"+find);
		
		//contains()
	if(word2.contains("c++")) {
		System.out.println("c++ is there");
	}	System.out.println("c++ is not there");
		//indexOf()
	
	if(word2.indexOf("HTML")>-1) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ not there");
	}
		
		
		
		
		
		
	}

}
