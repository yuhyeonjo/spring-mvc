package org.zerock.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageRequestDTO {

    @Builder.Default
    @Positive
    @Min(value = 1)
    private int page = 1;

    @Builder.Default
    @Positive
    @Min(value = 10)
    @Max(value = 100)
    private int size = 10;

    private String link;

    // 검색 종류 ( 제목 t, 작성자 w)
    private String[] types;

    // 검색 종류에 따라 키워드 이용
    private String keyword;

    private boolean finished;

    private LocalDate from;

    private LocalDate to;

    public int getSkip() {
        return (page - 1) * 10;
    }

    // 조회 페이지 기능 구현
    public String getLink() {
        if(link == null)  {
            StringBuilder builder = new StringBuilder();
            builder.append("page=" + this.page);
            builder.append("&size=" + this.size);
            link = builder.toString();
        }
        return link;
    }
}
