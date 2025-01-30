package ru.fedorov.ATM.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fedorov.ATM.dto.Cash;

@RestController
@RequestMapping("/ATM")
public class ATMController {

        @GetMapping("/cash")
        public Cash getCash()
        {
            Cash cash = new Cash();

            return cash;
        }
}
