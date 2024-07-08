Descrição do Projeto: Controle de Usuários, Visitas e Visitantes

Linguagem: Java

Bibliotecas: JPA, H2, Spring Web, ModelMapper, Lombok

Este projeto é um sistema de controle de usuários, visitas e visitantes, desenvolvido com uma arquitetura hexagonal. A arquitetura hexagonal, também conhecida como Arquitetura de Portas e Adaptadores, promove a separação de preocupações, facilitando a manutenção e a escalabilidade do sistema.

Componentes Principais:

Java Persistence API (JPA):
Utilizado para a gestão e persistência de dados. O JPA simplifica o mapeamento entre os objetos Java e os registros do banco de dados.

Banco de Dados H2:
Um banco de dados em memória utilizado para desenvolvimento e testes rápidos, garantindo agilidade no processo de desenvolvimento.

Spring Web:
Fornece suporte para criar aplicações web robustas e escaláveis. Utilizado para desenvolver os endpoints RESTful que expõem os serviços do sistema.

ModelMapper:
Facilita a conversão entre objetos de diferentes camadas, especialmente útil na transformação de entidades JPA em DTOs (Data Transfer Objects) e vice-versa.

Lombok:
Biblioteca que reduz o boilerplate code no Java, gerando automaticamente getters, setters, construtores, e outros métodos comuns, através de anotações.

Funcionalidades do Sistema:

Gestão de Usuários:
Criação, atualização, leitura e exclusão de usuários. Cada usuário possui atributos como nome, email, e informações de contato.

Gestão de Visitas:
Registro e acompanhamento de visitas realizadas. Inclui informações como data e hora e o usuário responsável pela visita.

Gestão de Visitantes:
Controle de visitantes, com registro de detalhes pessoais.

Arquitetura Hexagonal:

Domínio:
Contém a lógica de negócio central e as regras que definem o comportamento do sistema.

Aplicação:
Define os casos de uso e os fluxos de aplicação, coordenando a interação entre o domínio e as interfaces externas.

Portas e Adaptadores:

Portas: Interfaces que definem como o mundo exterior interage com o sistema (ex.: controladores REST).
Adaptadores: Implementações das interfaces que permitem a integração com sistemas externos (ex.: repositórios de dados).
Este projeto visa fornecer uma solução eficiente e escalável para o controle de usuários, visitas e visitantes, utilizando as melhores práticas de desenvolvimento e uma arquitetura bem definida para facilitar futuras expansões e manutenções.






