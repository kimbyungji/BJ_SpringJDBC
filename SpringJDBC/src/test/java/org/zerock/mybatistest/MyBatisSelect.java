package org.zerock.mybatistest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.board.command.ScoreVO;
import org.zerock.testMapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisSelect {
	// MyBatis는 DAO를 대체...
	// 마이바티스 매퍼... (mapper 스캔 또는 직접 지정. 매퍼인터페이스, 메퍼xml이 존재해야 함)
	@Autowired
	private TestMapper mapper;
	
	@Test
	public void select() {
		String time = mapper.getTime();
		System.out.println(time);	// select sysdate from dual의 결과
		
		List<ScoreVO> list = mapper.select();
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
	}
}
