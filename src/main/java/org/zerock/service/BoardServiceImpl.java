package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

	private BoardMapper mapper;
	
//	@Autowired
//	public public BoardServiceImpl(BoardMapper mapper) {
//		this.mapper = mapper;
//	}
	
	
	@Override
	public void register(BoardVO board) {
		mapper.insertSelectKey(board);
		
	}

	@Override
	public BoardVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		return mapper.update(board) == 1;

	}

	@Override
	public boolean remove(long bno) {
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

}