# Sistema de Mochilas (Java - POO)

Este projeto foi feito para praticar **Programação Orientada a Objetos em Java** durante as aulas.

## Aula 1 – Classes e Objetos

Na primeira aula aprendemos o conceito de **classe e objeto**.

* **Classe** é como um modelo ou molde.
* **Objeto** é algo criado a partir desse modelo.

No projeto criamos a classe **Mochila**, com algumas características como:

* cor
* donoDaMochila
* pesoNaMochila

Um objeto é criado usando `new`, por exemplo:

```java
Mochila mochila1 = new Mochila("Verde", "Enzo");
```

Uma classe define os dados e comportamentos que os objetos terão. ([DIO][1])

---

## Aula 2 – Métodos e Comportamentos

Na segunda aula aprendemos que os objetos também podem ter **ações (métodos)**.

No projeto criamos métodos para a mochila:

* `adicionarPeso()`
* `removerPeso()`

Esses métodos mudam o peso da mochila e mostram mensagens no sistema.

---

## Aula 3 – Encapsulamento

Na terceira aula aprendemos a **proteger os dados da classe** usando encapsulamento.

Para isso:

* Os atributos foram colocados como `private`
* Criamos **getters e setters** para acessar os dados

Exemplo:

```java
private String cor;

public String getCor() {
    return cor;
}
```

Encapsulamento serve para **controlar o acesso aos dados e evitar erros no sistema**. ([Programício][2])

---

## Objetivo

Praticar os conceitos básicos de **POO em Java**:

* Classes
* Objetos
* Métodos
* Construtor
* Encapsulamento
* Getters e Setters

[1]: https://www.dio.me/articles/programacao-orientada-a-objetos-em-java-conceitos-fundamentais-e-boas-praticas?utm_source=chatgpt.com "Programação Orientada a Objetos em Java: Conceitos Fundamentais e Boas Práticas | Marcelo Bento | Java | DIO"
[2]: https://www.programicio.com/java/java-se/programacao-orientada-a-objetos/encapsulamento-modificadores-acesso?utm_source=chatgpt.com "Encapsulamento e Modificadores de Acesso em Java | Programício"
