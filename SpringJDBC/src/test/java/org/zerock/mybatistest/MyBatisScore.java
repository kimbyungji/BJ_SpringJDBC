package org.zerock.mybatistest;

import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.board.command.ScoreVO;
import org.zerock.mapper.ScoreMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisScore {
	// mapper 설정
	// 1) 테스트 메서드는 mapper인터페이스를 출력하는 메서드 구현
	// root-context -> mapper 관련 설정을 추가해야 함
	
	@Autowired
	ScoreMapper scoreMapper;
	
//	@Test
//	public void test1() {
//		System.out.println(">>>>>>>>ScoreMapper : "+scoreMapper);
//	}
	
	@Test
	public void insert() {
		for(int i=1;i<=5;i++) {
			ScoreVO vo = new ScoreVO();
			vo.setName("test");
			vo.setKor("80");
			vo.setEng("80");
			vo.setMath("80");
			scoreMapper.insert(vo);
		}
	}
	
	@Test
	public void select(){
//		List<ScoreVO> list = new ArrayList<>();
//			list.addAll(list);
//		for(ScoreVO vo : list) {
//			System.out.println(vo);
//		}
		List<ScoreVO> list = scoreMapper.select();
		for(ScoreVO vo : list) System.out.println(vo);
	}
	
	@Test
	public void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 게시글 번호 : ");
		String num = scan.next();
		scoreMapper.delete(num);
		
		System.out.println("결과 확인");
		List<ScoreVO> list2 = scoreMapper.select();
		for(ScoreVO vo : list2) System.out.println(vo);	
		scan.close();
	}	
	
}
