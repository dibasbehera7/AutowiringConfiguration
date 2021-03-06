package com.dibas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dibas.food.Fruit;
import com.dibas.food.Meal;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		Meal myMealByAnnotation = (Meal) appContext.getBean("mealByAnnotation");
		System.out.println("MealByAnnotation : " + myMealByAnnotation.whatsInTodaysMeal());

		/*
		 * Fruit myfruit = (Fruit) appContext.getBean("fruit");
		 * System.out.println(myfruit.talkAboutYou());
		 */

		((FileSystemXmlApplicationContext) appContext).close();

	}

}
