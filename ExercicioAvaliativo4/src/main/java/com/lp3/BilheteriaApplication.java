package com.lp3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.lp3.enums.TipoIngresso;
import com.lp3.model.Evento;
import com.lp3.model.Ingresso;
import com.lp3.model.Usuario;
import com.lp3.service.BilheteService;

@SpringBootApplication
public class BilheteriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilheteriaApplication.class, args);
		
	Evento evento = new Evento("Pink floyd",LocalDateTime.of(2023, 2, 17, 22, 10),5, null);
		 
	Usuario estudante = Usuario.builder()     
				 .nome("Luiz")     
				 .nascimento(LocalDate.of(2004, 11, 30))
				 .isEstudante(true)
				 .documento("123-456-789-01")
				 .login("lu04")
				 .senha("1234")
				 .build();
	
	Usuario idoso = Usuario.builder()     
			 .nome("Henrique")     
			 .nascimento(LocalDate.of(1960, 11, 30))
			 .isEstudante(false)
			 .documento("123-456-789-01")
			 .login("lu60")
			 .senha("5678")
			 .build();
		 
	Ingresso pista = Ingresso.builder()
				 .id(1)
				 .evento(evento)  
				 .tipoIngresso(TipoIngresso.PISTA) 
				 .valor(new BigDecimal(250))
				 .build(); 
		 
	Ingresso pistaPremium = Ingresso.builder() 
				 .id(2) 
				 .evento(evento)
				 .tipoIngresso(TipoIngresso.PISTA_PREMIUM)
				 .valor(new BigDecimal(400))
				 .build(); 
		 
	Ingresso camarote = Ingresso.builder()  
				 .id(3)  
				 .evento(evento)  
				 .tipoIngresso(TipoIngresso.CAMAROTE)
				 .valor(new BigDecimal(750))
				 .build();
	
	Ingresso cadeiraInferior = Ingresso.builder()  
			 .id(4)  
			 .evento(evento)  
			 .tipoIngresso(TipoIngresso.CADEIRA_INFERIOR)
			 .valor(new BigDecimal(200))
			 .build();
	
	Ingresso cadeiraSuperior = Ingresso.builder()  
			 .id(5)  
			 .evento(evento)  
			 .tipoIngresso(TipoIngresso.CADEIRA_SUPERIOR)
			 .valor(new BigDecimal(150))
			 .build();

//	List<Ingresso> ingressos = new ArrayList<Ingresso>();
//	ingressos.add(pista);
//	ingressos.add(pistaPremium);
//	ingressos.add(camarote);
//	ingressos.add(cadeiraInferior);
//	ingressos.add(cadeiraSuperior);
//	
//	evento.setIngressos(ingressos);
	
//Tentei adicionar os ingressos no evento mas dava esse erro:
//Exception in thread "main" java.lang.StackOverflowError
//Queria adicionar uma validacao caso acabasse os ingressos mas não consegui
	
	
	BilheteService service = new BilheteService();
	service.comprarIngresso(idoso, cadeiraInferior);
		
	}

}
