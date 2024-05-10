package com.game.design.cardgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardGameApplication {

//	@Bean
//	public Deck deck() {
//		return new Deck();
//	}
	/*
	Description:

	Field deck in com.game.design.cardgame.controller.CardController required a bean of type 'com.game.design.cardgame.entity.Deck' that could not be found.

	The injection point has the following annotations:
		- @org.springframework.beans.factory.annotation.Autowired(required=true)


	Action:

	Consider defining a bean of type 'com.game.design.cardgame.entity.Deck' in your configuration.

	 */

	public static void main(String[] args) {
		SpringApplication.run(CardGameApplication.class, args);
	}

}
