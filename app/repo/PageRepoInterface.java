package repo;

import com.google.inject.ImplementedBy;

@ImplementedBy(DbPageRepo.class)
public interface PageRepoInterface {
    public String sayHello();
}
