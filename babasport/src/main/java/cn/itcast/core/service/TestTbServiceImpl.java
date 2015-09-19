package cn.itcast.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;

@Service
@Transactional
public class TestTbServiceImpl implements TestTbService {

	@Resource
	private TestTbDao testTbDao;
	
	public void addTestTb(TestTb testTb) {
		testTbDao.addTestTb(testTb);
		
	}
	@Transactional(readOnly=true)
	public List<TestTb> getTestTb(){
		return null;
	}

}