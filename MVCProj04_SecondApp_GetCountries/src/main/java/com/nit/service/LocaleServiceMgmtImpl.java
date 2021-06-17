package com.nit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaleServiceMgmtImpl implements ILocaleServiceMgmt {

	@Override
	public List<String> fetchCountries() {

		Locale locales[] = Locale.getAvailableLocales();
		List<String> country_list = new ArrayList<>();

		for (Locale l : locales) {
			if (l != null && l.getDisplayCountry().length() != 0)
				country_list.add(l.getDisplayCountry());

		}
		return country_list;
	}
}
