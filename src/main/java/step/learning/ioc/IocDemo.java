package step.learning.ioc;

import step.learning.ioc.services.hash.HashService;

import javax.inject.Inject;

public class IocDemo {
    @Inject
    private HashService hashService;
    public void run(){
        System.out.println( "Дякую за пару, до побачення" );
        System.out.println(hashService.hash("Дякую за пару, до побачення"));
    }
}
