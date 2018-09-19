package com.pk.item;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//아래 경로애 있는 설정 파일을 실행시킨 후 테스트
@ContextConfiguration(locations = { 
		"file:src/main/webapp/WEB-INF/spring/**/*.xml"
})
public class TestCase {
	@Autowired
	private SqlSession sqlsession;
	
	@Test
	public void testmethod() {
		System.out.println(sqlsession);
	}
}
