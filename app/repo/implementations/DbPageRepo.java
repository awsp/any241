package repo.implementations;

import repo.interfaces.PageRepo;

public class DbPageRepo implements PageRepo {
    @Override
    public String sayHello() {
        return "Hey, what's up";
    }
}