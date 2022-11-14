package com.springsession.board.service;

import com.springsession.board.entity.Board;
import com.springsession.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public  BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //글 작성
    public void write(Board board) {

        boardRepository.save(board);
    }

    //게시물 리스트 처리
    public List<Board> boardList() {
        return boardRepository.findAll();
    }

    //특정 게시물 불러오기
    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    }
}
