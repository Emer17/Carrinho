import java.util.Scanner;


class Compra{
	private int Id;
	private int distancia;
	private Produto [] carrinho;
	carrinho = new Produto [100];
	
	
	
	public void setId(int valor){
		this.Id = valor;
	}
	
	public int getId(){
		return this.Id;
	}
	
	public double ValorTotal(){
		//return ?;
		
	}
	
	public double PesoTotal(){
		//return ?
		
	}
	
	public void addProduto(Produto p){
		Scanner a = new Scanner(System.in); //id
		Scanner b = new Scanner(System.in); //valor
		Scanner c = new Scanner(System.in); //peso
		Scanner d = new Scanner(System.in); //nome
		Scanner e = new Scanner(System.in); //distancia
		int id,dist;
		double valor,peso;
		String nome = new String;
		System.out.println("Digite o Id para o produto:");
		id = a.ne0xtInt(); //ler int do teclado
		
		System.out.println("Digite o valor para o produto:");
		valor = b.nextDouble();
				
		System.out.println("Digite o peso para o produto:");
		peso = c.nextDouble();
		
		System.out.println("Digite o nome para o produto:");
		nome = d.nextLine();

		System.out.println("Digite a ditancia para entrega:");
		dist = e.nextInt();
				
		p.setId(id);
		
	}
	
	public void removeProduto(Produto p){
		
		
	
}
