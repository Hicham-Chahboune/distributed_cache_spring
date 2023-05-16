package com.eil.service.impl;

import com.eil.entity.Contract;
import com.eil.repository.ContractRepository;
import com.eil.service.IContractService;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ContractServiceImpl implements IContractService {

    private final ContractRepository contractRepository;

    @Override

    public List<Contract> getAllContract() {
        return contractRepository.findAll();
    }

    @Override
    @Cacheable(value = "contract",key = "#contract.idContrat")
    public String saveContract(Contract contract) {
        return contractRepository.save(contract).getIdContrat();
    }
    @Override
    @Cacheable("contract")
    public Contract getByNumero(String numero) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return contractRepository.findById(numero).get();
    }
}
