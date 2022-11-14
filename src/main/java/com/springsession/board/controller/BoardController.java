package com.springsession.board.controller;

import com.springsession.board.entity.Board;
import com.springsession.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board/write") //localhost:8080/board/write
    public String main() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board) {
        boardService.write(board);
        return "";
    }

    @GetMapping("/board/list")
    public String boardList(Model model)
    {
        model.addAttribute("list",boardService.boardList());
        return "boardlist";
    }

    @GetMapping("/board/view")  //localhost:8080/board/view?id=1
    public String boardView(Model model, Integer id) {
        model.addAttribute("board",boardService.boardView(id));
        return "boardview";
    }
}
