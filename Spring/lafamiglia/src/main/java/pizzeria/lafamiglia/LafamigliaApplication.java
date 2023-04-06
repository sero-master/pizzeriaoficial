package pizzeria.lafamiglia;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LafamigliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LafamigliaApplication.class, args);
	}

	@RestController
	@EnableWebMvc
	public class PizzasController {

		@GetMapping("/api/pizzas")
		@CrossOrigin(origins = "http://localhost:3000")
		public ArrayList<Pizza> getPizzas() {
			ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
			Pizza margarita = new Pizza(1, true, 14, "Realmente Exquisita",
					new String[] { "Queso Mozzarella", "Tomate", "Albahaca" }, "www.google.com");
			pizzas.add(margarita);
			return pizzas;
		}

	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/api/**")
					.allowedOrigins("http://127.0.0.1:5500")
					.allowedMethods("GET", "POST", "PUT", "DELETE")
					.allowedHeaders("Authorization", "Content-Type")
					.maxAge(3600);
		}
	}

}
