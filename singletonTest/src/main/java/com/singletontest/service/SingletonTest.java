package com.singletontest.service;

import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class SingletonTest {

	private String namePrivate;

	public String getName(String name) {

		namePrivate = name;

		String nameFinal = Thread.currentThread().getName() + " => " + namePrivate + " => " + new Date();

		System.out.println(nameFinal);

		return nameFinal;
	}

}