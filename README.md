# biblioteca-u1
Sistema de Biblioteca

Identificação

Projeto: Sistema de Biblioteca
Disciplina: Back-End
Unidade: 1
Turma: ADS 3P
Professor: Victor Brayner

Integrantes

* Bruna Francisca da Silva
* Kamyla Vitória Chagas de Andrade
* Luísa Geórgia Bezerra Alves
* Maria Gabriella Silva de Lima
* Mayara Eduarda Dias Vieira
* Tarcilla Maria de Araújo Almeida
* Thais Vitória da Silva Nascimento

⸻

Sobre o projeto

O Sistema de Biblioteca é uma aplicação Back-End desenvolvida em Java 21 com Spring Boot, com o objetivo de auxiliar no gerenciamento de livros, leitores e empréstimos de uma biblioteca.

O sistema permite realizar operações de cadastro e consulta de livros e leitores, além do controle de empréstimos e devoluções.

O projeto foi desenvolvido como atividade de avaliação da Unidade 1, aplicando conceitos de Programação Orientada a Objetos, organização em camadas, Repository, Service, Controller, injeção de dependências e testes automatizados com JUnit.

A persistência dos dados é realizada em memória, utilizando estruturas como List e ArrayList.

⸻

Problema

Uma biblioteca precisa manter o controle dos seus livros, leitores e empréstimos. O sistema foi desenvolvido para facilitar esse gerenciamento, permitindo acompanhar quais livros estão disponíveis, quais estão emprestados e quais empréstimos estão associados aos leitores.

⸻

Funcionalidades

Livros

* Cadastrar livro
* Listar livros
* Listar livros disponíveis

Leitores

* Cadastrar leitor
* Consultar pendências de um leitor

Empréstimos

* Realizar empréstimo de livro
* Registrar devolução
* Listar empréstimos

⸻

Regras de negócio

1. O livro precisa estar cadastrado para que possa ser emprestado.
2. O leitor precisa estar cadastrado para realizar um empréstimo.
3. Um livro que já esteja emprestado não pode ser emprestado novamente.
4. O empréstimo deve estar associado a um livro e a um leitor válidos.
5. Não é possível registrar a devolução de um empréstimo inexistente.

As regras de negócio são verificadas na camada Service e testadas por meio de testes automatizados.

⸻

Arquitetura

O projeto utiliza uma arquitetura dividida em camadas:

Controller
    |
    v
 Service
    |
    v
Repository

Model

Representa as entidades utilizadas pelo sistema.

Principais entidades:

* Livro
* Leitor
* Emprestimo

Controller

Responsável por receber as solicitações e realizar a comunicação com a aplicação.

Principais Controllers:

* LivroController
* LeitorController
* EmprestimoController

Service

Responsável pela implementação das regras de negócio da aplicação.

Principais Services:

* LivroService
* LeitorService
* EmprestimoService

Repository

Responsável pelo armazenamento e recuperação dos dados.

A aplicação utiliza persistência em memória por meio de List e ArrayList.

Principais Repositories:

* LivroRepository
* LeitorRepository
* EmprestimoRepository

⸻

Injeção de dependências

O projeto utiliza a injeção de dependências disponibilizada pelo Spring.

Os Services recebem os Repositories por meio do construtor, evitando a criação manual das dependências.

Exemplo:

@Service
public class LivroService {
    private final LivroRepository repository;
    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }
}

⸻

Tecnologias utilizadas

* Java 21
* Maven
* Spring Boot
* JUnit
* Git
* GitHub

⸻

Estrutura do projeto

src/
├── main/
│   └── java/
│       └── com/
│           └── exemplo/
│               └── projeto/
│                   ├── controller/
│                   │   ├── LivroController.java
│                   │   ├── LeitorController.java
│                   │   └── EmprestimoController.java
│                   │
│                   ├── model/
│                   │   ├── Livro.java
│                   │   ├── Leitor.java
│                   │   └── Emprestimo.java
│                   │
│                   ├── repository/
│                   │   ├── LivroRepository.java
│                   │   ├── LeitorRepository.java
│                   │   └── EmprestimoRepository.java
│                   │
│                   ├── service/
│                   │   ├── LivroService.java
│                   │   ├── LeitorService.java
│                   │   └── EmprestimoService.java
│                   │
│                   └── Main.java
│
├── test/
│   └── java/
│       └── com/
│           └── exemplo/
│               └── projeto/
│                   └── service/
│                       ├── LivroServiceTest.java
│                       ├── LeitorServiceTest.java
│                       └── EmprestimoServiceTest.java
│
├── pom.xml
└── README.md

