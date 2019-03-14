package language;

import java.util.Locale;

public class SystemLanguage {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault().getLanguage().toString());
	}

}
