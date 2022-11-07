package com.springsession.board.repository;

import com.springsession.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> { //<엔티티,기본키 속성>

}
