package me.romeralvarez.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class ClientEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  private Long id;
  @Column(name = "nombre")
  private String name;
  @Column(name = "apellido")

  private String surname;
  @Column(name = "forma_pago")
  private String payMethod;

  public ClientEntity() {
  }

  public ClientEntity(Long id, String name, String surname, String payMethod) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.payMethod = payMethod;
  }

  public ClientEntity(String name, String surname, String payMethod) {
    this.name = name;
    this.surname = surname;
    this.payMethod = payMethod;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPayMethod() {
    return payMethod;
  }

  public void setPayMethod(String payMethod) {
    this.payMethod = payMethod;
  }

  @Override
  public String toString() {
    return
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", payMethod='" + payMethod;
  }
}
