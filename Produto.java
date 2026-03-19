public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco){

        this.nome= nome;
        this.preco= preco;
    }

    public Produto(String nome){

        this.nome= nome;
        this.preco= 8.0;
    }

    public void exibirDetalhes(){
        //sout
        System.out.println("Nome Produto: " + nome + " "+ "Preco: " + preco);
        
    }
     //psvm
    public static void main(String[] args) {
        Produto p1= new Produto("caderno", 10.0);
        Produto p2= new Produto("Thalyta");
        p1.exibirDetalhes();
        p2.exibirDetalhes();
        

    }
}
