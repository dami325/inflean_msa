package com.msa.book.domain.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BookDesc {

    private String description; // 설명
    private String author; // 저자
    private String isbn; // 출판번호
    private LocalDate publicationDate; // 발행일
    private Source source; // 도서 출처

    public static BookDesc createBookDesc(String author,
                                          String isbn,
                                          String description,
                                          LocalDate publicationDate,
                                          Source source) {
        return new BookDesc(description, author, isbn, publicationDate, source);
    }

    public static BookDesc sample() {
        return createBookDesc("마틴파울러",
                "12312312",
                "엔터프라이즈 아키텍처 패턴을 잘 설명해주는 도서",
                LocalDate.now(),
                Source.SUPPLY);
    }
}
