package com.ts.hrms.service;

import com.ts.hrms.bean.Contract;

import java.util.List;

public interface IContractService {
    Contract getContractById(Integer id);

    List<Contract> getContractAndEmp();

    List<Contract> getAllContracts();

    int deleteContractById(Integer id);

    int addContract(Contract contract);

    int updateContract(Contract contract);

    List<Contract> query(String name);
}
