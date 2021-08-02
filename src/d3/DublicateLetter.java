package d3;

public class DublicateLetter {

	public static void main(String[] args) {
		String str="computer computing";
		char[]carray=str.toCharArray();
		System.out.println("The string is:"+str);
		System.out.println("Dublicate characters in above string are:");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
			if (carray[i]==carray[j]) {
				System.out.println(carray[j]+ "");
			}
			}
		}

	}

}
