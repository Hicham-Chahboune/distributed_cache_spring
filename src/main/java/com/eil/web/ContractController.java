package com.eil.web;

import com.eil.entity.Contract;
import com.eil.service.IContractService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contracts")
@AllArgsConstructor
public class ContractController {

    private IContractService contractService;

    @GetMapping
    public ResponseEntity<List<Contract>> getContracts(){
        return new ResponseEntity<>(contractService.getAllContract(), HttpStatus.OK);
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Contract> getContractByNumero(@PathVariable String numero){
        Contract contract = contractService.getByNumero(numero);
        return new ResponseEntity<>(contract, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> saveContract(@RequestBody Contract contract){
        return new ResponseEntity<>(contractService.saveContract(contract),HttpStatus.CREATED);
    }

}
