package pereira.brunopbrito31.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pereira.brunopbrito31.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING) // para definir o que a informação passada para o banco sera uma string
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
