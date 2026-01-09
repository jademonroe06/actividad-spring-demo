package es.fplumara.dam2.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.fplumara.dam2.springdemo.domain.AppInfo;

//PUNTO 6 - BEANS POR PERFIL CON @PROFILE
/*
@Configuration
public class AppConfig {

  @Bean
  @Profile("dev")
  public AppInfo devInfo() {
    return new AppInfo("App DEV", "0.1");
  }

  @Bean
  @Profile("prod")
  public AppInfo prodInfo() {
    return new AppInfo("App PROD", "1.0");
  }
}*/

//PUNTO 5 - FORMA MÁS CORRECTA (SOLUCIÓN A)
/*
@Configuration
public class AppConfig {

  @Bean
  @Primary
  public AppInfo mainAppInfo() {
    return new AppInfo("App PRINCIPAL", "1.0");
  }

  @Bean
  public AppInfo secondaryAppInfo() {
    return new AppInfo("App SECUNDARIA", "2.0");
  }
}
*/

/*
//PUNTO 5 - FORMA MENOS CORRECTA PERO VÁLIDA (SOLUCIÓN B)
@Configuration
public class AppConfig {

  @Bean("devInfo")
  public AppInfo devInfo() {
    return new AppInfo("App DEV", "0.1");
  }

  @Bean("prodInfo")
  public AppInfo prodInfo() {
    return new AppInfo("App PROD", "1.0");
  }
}
*/

/*
//PUNTO 5 - FORMA INCORERCTA
@Configuration
public class AppConfig {

  @Bean
  public AppInfo appInfo1() {
    return new AppInfo("App 1", "1.0");
  }

  @Bean
  public AppInfo appInfo2() {
    return new AppInfo("App 2", "2.0");
  }
}
*/

//PUNTO 4
//Este config es el de "por defecto" y vale para todo
//(descomentar cuando se requiera algo menos específico)
@Configuration
public class AppConfig {

  @Bean
  public AppInfo appInfo() {
    return new AppInfo("Actividad de Spring", "1.0.1");
  }
}
