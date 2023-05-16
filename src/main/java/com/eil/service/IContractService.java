package com.eil.service;

import com.eil.entity.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> getAllContract();

    String saveContract(Contract res);

    Contract getByNumero(String numero);
}
