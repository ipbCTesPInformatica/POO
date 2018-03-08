class Filme {
    //propriedade(atributos)
    int codigo;
    String nome;
    double valor;
    boolean disponivel;

    //metodos

}

class programa {
    public static void main(String[] args){
        Filme filme = new Filme();

        //imprime a referência(endereço) de memória
        //System.out.println(filme);
        // atribuir valores às propriedades do objeto "filme"
        filme.codigo = 1;
        filme.nome = "A formula da Água";
        filme.valor = 2.50;
        System.out.println("Código: "+filme.codigo);
        System.out.println("Nome: "+filme.nome);
        System.out.println("valor: "+filme.valor);

    }
}



/* Ver!!!
        Filme filme2 = filme;
        filme2.codigo = 999;
        filme2.nome = "the post";
        filme2.valor = 2.50;
        */