package ru.fedorov.ATM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fedorov.ATM.models.CashModel;


@Repository
public interface CashRepository extends JpaRepository<CashModel, Integer> {
}
