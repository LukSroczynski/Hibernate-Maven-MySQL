package drawning.objects;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Lukasz S. on 27.05.2017.
 */
public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public void draw() {
        System.out.println(getPointA().getX() + ", " + getPointA().getY());
        System.out.println(getPointB().getX() + ", " + getPointB().getY());
        System.out.println(getPointC().getX() + ", " + getPointC().getY());
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;
    }

    public void setBeanName(String name) {
        System.out.println("Bean name: " + name);
    }

    /**
     * Call when bean is initialized
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("Created bean. Finished initialization");
    }
    /**
     * Called at destroy
     */
    public void destroy() throws Exception {
        System.out.println("At destroy");
    }
}
