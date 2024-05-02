package com.example.cp2java.model;


@Data
@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
public class Brinquedo {

    @Id
    int id_brinquedo;

    @NotBlank
    String nm_brinquedo;

    String tipo_brinquedo;

    String classe_brinquedo;

    @NotBlank
    String preco_brinquedo;

    double tamanho_brinquedo;
}
