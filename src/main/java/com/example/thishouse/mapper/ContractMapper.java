package com.example.thishouse.mapper;

import com.example.thishouse.domain.Report;
import com.example.thishouse.domain.contract.Contract;
import com.example.thishouse.domain.contract.Lessoer;
import com.example.thishouse.domain.contract.Tenant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContractMapper {
    void contract_request(Contract contract);

    void tenant_info(Tenant tenant);

    void lessoer_info(Lessoer lessoer);

    int get_lessoer(int houseNum);

    int get_tenant(int houseNum);

    List<Contract> getContractList(String id);

    String get_tenant_id(String userId);

    String get_lessoer_id(String userId);

    int get_contract_request(String tenant);

    int get_contract_accept(String lessoer);
}
