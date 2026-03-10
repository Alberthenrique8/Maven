package br.com.albert.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_sq")
    @SequenceGenerator(name = "cliente_sq" , sequenceName = "sq_cliente", initialValue = 1, allocationSize = 1 )
    private  Long id;

    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "cidade", nullable = false, length = 30)
    private String cidade;

    @Column(name = "telefone", nullable = false, length = 10)
    private String telefone;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
