package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.board.command.BoardVO;
import org.zerock.dao.BoardDAO;

//@Component
//@Component("boardService")	// "boardService"는 등록 빈의 id로 사용됨

@Service("boardService")	// 3rd 어노테이션을 이용한 빈등록 --> component-scan
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO boardDAO;
	
	// 3rd(어노테이션)
	
	@Override
	public void register(String name, String title, String content) {
		// boardRegister.jsp로부터 전달받은 값 확인
		System.out.println("----- service 계층 -----");
//		System.out.println(name);
//		System.out.println(title);
//		System.out.println(content);
		
		boardDAO.boardInsert(name, title, content);

	}

	@Override
	public List<BoardVO> getList() {
		return boardDAO.boardSelect();
	}

	@Override
	public void delete(String num) {
		boardDAO.boardDelete(num);

	}

}
