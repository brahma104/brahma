package com.airtel.manager;

import java.util.List;

import com.airtel.packages.DTHPackage;
import com.airtel.packages.DTHPackageBuilder;
import com.airtel.packages.KidsTopupPackage;
import com.airtel.packages.SportsTopupPackage;

public class PackageManager {
	public static DTHPackage getPackage(String packageName, List<String> topups) {
		DTHPackage dthPackage = null;
		DTHPackageBuilder builder = null;

		builder = new DTHPackageBuilder(packageName);
		if (packageName.equals("south super value")) {
			builder.channel("etv", "etv", 5);
			builder.channel("tv9", "tv9", 3);
			builder.channel("zee", "zee telugu", 2);
			builder.channel("maa", "maa tv", 6);
			dthPackage = builder.build();
		} else if (packageName.equals("north super value")) {
			builder.channel("colors", "colors", 9);
			builder.channel("aj", "aaj tak", 5);
			builder.channel("sp", "star plus", 9);
			builder.channel("zee", "zee hindi", 19);
			builder.channel("sn", "sony", 6);
			dthPackage = builder.build();
		}
		for (String topUp : topups) {
			if (topUp.equals("sports")) {
				dthPackage = new SportsTopupPackage(dthPackage);
			} else if (topUp.equalsIgnoreCase("kids")) {
				dthPackage = new KidsTopupPackage(dthPackage);
			}
		}
		return dthPackage;
	}
}
