package click.henriquegibi.desmotivacional.repository;


import click.henriquegibi.desmotivacional.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}