package com.example.thishouse.service;

import com.example.thishouse.domain.contract.Contract;
import com.example.thishouse.domain.contract.Lessoer;
import com.example.thishouse.domain.contract.Tenant;
import com.example.thishouse.mapper.ContractMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ContractService {

    private final ContractMapper contractMapper;
    @Transactional
    public void contract_request(Contract contract, int lessoer_num,int tenant_num) {
        contract.setTenant_idx(tenant_num);
        contract.setLessoer_idx(lessoer_num);
        contractMapper.contract_request(contract);
    }

    @Transactional
    public void tenant_info(Tenant tenant) {
        contractMapper.tenant_info(tenant);
    }

    @Transactional
    public void lessoer_info(Lessoer lessoer) {
        contractMapper.lessoer_info(lessoer);
    }


    public int get_lessoer(int houseNum) {
        return contractMapper.get_lessoer(houseNum);
    }


    public int get_tenant(int houseNum) {
        return contractMapper.get_tenant(houseNum);
    }

    public List<Contract> getConList(String id){
        return contractMapper.getContractList(id);
    }

    public String get_tenant_id(String userId) {
        return contractMapper.get_tenant_id(userId);
    }

    public String get_lessoer_id(String userId) {
        return contractMapper.get_lessoer_id(userId);

    }

    public int get_contract_request(String getTenantId) {
        return contractMapper.get_contract_request(getTenantId);
    }

    public int get_contract_accept(String getLessoerId) {
        return contractMapper.get_contract_accept(getLessoerId);
    }
}
