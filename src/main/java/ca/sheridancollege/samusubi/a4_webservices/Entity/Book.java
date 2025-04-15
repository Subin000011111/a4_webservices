package ca.sheridancollege.samusubi.a4_webservices.Entity;
import jakarta.persistence.*;
        import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "BOOK")
@Data
@NoArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "QUANTITY")
    private Integer quantity;
}
