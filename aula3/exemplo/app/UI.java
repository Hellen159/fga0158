package app;

import figurasGeometricas.Triangulo;
import javax.swing.JOptionPane;
import figurasGeometricas.quadrado;
import figurasGeometricas.Circulo;

public class UI {
	static quadrado[] quadrados = new quadrado[0];  
	static Triangulo[] Triangulos= new Triangulo[0];
	static Circulo[] Circulos= new Circulo[0];
	
	
	public static void main(String[] args) {
		
		
		int opcao;
		do { 
			
			String strOpcao = JOptionPane.showInputDialog("Escolha uma op��o de figura geom�trica: \n"
					+ "1 - Quadrado\n"
					+ "2 - Retangulo\n"
					+ "3 - Circulo\n"
					+ "0 - Sair do programa");
			opcao = Integer.parseInt(strOpcao);

			switch (opcao) {
			case 1:
				
				String strLadoQuadrado = JOptionPane.showInputDialog("Informe o lado do quadrado:");
				float ladoQuadrado = Float.parseFloat(strLadoQuadrado);
				quadrado q = new quadrado(ladoQuadrado);
				
				 
				quadrado[] temp = new quadrado[quadrados.length + 1];
				for (int i=0; i<quadrados.length; i++) {
					temp[i] = quadrados[i];  //copiando todas referencias de quadrados em temp
				}
				
				temp[quadrados.length] = q;
				
				quadrados = temp;

				break;

			case 2: 
				String strLadoTriangulo =JOptionPane.showInputDialog("Informe o lado do triangulo:");
				String strAlturaTriangulo = JOptionPane.showInputDialog("Informe a altura do triangulo:");
				float alturaTriangulo= Float.parseFloat(strAlturaTriangulo);
				float ladoTriangulo = Float.parseFloat(strLadoTriangulo);
				Triangulo t = new Triangulo(ladoTriangulo,alturaTriangulo); 
				
				Triangulo[]temp1= new Triangulo[Triangulos.length+1];
				for(int i=0;i<Triangulos.length;i++) {
					temp1[i]=Triangulos[i];
				}
				temp1[Triangulos.length]= t;
				Triangulos= temp1;
				break;

			case 3: 
				String strRaioCirculo =JOptionPane.showInputDialog("Informe o raio do circulo:");
				float raioCirculo=Float.parseFloat(strRaioCirculo);
				Circulo c= new Circulo (raioCirculo);
				
				Circulo[]temp2=new Circulo[Circulos.length+1];
				for(int i=0;i<Circulos.length;i++) {
					temp2[i]=Circulos[i];
				}
				temp2[Circulos.length]=c;
				Circulos= temp2;
			
				break;

			}
		}while(opcao!=0);
		
		for (int i=0; i<quadrados.length; i++) {
			String resposta = "Quadrado " + i + "(" + quadrados[i] + ")" + ":\n"
					+ "Lado: " + quadrados[i].getLado() + "\n"
					+ "Area: " + quadrados[i].calcularArea() + "\n"
					+ "Perimetro: " + quadrados[i].calcularPerimetro();

			JOptionPane.showMessageDialog(null, resposta);
		}
		
		for(int i=0;i<Triangulos.length;i++) {
			String resposta1="Triangulo"+i+"("+Triangulos[i]+")"+":\n"
					+"Lado:"+Triangulos[i].getLado()+"\n"
					+"Altura:"+Triangulos[i].getAltura()+"\n"
					+"Perimetro:"+Triangulos[i].calcularPerimetro()+"\n"
					+"Area:"+Triangulos[i].calcularArea()+"\n";
			JOptionPane.showMessageDialog(null, resposta1);
					
		}
		for(int i=0;i<Circulos.length;i++) {
			String resposta2="Circulo"+i+"("+Circulos[i]+")"+":\n"
					+"Raio:"+Circulos[i].getRaio()+"\n"
					+"Perimetro:"+Circulos[i].calcularPerimetro()+"\n"
					+"Area:"+Circulos[i].calcularArea()+"\n";
			JOptionPane.showMessageDialog(null, resposta2);
					
		
		}
		}
}

		
