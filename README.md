# 📚 Student-Course API

Este projeto é uma API RESTful simples desenvolvida com **Spring Boot** e **JPA**, que gerencia estudantes e cursos com relacionamento muitos-para-muitos.

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (memória)
- Maven
- Jakarta Persistence (JPA)
- Postman ou Insomnia (para testes)

---

## 🎯 Funcionalidades

- Cadastro de estudantes
- Associação entre estudantes e cursos
- Consulta de estudantes com seus cursos
- Enum para definir o nível do curso (`BEGINNER`, `INTERMEDIATE`, `ADVANCED`)

---

## 🔗 Relacionamento entre Entidades

- **Student** ⇄ **Course** → muitos-para-muitos (`@ManyToMany`)
- Utiliza tabela intermediária `tb_students_courses`

---

## 🧪 Exemplo de JSON (POST)

### Criar um estudante
```json
{
  "name": "Carlos Andrade",
  "email": "carlos.andrade@example.com",
  "birthDate": "2000-08-12",
  "courses": [
            {
                "id": 1,
                "name": "Matemática",
                "credits": 60,
                "courseLevel": "BEGINNER"
            }
        ]
}
```

## 🧑‍💻 Autor

Desenvolvido por Nahtanm Carvalho Santos

---
