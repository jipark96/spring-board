package com.springsession.board.service;

import com.springsession.board.entity.Board;
import com.springsession.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired // 알아서 읽어오게함
    private BoardRepository boardRepository;

//    @Autowired
//    public  BoardService(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }

    public void write(Board board) {

        boardRepository.save(board);
    }
}
