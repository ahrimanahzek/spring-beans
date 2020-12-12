package app;

import app.config.*;
import app.model.*;
/*import main.java.app.config.AppConfig;
import app.model.AnimalsCage;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        for (int i = 0; i < 5; i++) {
            AnimalsCage bean = (AnimalsCage) applicationContext.getBean("animalsCage");
            bean.whatAnimalSay();
        }
    }

}
