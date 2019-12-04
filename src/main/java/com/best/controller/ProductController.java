package com.best.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.product.ProductDto;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping(value = "/get")
	public ProductDto getProduct() {
		System.out.println("i am inside get product");

		ProductDto pd = new ProductDto();

		pd.setName("Samsun S");
		pd.setId("A10");
		pd.setCapacity("this is new version");

		return pd;
	}

}
