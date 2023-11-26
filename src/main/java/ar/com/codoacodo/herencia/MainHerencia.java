package ar.com.codoacodo.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		
		//crear un Articulo
		
		Articulo a1 = new Articulo("titulo1", 150.5f,"http://url.com/bla1.jpg");
		
		//llamo al setter
		a1.setAutor("autor a1");
		
		//metodos disponibles
		System.out.println(a1);
		
		//hijo h = new hijo()
		Musica m1 = new Musica("m1", 250.7f, "http://url.com/m1.jgp");
		m1.setAutor("autor m1");//esto es de Articulo
		String[] temas = new String[] {"t1","t2", "t3"};
		m1.setTemas(temas);//esto es de musica
		
		//que tiene disponible m1?
		//todo lo suyo + lo del padre
		System.out.println(m1);

		Articulo p1 = new Pelicula("peli1", 858f, "bla.jgp");
		System.out.println(p1);
		
		Pelicula peli = (Pelicula)p1;//down casting
		peli.setFormato("BLUE RAY 3D");
		peli.setProductora("WARNER");
		p1.setAutor("autor pelicula1");
				
		System.out.println(p1);	
		
		//vector para guardar las instancias
		Articulo[] resultados = new Articulo[3];
		resultados[0]= a1;
		resultados[1]= m1;
		resultados[2]= p1;
		
		for(Articulo aux : resultados) {
			System.out.println(aux);	
		}
	}

}
