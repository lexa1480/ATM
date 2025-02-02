package ru.fedorov.ATM.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fedorov.ATM.dto.CashDTO;
import ru.fedorov.ATM.services.CashService;

@Schema(description = "Контроллер банкомата")
@RestController
@RequestMapping("/ATM")
public class ATMController {

    private final CashService cashService;


    @Autowired
    public ATMController(CashService cashService) {
        this.cashService = cashService;
    }

    @Operation(summary = "Покажет сумму денег")
    @GetMapping("/cash")
    public CashDTO getCash()
    {
        CashDTO cashDTO = new CashDTO();

        return cashDTO;
    }
}
