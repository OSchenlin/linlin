
package GoodTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lin.biz.GoodBiz;
import com.lin.pojo.Good;
import com.lin.pojo.GoodsClass;

/**
 * 类名: GoodTest <br/>
 * 功能: <br/>
 * 时间: 2018年7月7日 上午9:29:40 <br/>
 *
 * 作者: 无心
 * 
 * @version
 * @since JDK 1.8
 * @see
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
public class GoodTest {

	@Autowired
	private GoodBiz biz;
	@Autowired
	private GoodBiz gbiz;

	@Test
	public void quer() {

	}

	@Test
	public void queryAll() {
		List<Good> good = biz.queryAllGood();
		for (Good good2 : good) {
			System.out.println(good2.getGoodsId() + "\t" + good2.getGoodsName() + "\t" + good2.getGoodsType() + "\t"
					+ good2.getGoodsPrice());
		}
	}

	@Test
	public void queryAllGoodsClass() {
		List<GoodsClass> list = biz.queryAllGoodsClass();
		for (GoodsClass goodsClass : list) {
			System.out.println(goodsClass.getGoodsClassId() + "\t" + goodsClass.getGoodsClassName());
		}
	}

	@Test
	public void test1() {
		int a = 10;
		int b = 2;
		System.out.println("交换前:\ta=" + a + "\tb=" + b);
		a = a + b; // a=10+2=12
		b = a - b; // b=12-2=10
		a = a - b; // a=12-10=2
		System.out.println("交换后:\ta=" + a + "\tb=" + b);
		System.out.println("再次交换");
		a = a ^ b; 
		System.out.println("a=" + a);
		b = a ^ b; 
		System.out.println("b=" + b);
		a = a ^ b; 
		System.out.println("a=" + a);
		System.out.println("再次交换后:\ta=" + a + "\tb=" + b);
	}

}
