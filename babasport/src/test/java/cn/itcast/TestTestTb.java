package cn.itcast;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.service.TestTbService;
 

/**
 * 单元测试
 * @author wqk
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class TestTestTb {
	@Autowired
	private TestTbService testTbService ;
	@Test
	public void testAdd(){
		 TestTb vo = new TestTb();
		vo.setName("小名");
		vo.setBirthday(new Date());
		testTbService.addTestTb(vo);
		
	}

}
