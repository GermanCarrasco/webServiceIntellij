package com.example.consumeWS.demo;

import com.example.consumeWS.demo.cliente.CarrosCliente;
import com.example.consumeWS.demo.wsdl.GetMarcaResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner lookUp(CarrosCliente cliente) {
		return args -> {
			String c = "Lexus";

			if(args.length>0){
				c = args[0];
			}

			GetMarcaResponse response = cliente.getMarcaC(c);
			System.out.println(response.getMarca().get(0).getMarca());
		};
	}

}
