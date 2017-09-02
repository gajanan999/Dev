package com.billdiary.config;

import java.io.IOException;
import java.io.InputStream;
import javafx.util.Callback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javafx.fxml.FXMLLoader;

public class SpringFxmlLoader {

	private static final ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	public Object load(String url) {

		try (InputStream fxmlStream = SpringFxmlLoader.class.getResourceAsStream(url)) {
			System.err.println(SpringFxmlLoader.class.getResourceAsStream(url));
			FXMLLoader loader = new FXMLLoader();
			loader.setControllerFactory(new Callback<Class<?>, Object>() {
				@Override
				public Object call(Class<?> clazz) {
					return applicationContext.getBean(clazz);
				}
			});
			return loader.load(fxmlStream);
		} catch (IOException ioException) {
			throw new RuntimeException(ioException);
		}
	}

}
