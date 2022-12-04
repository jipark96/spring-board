package com.springsession.board.repository;

import com.springsession.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> { //<엔티티,기본키 속성>

    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable); //제목을 가지고 게시물 찾음, Containing : 키워드로 찾을 수 있음
}
