package rafal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Matrix matrix = context.getBean(Matrix.class);
        System.out.println(matrix.getQuarterList().get(0).getItemsList().get(0).toString());
    }
}
