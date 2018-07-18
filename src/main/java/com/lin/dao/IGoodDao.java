
package com.lin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lin.pojo.Good;
import com.lin.pojo.GoodsClass;

/**
 * 类名: IGoodDao <br/>
 * 功能: <br/>
 * 时间: 2018年7月7日 上午9:03:00 <br/>
 *
 * 作者: 无心
 * 
 * @version
 * @since JDK 1.8
 * @see
 */
public interface IGoodDao {

	/**
	 * 
	 * 方法名: queryAllGood <br/>
	 * 功能: 查询全部商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:03:29<br/>
	 *
	 * 作者: 无心
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public List<Good> queryAllGood();

	/**
	 * 
	 * 方法名: addGood <br/>
	 * 功能:新增商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:04:51<br/>
	 *
	 * 作者: 无心
	 *
	 * @param good
	 * @return
	 * @since JDK 1.8
	 */
	public int addGood(@Param("good") Good good);

	/**
	 * 
	 * 方法名: updateGood <br/>
	 * 功能: 修改商品信息<br/>
	 * 时间: 2018年7月7日 上午9:05:31<br/>
	 *
	 * 作者: 无心
	 *
	 * @param good
	 * @return
	 * @since JDK 1.8
	 */
	public int updateGood(@Param("good") Good good);

	/**
	 * 
	 * 方法名: deleteGood <br/>
	 * 功能:删除商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:06:50<br/>
	 *
	 * 作者: 无心
	 *
	 * @param id
	 * @return
	 * @since JDK 1.8
	 */
	public int deleteGoodById(@Param("id") Integer id);

	/**
	 * 
	 * 方法名: queryById <br/>
	 * 功能:根据ID查询详细信息 <br/>
	 * 时间: 2018年7月7日 上午9:26:10<br/>
	 *
	 * 作者: 无心
	 *
	 * @param id
	 * @return
	 * @since JDK 1.8
	 */
	public Good queryById(@Param("id") Integer id);

	/**
	 * 
	 * 方法名: queryAllGoodsClass <br/>
	 * 功能:查询全部分类 <br/>
	 * 时间: 2018年7月7日 上午9:08:01<br/>
	 *
	 * 作者: 无心
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public List<GoodsClass> queryAllGoodsClass();

}
