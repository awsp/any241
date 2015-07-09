package repo.interfaces;

import com.google.inject.ImplementedBy;
import repo.implementations.DbPageRepo;

@ImplementedBy(DbPageRepo.class)
public interface PageRepo {
    public String sayHello();
}
