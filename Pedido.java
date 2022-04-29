package Programacao_Orientada_a_Objeto.Primeira_Classe.Encapsulamento.Exercicio03;
// Crie uma programa que vai, simplesmente, mostrar os dados de um pedido de vendas no console.
//O conceito de pedido de vendas será abstraído em uma classe que você irá chamar de Pedido. Essa classe terá 4 atributos: código, subtotal, desconto e total.
//No método main do programa você vai criar uma variável que poderá chamar de pedido, do tipo Pedido, e instanciar ela. Coloque os valores de cada atributo,
//da variável pedido, como achar melhor.

public class Pedido {
    Integer codigo;
    Integer subtotal;
    Integer desconto;

    Integer getCodigo() {
        return codigo;
    }

    void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
   Integer getSubtotal(){
       return subtotal;
   }
   void setSubtotal(Integer subtotal){
       this.subtotal = subtotal;
   }
   Integer getDesconto(){
        return desconto;
   }
   void setDesconto(Integer desconto){
        this.desconto = desconto;
   }


















}
