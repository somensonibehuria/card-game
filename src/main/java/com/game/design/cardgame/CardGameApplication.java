package com.game.design.cardgame;

import com.game.design.cardgame.entity.Deck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardGameApplication {

	@Bean
	public Deck deck() {
		return new Deck();
	}

	public static void main(String[] args) {
		SpringApplication.run(CardGameApplication.class, args);
	}

}
