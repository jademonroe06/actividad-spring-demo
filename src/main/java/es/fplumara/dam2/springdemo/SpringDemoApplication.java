package es.fplumara.dam2.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}

/*
//Si se requiere realmente mantener paquetes fuera, se puede ampliar el subpaquete
necesario de la siguiente manera:

package es.fplumara.dam2.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
  "es.fplumara.dam2.springdemo",
  "es.fplumara.dam2.external"
})
public class SpringDemoApplication { }

Lo correcto realmente es moverlo a un subpaquete correcto
(si no está dentro de "es.fplumara.dam2.springdemo", no lo detecta)
*/