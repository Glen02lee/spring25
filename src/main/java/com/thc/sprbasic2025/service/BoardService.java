package com.thc.sprbasic2025.service;

import com.thc.sprbasic2025.domain.Board;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BoardService {
    long create(Map<String, Object> param);
    List<Board> list();
    Board detail(Long id);

    Board update(Long id, Board update);

    void deleteBoard(Long id);
}
