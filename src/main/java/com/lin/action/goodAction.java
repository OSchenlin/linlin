
package com.lin.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lin.biz.GoodBiz;
import com.lin.pojo.Good;
import com.lin.pojo.GoodsClass;

/**
 * 类名: goodAction <br/>
 * 功能: <br/>
 * 时间: 2018年7月7日 上午9:43:37 <br/>
 *
 * 作者: 无心
 * 
 * @version
 * @since JDK 1.8
 * @see
 */

@RestController
@RequestMapping("/api")
public class goodAction {

	@Autowired
	private GoodBiz biz;

	/**
	 * 
	 * 方法名: queryAllGood <br/>
	 * 功能:查询全部信息 <br/>
	 * 时间: 2018年7月7日 上午10:45:46<br/>
	 *
	 * 作者: 无心
	 *
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "goods", method = RequestMethod.GET)
	public List<Good> queryAllGood() {
		return biz.queryAllGood();

	}

	/**
	 * 
	 * 方法名: deleteGood <br/>
	 * 功能:删除 <br/>
	 * 时间: 2018年7月7日 上午11:19:49<br/>
	 *
	 * 作者: 无心
	 *
	 * @param id
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "goods/good/{id}", method = RequestMethod.DELETE)
	public Map<String, String> deleteGood(@PathVariable Integer id) {
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.removeGoodById(id);
			message.put("code", "200");
			message.put("msg", "ok");
		} catch (Exception ex) {
			message.put("code", "500");
			message.put("msg", ex.getMessage());
		}
		return message;
	}

	/**
	 * 根据ID查询详情 方法名: queryById <br/>
	 * 功能: <br/>
	 * 时间: 2018年7月7日 上午11:21:18<br/>
	 *
	 * 作者: 无心
	 *
	 * @param id
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "goods/good/{goodsId}", method = RequestMethod.GET)
	public Good queryById(@PathVariable Integer goodsId) {
		return biz.queryById(goodsId);
	}

	/**
	 * = 方法名: queryAllGoodsClass <br/>
	 * 功能: 查询下拉列表<br/>
	 * 时间: 2018年7月7日 上午11:29:51<br/>
	 *
	 * 作者: 无心
	 *
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "GoodsClass", method = RequestMethod.GET)
	public List<GoodsClass> queryAllGoodsClass() {
		return biz.queryAllGoodsClass();
	}

	/**
	 * 
	 * 方法名: updategood <br/>
	 * 功能:修改 <br/>
	 * 时间: 2018年7月7日 下午12:04:16<br/>
	 *
	 * 作者: 无心
	 *
	 * @param good
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "goods/good", method = RequestMethod.PUT)
	public Map<String, String> updategood(@RequestBody Good good) {
		Map<String, String> message = new HashMap<String, String>();
		try {
			biz.modifyGood(good);
			message.put("code", "200");
			message.put("msg", "ok");
		} catch (Exception ex) {
			message.put("code", "500");
			message.put("msg", ex.getMessage());
		}
		return message;
	}

}
