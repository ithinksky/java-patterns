package com.ithinksky.patterns.a03structural.t01adapter.tobject;

/**
 * Adapter
 *
 * @author tengpeng.gao
 */
public class SearchQueryAdapter extends SearchQuery {

	public static final String SEARCH_PREFIX = "V1";

	private ProductSearchQuery productSearchQuery;

	public SearchQueryAdapter(ProductSearchQuery productSearchQuery) {
		this.productSearchQuery = productSearchQuery;
	}

	public SearchQuery adapter() {
		this.setIndexName(SEARCH_PREFIX + productSearchQuery.getIndex());
		// 适配逻辑
		return this;
	}

}
