package com.ithinksky.petterns.base.Base001OpenClose.v1;

/**
 * @author tengpeng.gao
 */
public enum ProductStatus {
	PENDING_AUDIT(0, "待审核"),
	ON_SALE(1, "在售中"),
	SALE_OUT(2, "已售")

	;

	private final Integer value;

	private final String desc;

	ProductStatus(Integer value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public Integer getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}
}
