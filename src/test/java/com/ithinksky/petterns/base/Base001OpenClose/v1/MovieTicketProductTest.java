package com.ithinksky.petterns.base.Base001OpenClose.v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tengpeng.gao
 */
public class MovieTicketProductTest {

	private final ArrayList<MovieTicketProduct> bookList = new ArrayList();

	@BeforeEach
	void setUp() {
		bookList.add(new MovieTicketProduct("《沉默是金》", 50000, ProductStatus.ON_SALE.getValue()));
		bookList.add(new MovieTicketProduct("《无间道》", 4600, ProductStatus.ON_SALE.getValue()));
		bookList.add(new MovieTicketProduct("《苏乞儿》", 2000, ProductStatus.ON_SALE.getValue()));
		bookList.add(new MovieTicketProduct("《听风者》", 3500, ProductStatus.ON_SALE.getValue()));
		bookList.add(new MovieTicketProduct("《倚天屠龙记》", 6600, ProductStatus.ON_SALE.getValue()));
		bookList.add(new MovieTicketProduct("《少林寺》", 5400, ProductStatus.SALE_OUT.getValue()));
	}

	@Test
	void getMovieTicketProductList() {
		List<MovieTicketProduct> onSaleList =
				bookList.stream()
						.filter(e -> ProductStatus.ON_SALE.getValue().equals(e.getStatus()))
						.collect(Collectors.toList());
		onSaleList.forEach(t -> {
			System.out.println("在售商品：== " + t);
		});
	}
}