package ru.fedorov.ATM.services;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Schema(description = "Бизнес логика банкомата")
@Service
@Transactional
public class CashService {
}
