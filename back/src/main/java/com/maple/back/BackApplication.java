package com.maple.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maple.back.entity.Monster;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@SpringBootApplication
public class BackApplication implements CommandLineRunner {
	
	@Autowired
	EntityManagerFactory emf;

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}
	
	@Override
	public void run(String ...args) throws Exception {
		EntityManager em = emf.createEntityManager();
		Monster monster1 = em.find(Monster.class,2);
		// System.out.println("monster1 = " + monster1);
	}
}
