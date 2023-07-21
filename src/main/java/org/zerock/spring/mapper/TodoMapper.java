package org.zerock.spring.mapper;

import org.zerock.spring.domain.TodoVO;
import org.zerock.spring.dto.PageRequestDTO;

import java.util.List;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();

    TodoVO selectOne(Long tno);

    void delete(Long tno);

    void update(TodoVO todoVO);

    // TodoMapper 목록 처리
    List<TodoVO> selectList(PageRequestDTO pageRequestDTO);

    // 전체 데이터 수 (페이지 번호 구성)
    int getCount(PageRequestDTO pageRequestDTO);
}
