package com.ithinksky.patterns.a03structural.t01adapter.tobject;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author tengpeng.gao
 */
class SearchQueryAdapterTest {

	@Test
	void adapter() {
		ProductSearchQuery productSearchQuery = new ProductSearchQuery();
		productSearchQuery.setIndex("user_search");
		SearchQuery adapter = new SearchQueryAdapter(productSearchQuery).adapter();
		assertEquals(
				SearchQueryAdapter.SEARCH_PREFIX + "user_search",
				adapter.getIndexName(),
				"IndexName 适配逻辑不正确");
	}
}