
package com.lin.biz;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.dao.IGoodDao;
import com.lin.pojo.Good;
import com.lin.pojo.GoodsClass;

/**
 * 类名: GoodBiz <br/>
 * 功能: <br/>
 * 时间: 2018年7月7日 上午9:08:36 <br/>
 *
 * 作者: 无心
 * 
 * @version
 * @since JDK 1.8
 * @see
 */
@Service
public class GoodBiz {

	@Autowired
	private IGoodDao gooddao;

	/**
	 * 
	 * 方法名: queryAllGood <br/>
	 * 功能:查询全部商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:09:55<br/>
	 *
	 * 作者: 无心
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public List<Good> queryAllGood() {
		return gooddao.queryAllGood();
	}

	/**
	 * 
	 * 方法名: queryById <br/>
	 * 功能:根据ID查询详情信息 <br/>
	 * 时间: 2018年7月7日 上午9:28:55<br/>
	 *
	 * 作者: 无心
	 *
	 * @param id
	 * @return
	 * @since JDK 1.8
	 */
	public Good queryById(Integer id) {
		return gooddao.queryById(id);
	}

	/**
	 * 
	 * 方法名: addGood <br/>
	 * 功能:新增商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:10:54<br/>
	 *
	 * 作者: 无心
	 *
	 * @param good
	 * @return
	 * @since JDK 1.8
	 */
	public int addGood(Good good) {
		return gooddao.addGood(good);
	}

	/**
	 * 
	 * 方法名: modifyGood <br/>
	 * 功能:修改商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:12:05<br/>
	 *
	 * 作者: 无心
	 *
	 * @param good
	 * @return
	 * @since JDK 1.8
	 */
	public int modifyGood(@Param("good") Good good) {
		return gooddao.updateGood(good);
	}

	/**
	 * 
	 * 方法名: removeGoodById <br/>
	 * 功能:删除商品信息 <br/>
	 * 时间: 2018年7月7日 上午9:13:29<br/>
	 *
	 * 作者: 无心
	 *
	 * @param id
	 * @return
	 * @since JDK 1.8
	 */
	public int removeGoodById(Integer id) {
		return gooddao.deleteGoodById(id);
	}

	/**
	 * 
	 * 方法名: queryAllGoodsClass <br/>
	 * 功能:查询全部分类 <br/>
	 * 时间: 2018年7月7日 上午9:14:11<br/>
	 *
	 * 作者: 无心
	 *
	 * @return
	 * @since JDK 1.8
	 */
	public List<GoodsClass> queryAllGoodsClass() {
		return gooddao.queryAllGoodsClass();
	}
}
