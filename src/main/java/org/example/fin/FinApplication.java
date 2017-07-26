package org.example.fin;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class FinApplication implements CommandLineRunner{
    @Autowired RepositorioUsuario repoU;

	public static void main(String[] args) {
		SpringApplication.run(FinApplication.class, args);
	}
        
   

   @Override
    public void run(String... strings) throws Exception {
    //tratar de probar el 1
        Direccion d=new Direccion("nada","sanborns",123l);
        Usuario u=new Usuario("juan","jc@gmail.com",d);
        Usuario guardado= repoU.save(u);
        System.out.println("Guardado con rfc" + guardado.getRfc());
    }
  

    
    
}
