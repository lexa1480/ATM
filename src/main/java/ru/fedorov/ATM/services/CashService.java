package ru.fedorov.ATM.services;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fedorov.ATM.repositories.CashRepository;

@Service
@Transactional
public class CashService {

    private final CashRepository cashRepository;

    public CashService(CashRepository cashRepository) {
        this.cashRepository = cashRepository;
    }
}
