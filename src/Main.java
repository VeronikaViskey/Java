import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
        public static void main(String[] args) throws Exception {
            Class c = JustClass.class;
            Object testObj = c.newInstance();
            Method[] methods = c.getDeclaredMethods();
            ArrayList<Method> al = new ArrayList<>();
            Method before = null;
            Method after = null;
            for (Method o : c.getDeclaredMethods()) {
                if (o.isAnnotationPresent(Test.class)) {
                    al.add(o);
                }
                if (o.isAnnotationPresent(BeforeSuite.class)) {
                    if (before == null) before = o;
                    else throw new RuntimeException("more than one BeforeSuite");
                }
                if (o.isAnnotationPresent(AfterSuite.class)) {
                    if (after == null) after = o;
                    else throw new RuntimeException("more than one AfterSuite");
                }
                al.sort(new Comparator<Method>() {
                    @Override
                    public int compare(Method o1, Method o2) {
                        return o2.getAnnotation(Test.class).priority() - o1.getAnnotation(Test.class).priority();
                    }
                });
            }

            if (before != null) {
                before.invoke(testObj, null);
            }
            for (Method o : al) {
                o.invoke(testObj, null);
            }
            if (after != null) {
                after.invoke(testObj, null);
            }
        }
    }
