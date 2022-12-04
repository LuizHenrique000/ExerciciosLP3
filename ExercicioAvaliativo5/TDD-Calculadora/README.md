## Parte 2 - Pirâmide de Testes Automatizados

#### Explique, com suas palavras, a importância da adoção dos Testes Automatizados dessa categoria:

O foco da entrega contínua é entregar novos lançamentos de código o mais rápido possível para os clientes. 
O teste automatizado é fundamental para esse objetivo. 
Ele garante que todas as funcionalidades implementadas anteriormente continuem funcionando sem algum novo erro

#### Cite exemplos de aplicação desses Testes:

Supondo que temos uma api de cadastro de pessoas e temos como objetivo implementar uma nova funcionalidade como 
validar o cpf das pessoas, o teste automatizado nos garantiria que todas as funcionalidades anteriores 
estariam funcionando, exemplos:

- Poderiamos criar um teste para garantir que as pessoas podem ser salvas na nossa API
- Poderiamos criar um teste para ver se a nossa controller estaria espondendo de forma adequada nossas requisições

#### Quais Tecnologias/Frameworks poderiam ser utilizados em cada Categoria?

- Usariamos Junit para os testes unitários como o da Controller
- Usariamos Mockito para mockar as dependencias do nosso teste de salvar pessoas da API
