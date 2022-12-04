package com.springsession.board.service;

import com.springsession.board.entity.Board;
import com.springsession.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Board> boardList(Pageable pageable) {
        return boardRepository.findAll(pageable);
    }

    //특정 게시물 불러오기
    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    }

    //게시물 검색
    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable) {
        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }


    //특정 게시물 삭제
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
    }


}
