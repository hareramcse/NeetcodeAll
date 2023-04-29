package com.hs.array.all.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
	private String getFormattedEmail(String email) {
		String[] arr = email.split("@");
		String localName = arr[0];
		String domainName = arr[1];

		// Only keep the first part of "+" sign
		String[] arrLocalWithPlus = localName.split("\\+");
		localName = arrLocalWithPlus[0];

		// Replace "."/dots
		localName = localName.replace(".", "");

		return localName + "@" + domainName;
	}

	public int numUniqueEmails(String[] emails) {
		Set<String> uniqueEmails = new HashSet<>();
		for (String email : emails) {
			String formattedEmail = getFormattedEmail(email);
			uniqueEmails.add(formattedEmail);
		}
		return uniqueEmails.size();
	}
}
