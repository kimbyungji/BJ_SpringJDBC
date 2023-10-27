package org.zerock.mybatistest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.ScoreMapper;
import org.zerock.testMapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisInsert {
	@Autowired
	TestMapper mapper;
	
	@Autowired
	ScoreMapper scoreMapper;
	
	@Test
	public void insert() {
		try {
			// map을 이용한 설정하기...
			
			// amp넣기
			Map<String, String> map = new HashMap<>();
			map.put("p1", "홍길동2");
			map.put("p2", "98");
			map.put("p3", "87");
			map.put("p4", "96");
			
			boolean result = scoreMapper.insert2(map);
			
			// VO 넣기
//			ScoreVO vo = new ScoreVO();
//			vo.setName("홍순자");
//			vo.setKor("81");
//			vo.setEng("76");
//			vo.setMath("58");
//			
//			boolean result = mapper.insert(vo);
			System.out.println("성공? : "+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
