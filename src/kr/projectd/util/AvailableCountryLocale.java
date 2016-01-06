package kr.projectd.util;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

public class AvailableCountryLocale {
	
	static public Map<String, String> getISO3CountryMap() {
		String iso3CountryName;
		String displayCountryName;
		Map<String, String> lmap = new HashMap<String, String>();
		
		for (Locale l : Locale.getAvailableLocales()) {
			try {
				iso3CountryName = l.getISO3Country();
				displayCountryName = l.getDisplayCountry();
				if (iso3CountryName != null && displayCountryName != null) {
					lmap.put(iso3CountryName, displayCountryName);
				}
			} catch (MissingResourceException e) {}
		}
		return lmap;
	}
	
	static public Map<String, String> getDisplayCountryMap() {
		String iso3CountryName;
		String displayCountryName;
		Map<String, String> lmap = new HashMap<String, String>();
		
		for (Locale l : Locale.getAvailableLocales()) {
			try {
				iso3CountryName = l.getISO3Country();
				displayCountryName = l.getDisplayCountry();
				if (iso3CountryName != null && displayCountryName != null) {
					lmap.put(displayCountryName, iso3CountryName);
				}
			} catch (MissingResourceException e) {}
		}
		return lmap;
	}
	
	
	public static void main(String [] args) {
		for (String s : getDisplayCountryMap().values()) {
			System.out.println(s);
		}
		
		for (String s : getISO3CountryMap().values()) {
			System.out.println(s);
		}
	}
}
