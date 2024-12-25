package com.project.school_management_and_accounting.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "book", indexes = {
        @Index(name = "book_secure_id", columnList = "uuid")
})
public class Book extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_code", nullable = false, unique = true)
    private String bookCode;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "rack_no")
    private String rackNo;

    @Column(name = "row_no")
    private String rowNo;

    @Column(name = "book_cover")
    @Lob
    private Byte[] bookCover;

    @Column(name = "about", columnDefinition = "TEXT")
    private String about;

    @Column(name = "type")
    private String type;

    @Column(name = "price", nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private SchoolClass schoolClass;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
