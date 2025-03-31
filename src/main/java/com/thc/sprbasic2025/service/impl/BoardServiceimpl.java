package com.thc.sprbasic2025.service.impl;

import com.thc.sprbasic2025.domain.Board;
import com.thc.sprbasic2025.repository.BoardRepository;
import com.thc.sprbasic2025.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceimpl implements BoardService {

    final BoardRepository boardRepository;
    public BoardServiceimpl(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }
    @Override
    public long create(Map<String, Object> param){
        String title = (String) param.get("title");
        String content = (String) param.get("content");
        String author = (String) param.get("author");

        Board board = new Board();
        board.setTitle(title);
        board.setContent(content);
        board.setAuthor(author);

        boardRepository.save(board);

        return board.getId();
    }

    @Override
    public List<Board> list(){
        List<Board> list = boardRepository.findAll();
        return list;
    }

    @Override
    public Board detail(Long id){
        Board board = boardRepository.findById(id).orElse(null);
        return board;
    }

    @Override
    public Board update(Long id, Board update){
        Board board = boardRepository.findById(id).orElse(null);
        if (board == null){
            return null;
        }
        if (update.getTitle() != null) {
            board.setTitle(update.getTitle());
        }
        if (update.getContent() != null) {
            board.setContent(update.getContent());
        }
        return boardRepository.save(board);
    }
    @Override
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }

}
