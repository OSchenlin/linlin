
package com.lin.pojo;

/**
 * 类名: Good <br/>
 * 功能: <br/>
 * 时间: 2018年7月7日 上午8:57:11 <br/>
 *
 * 作者: 无心
 * 
 * @version
 * @since JDK 1.8
 * @see
 */
public class Good {

	private Integer goodsId;// 编号
	private String goodsName;// 商品名称
	private String goodsType;// 商品型号
	private Integer goodsClassId;// 商品分类编号
	private Float goodsPrice; // 商品价格

	private GoodsClass goodc; // 分类对象

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getGoodsClassId() {
		return goodsClassId;
	}

	public void setGoodsClassId(Integer goodsClassId) {
		this.goodsClassId = goodsClassId;
	}

	public Float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public GoodsClass getGoodc() {
		return goodc;
	}

	public void setGoodc(GoodsClass goodc) {
		this.goodc = goodc;
	}

	public Good(Integer goodsId, String goodsName, String goodsType, Integer goodsClassId, Float goodsPrice,
			GoodsClass goodc) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsClassId = goodsClassId;
		this.goodsPrice = goodsPrice;
		this.goodc = goodc;
	}

	public Good() {
		super();
	}

}
