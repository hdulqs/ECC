package com.ecc.dao;

import com.ecc.domain.contract.Contract;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ContractMapper {
    @Insert("insert into t_contract(id,channel,transactionType,transactionId,transactionHash,timestamp,senderSign,receiverSign) values(#{id},#{channel},#{transactionType},#{transactionId},#{transactionHash},#{timestamp},#{senderSign},#{receiverSign})")
    void addContract(Contract contract);

    @Select("select * from t_contract order by timestamp limit #{arg0}")
    List<Contract> getTopContracts(int limit);

    @Select("select count(*) from t_contract")
    int getContractsCount();

    @Delete("delete from t_contract where id = #{arg0}")
    void deleteContractById(String id);
}
