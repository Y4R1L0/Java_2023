package step.learning;


import com.google.inject.Guice;
import com.google.inject.Injector;
import step.learning.Files.WorkingFiles;
import step.learning.ioc.ConfigModule;
import step.learning.ioc.IocDemo;
import step.learning.oop.OopDemo;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //new BasicsDemo().run();
        //new DirDemo(directory).run();
        new WorkingFiles(".").Run();
        //new OopDemo().run();
        //Injector injector= Guice.createInjector(new ConfigModule());
        //IocDemo iocDemo = injector.getInstance(IocDemo.class);// instead new IocDemo();
        //iocDemo.run();
    }
}
