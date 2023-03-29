# Java Week

## Day 1
Sobre o mercado de trabalho e o porquê estudar Java.

## Day 2
**Abstração**
 
É o conceito de ocultar a complexidade de determinada funcionalidade e expor somente o que é de fato importante para o funcionamento. Não necessariamente precisamos saber como o motor de um carro funciona para ligar e utilizá-lo.

No Java podemos usar as Interfaces e Classes Abstratas para representar a abstração. A Interface é basicamente um contrato que faz com que toda classe que implementá-la, obrigatóriamente, implemente os seus métodos. Esses métodos não têm corpo, ou seja, cabe à classe que implementa a interface, descrever o seu comportamento. Já as classes abstratas são como classes normais, com seus métodos e atributos, mas elas não podem ser instaciadas. Outro ponto importante é que eu posso implementar mais de uma interface em uma mesma classe, mas não posso extender mais de uma classe, abstrata ou não.

**Encapsulamento**

Limitamos o acesso a determinadas informações das classes. Para isso usamos os modificadores de acesso (public, private, protected). Esses modificadores podem ser usados tanto para atributos quanto para métodos.

Public, podemos acessar de qualquer classe do programa. Private, só é acessível na classe onde foi declarado. Protected, pode ser acessado na classe em que foi declarado, subclasses (que herdam da superclasse) e outras classes do mesmo pacote. É comum criarmos getters e setter para acessarmos e definirmos os atributos com modificador private.

**Herança**

Uma classe (subclasse) herda os atributos e métodos de outra (superclasse). Nesse caso, os métodos podem ter corpo (implementação), diferente das interfaces, onde são só as assinaturas.

> Construtor: atráves de um construtor podemos atribuir valores e realizar implementações no momento que instanciamos o objeto.

**Polimorfismo**

Uma mesma coisa tem várias formas. Um mesmo método pode ser aplicado de formas diferentes. Temos o polimorfismo de sobrecarga, onde existem vários métodos de mesmo nome e podemos ter variações na quantidade de parâmetros e/ou retorno. Na hora de chamarmos o método, dependendo da quantidade de parâmetros que passarmos, o programa irá entender qual implementação fazer. O polimorfismo de sobrescrita é quando a assinatura do método (retorno e parâmetros) se mantem, mas a implementação é alterada. Esse segundo polimorfismo ocorre nos casos de herança, onde mudaremos a implementação de um método na subclasse.