package ch08;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	
	public ProductService() {
		Product p = new Product("101", "애플사과폰12", "애플전자", 1200000, "2020.12.12");
		products.put("101", p);
		p = new Product("102", "samsung 21", "samsung", 1300000, "2021.2.2");
		products.put("102", p);
		p = new Product("103", "Lsdualphone", "Ls", 1500000, "2021.3.2");
		products.put("103", p);
	}
	
	public List<Product> findAll(){
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		return products.get(id);
	}
}
