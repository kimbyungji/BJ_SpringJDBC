package org.zerock.service;

import java.util.List;

import org.zerock.board.command.ScoreVO;

public interface ScoreService {
	public void scoreRegist(ScoreVO vo);	// 점수 등록
	public List<ScoreVO> scoreResult();	// 점수 결과
	public void scoreDelete(String num);	// 점수 삭제
}
