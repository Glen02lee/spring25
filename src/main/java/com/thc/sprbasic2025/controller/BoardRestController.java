package com.thc.sprbasic2025.controller;

import com.thc.sprbasic2025.domain.Board;
import com.thc.sprbasic2025.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/board")
@RestController
public class BoardRestController {

    final BoardService boardService;
    public BoardRestController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/create")
    public long create(@RequestParam Map<String, Object> param) {
        System.out.println("title : " + param);
        return boardService.create(param);
    }

    @GetMapping("/list")
    public List<Board> list(){

        return boardService.list();
    }
    @GetMapping("/detail")
    public Board detail(@RequestParam Long id) {
        return boardService.detail(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Board> update(@PathVariable Long id, @RequestBody Board update) {
        Board board = boardService.update(id, update);
        return ResponseEntity.ok(board);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Board> delete(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return ResponseEntity.noContent().build();
    }
}