A estrutura deve ser ajustada caso os nomes dos pacotes ou arquivos sejam diferentes no projeto final.

⸻

Como executar

1. Clonar o repositório

git clone URL_DO_REPOSITORIO

2. Entrar na pasta do projeto

cd nome-do-projeto

3. Executar a aplicação

mvn spring-boot:run

Também é possível executar o projeto diretamente pela IDE utilizando a classe principal da aplicação.

⸻

Como executar os testes

Para executar os testes automatizados:

mvn test

Os testes verificam comportamentos da aplicação, regras de negócio e situações inválidas.

⸻

Testes automatizados

O projeto utiliza JUnit para realização dos testes.

Entre os cenários testados estão:

* Cadastro de livro.
* Cadastro de leitor.
* Realização de empréstimo.
* Tentativa de empréstimo de livro indisponível.
* Tentativa de empréstimo para leitor inexistente.
* Devolução de empréstimo.

Os testes têm como objetivo verificar se as funcionalidades e regras de negócio estão funcionando corretamente.

⸻

Git e GitHub

O desenvolvimento do projeto utiliza Git para controle de versão e GitHub para armazenamento do código.

Foram utilizadas branches para organizar as etapas de desenvolvimento.

Exemplo:

main
|
├── feature/modelos
├── feature/repositories
├── feature/services
├── feature/controllers
└── feature/testes

Exemplos de commits:

feat: cria entidades do sistema
feat: implementa repositories
feat: implementa regras de empréstimo
feat: cria controllers
test: adiciona testes do sistema
docs: atualiza README

O histórico de commits deve representar as etapas reais do desenvolvimento do projeto.

⸻

Histórico do desenvolvimento

O desenvolvimento do projeto foi dividido nas seguintes etapas:

1. Definição do problema e das entidades.
2. Criação dos Models.
3. Implementação dos Repositories.
4. Implementação dos Services.
5. Implementação das regras de negócio.
6. Implementação dos Controllers.
7. Configuração do Spring Boot e Maven.
8. Criação dos testes automatizados.
9. Organização do repositório.
10. Documentação do projeto.

⸻

Participação dos integrantes

Integrante	Contribuições
Bruna Francisca da Silva	A definir
Kamyla Vitória Chagas de Andrade	A definir
Luísa Geórgia Bezerra Alves	A definir
Maria Gabriella Silva de Lima	A definir
Mayara Eduarda Dias Vieira	A definir
Tarcilla Maria de Araújo Almeida	A definir
Thais Vitória da Silva Nascimento	A definir

As contribuições devem ser preenchidas de acordo com as atividades realmente realizadas por cada integrante e com o histórico de commits do GitHub.

⸻

Uso de Inteligência Artificial

Durante o desenvolvimento do projeto, ferramentas de Inteligência Artificial podem ser utilizadas como apoio para compreensão dos conteúdos, identificação de erros, organização do código e documentação.

Ferramenta utilizada

ChatGPT

Finalidade

A ferramenta foi utilizada como apoio para:

* esclarecer dúvidas sobre Java;
* compreender conceitos de Spring Boot;
* auxiliar na identificação de erros;
* auxiliar na organização do projeto;
* auxiliar na criação e compreensão de testes;
* auxiliar na documentação.

Todo código utilizado deve ser analisado, compreendido e adaptado pelos integrantes do grupo.

⸻

Apresentação

Durante a apresentação do projeto serão demonstrados:

* O problema que o sistema busca resolver.
* A solução desenvolvida.
* As principais funcionalidades.
* A arquitetura utilizada.
* As regras de negócio.
* A execução da aplicação.
* Os testes automatizados.
* O repositório no GitHub.
* O histórico de desenvolvimento.

⸻

Observações

O projeto foi desenvolvido com foco nos conteúdos da Unidade 1, utilizando:

* Programação Orientada a Objetos;
* Classes e objetos;
* Encapsulamento;
* Interfaces;
* Collections;
* Packages;
* Repository;
* Service;
* Controller;
* Injeção de dependências;
* Maven;
* Spring Boot;
* JUnit;
* Git e GitHub.

A persistência dos dados é realizada em memória, não sendo necessário utilizar banco de dados para este projeto.

⸻

Projeto de Avaliação — Unidade 1

Disciplina: Back-End
Turma: ADS 3P
Professor: Victor Brayner
Tecnologias: Java 21, Maven, Spring Boot e JUnit
