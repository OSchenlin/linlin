
package com.lin.pojo;

/**
 * 类名: GoodsClass <br/>
 * 功能: <br/>
 * 时间: 2018年7月7日 上午8:59:31 <br/>
 *
 * 作者: 无心
 * 
 * @version
 * @since JDK 1.8
 * @see
 */
public class GoodsClass {
	private Integer goodsClassId; // 编号
	private String goodsClassName;// 分类名称

	public Integer getGoodsClassId() {
		return goodsClassId;
	}

	public void setGoodsClassId(Integer goodsClassId) {
		this.goodsClassId = goodsClassId;
	}

	public String getGoodsClassName() {
		return goodsClassName;
	}

	public void setGoodsClassName(String goodsClassName) {
		this.goodsClassName = goodsClassName;
	}

	public GoodsClass(Integer goodsClassId, String goodsClassName) {
		super();
		this.goodsClassId = goodsClassId;
		this.goodsClassName = goodsClassName;
	}

	public GoodsClass() {
		super();
	}

}
