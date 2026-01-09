/*package es.fplumara.dam2.external;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hola desde fuera del paquete base";
  }
}*/

//si arranco la aplicación, esta funciona, pero al ir a "http://localhost:8080/hello",
//me da ERROR 404, porque no escanea el paquete "package es.fplumara.dam2.external",
//así que no crea el bean del controller