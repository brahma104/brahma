package com.ehcache.test;

import com.ehcache.bean.Product;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EHCacheTest {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Redmine 5");
		product.setDescription("Smart Mobile");

		CacheManager cacheManager = new CacheManager();
		Cache pCache = cacheManager.getCache("product");
		pCache.put(new Element(product.getId(), product));

		Product p1 = (Product) pCache.get(1).getValue();
		System.out.println(p1.getName());
	}
}


















