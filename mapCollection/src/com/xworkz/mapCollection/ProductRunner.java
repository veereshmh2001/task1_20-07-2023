package com.xworkz.mapCollection;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking in Product Runner");
		
		ProductDTO product = new ProductDTO("milk", 22.2, 233, 1, LocalDate.of(2023, 11, 23));
		ProductDTO product2 = new ProductDTO("rice", 32.2, 333, 3, LocalDate.of(2023, 1, 31));
		ProductDTO product3 = new ProductDTO("shirt", 100.2, 433, 5, LocalDate.of(2023, 11, 22));
		
		CompanyDTO company = new CompanyDTO("Swiggy", "Bangalore", 451278963L);
		CompanyDTO company2 = new CompanyDTO("Zomato", "Hubballi", 123278963L);
		CompanyDTO company3 = new CompanyDTO("FlipKart", "Dharwad", 778578963L);
		
		Map<ProductDTO, CompanyDTO> productAndCompanyMap=new HashMap<ProductDTO, CompanyDTO>();
		productAndCompanyMap.put(product3, company3);
		productAndCompanyMap.put(product2, company2);
		productAndCompanyMap.put(product, company);
		
		System.out.println("----------------");
		
		Set<ProductDTO> products=productAndCompanyMap.keySet();
		products.forEach(r->System.out.println(r));
		
		System.out.println("----------------");
		
		Collection<CompanyDTO> companies=productAndCompanyMap.values();
		companies.forEach(c->System.out.println(c));
		
		
		

	}

}
