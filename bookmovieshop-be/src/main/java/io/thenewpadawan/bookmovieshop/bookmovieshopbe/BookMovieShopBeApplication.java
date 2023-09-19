package io.thenewpadawan.bookmovieshop.bookmovieshopbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMovieShopBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMovieShopBeApplication.class, args);
		/*
		 * Come funziona Spring:
		 * 1) Per ogni Class con un'annotation @Component ne crea un'istanza e se la tiene pronta
		 *         NDR: @RestController extends @Controller mentre @Controller extends @Component, anche le estensioni dell'Annotation @Component sono @Component!
		 * 2) Ogni @Autowired viene riempito con un'istanza fra quelle create prima
		 * 3) I @Qualifier permette di avere più implementazioni della stessa interfaccia/abstract class e di switcharle a piacere
		 * 4) Le istanza create nella fase 1 sono Singleton e quindi un'istanza per ogni classe con @Component
		 */
	}

}
