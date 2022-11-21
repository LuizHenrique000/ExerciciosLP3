# Parte 1 - Conceitual

## O que são **Design Patterns?** Por que é interessante utilizá-los?

Os Desing Patterns são padrões de projeto que podem ser utilizados para as 
mais diferentes necessidades no desenvolvimento de software.
 
## Quais são os tipos de **Design Patterns**?

Os autores do livro "Design Patterns: Elements of Reusable Object-Oriented Software" definem 3 tipos de Desing Patterns:
 
 *Criacionais*
 
 *Estruturais*
 
 *Comportamentais*

## Para cada tipo de **Design Pattern** acima, cite 1 Design Pattern.
  ### - Para cada **Design Pattern** citado, explique com suas palavras o motivo de sua utilização em um projeto de Software.

*Criacional*

Vou usar de exemplo o Builder, em Java costuma ser muito 
complexo instanciar um objeto sem ter que recorrer a sua classe e visualizar os seus atributos,
o builder acaba com esse problema, pois podemos visualizar cada dado na sua criação, o que facilita a sua leitura.

*Estrutural*

Vou usar de exemplo o Facade, estamos habituados a sempre inicializar diversos objetos, rastrear as dependências, 
executar métodos na ordem correta, e assim por diante, o Facade é uma classe que fornece uma interface simples para se usar além de fornecer funcionalidades limitadas em comparação com
trabalhar com o programa diretamente. Contudo, ela inclui apenas aquelas funcionalidades que o cliente se importa.

*Comportamental*

Vou usar de exemplo o Strategy, imagine que você possui um programa de estacionamento com diversos tipos
de veiculos, e cada um possui uma tarifa por determinado tempo, podemos usar o padrão Strategy para definir uma interface ValorTarifaStrategy
e cada veiculo específico ter uma implementação da interface, como um CarroTarifaStrategy ou CaminhãoTarifaStrategy, na qual cada metodo vai dizer 
respeito apenas a si mesmo e não interferindo nas outras tarifas.
