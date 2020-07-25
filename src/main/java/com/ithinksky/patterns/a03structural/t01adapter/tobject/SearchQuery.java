package com.ithinksky.patterns.a03structural.t01adapter.tobject;

/**
 * Target
 *
 * @author tengpeng.gao
 */
public class SearchQuery {

	private String indexName;

	// ……

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	@Override
	public String toString() {
		return "SearchQuery{" + "indexName='" + indexName + '\'' + '}';
	}
}
