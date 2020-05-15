package com.ithinksky.petterns.base.Base001OpenClose.v2;

/**
 * @author tengpeng.gao
 */
public class MovieTicketProduct implements IProduct {

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品价格
	 */
	private int price;

	/**
	 * 商品状态
	 */
	private int status;

	public MovieTicketProduct(String name, int price, int status) {
		this.name = name;
		this.price = price;
		this.status = status;
	}

	@Override
	public String toString() {
		return "MovieTicketProduct{" + "name='" + name + '\'' + ", price=" + price + ", status=" + status + '}';
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
