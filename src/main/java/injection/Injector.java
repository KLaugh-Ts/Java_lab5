package injection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import annotation.AutoInjectable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see annotation.AutoInjectable
 */

public class Injector<T> {
    private Properties prop;

    /** Constructor */
    public Injector() throws IOException {
        prop = new Properties();
        prop.load(new FileInputStream(new File("src/main/resources/data.properties")));
    }

    /** Main dependency injection method */
    public <T> T inject(T obj) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class dependencyClass;
        Class className = obj.getClass();
        Field[] fields = className.getDeclaredFields();
        for (Field field: fields) {
            Annotation annotation = field.getAnnotation(AutoInjectable.class);
            if (annotation != null) {
                String[] type = ((field.getType()).toString()).split(" ");
                String implementationClassName = prop.getProperty(type[1], null);
                if (implementationClassName != null) {
                    dependencyClass = Class.forName(implementationClassName);
                    field.setAccessible(true);
                    field.set(obj, dependencyClass.newInstance());
                }
            }
        }
        return obj;
    }

}
