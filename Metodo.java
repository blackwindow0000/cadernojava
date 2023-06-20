class Main {
  //aqui cria um método (sem parametro)
  static void imPrime() {
    System.out.println("So imprime isso");
  }
  static void meuMetodo(String nome){
    System.out.println("O nome é:" + nome);
  }

  static void nomeEidade(String nome,int ano) {
    System.out.println(nome + " tem "+ano + " anos ");
  }
  
  //classe principal do java
  public static void main(String[] args){
    //chama metodo imPrime()
    
    imPrime();
    
    //chama metodo meuMetodo()
    meuMetodo(" Gabrielly");
  


    //metodos com dois parametros
    nomeEidade("Gabrielly",  17);
  
  }
  
}
