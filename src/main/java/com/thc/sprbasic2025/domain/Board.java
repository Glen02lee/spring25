package com.thc.sprbasic2025.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
@Entity
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Boolean deleted;
    String title;
    String content;
    String author;

    Integer countread;

    @PrePersist
    public void onPrePersist() {
        this.deleted = false;
        this.countread = 0;
    }
}
