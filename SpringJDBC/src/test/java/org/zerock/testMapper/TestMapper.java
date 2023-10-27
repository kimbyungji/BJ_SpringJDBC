package org.zerock.testMapper;

import java.util.List;

import org.zerock.board.command.ScoreVO;

public interface TestMapper {
	public List<ScoreVO> select();
	public String getTime();
	public boolean insert(ScoreVO vo);
}
