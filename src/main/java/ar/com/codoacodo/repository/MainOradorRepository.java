package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {
	
	public static void main(String[] args) {

		 //Interface i = new ClaseQueImplementa();
		 OradorRepository repository = new MysqlOradorRepository();

//		 Orador newOrador = new Orador("carlos", "lopez", "email@email.com", "java", LocalDate.now());
//		 repository.save(newOrador);

		 //Orador newOrador = repository.getById(3L);
		 //System.out.println(newOrador);
		 Orador carlos =repository.getById(3L);
		 
		 carlos.setApellido("perez");
		 carlos.setNombre("martin");
		 carlos.setTema("c#");
		 
		 repository.update(carlos);
		 
		 System.out.println(repository.findAll());
	}
}
