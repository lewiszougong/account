package com.demo.account.mapper;


import com.demo.account.model.entity.AccountEntity;
import com.demo.account.model.response.GetUserAccountsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class GetUserAccountsMapper {

    public static final GetUserAccountsMapper INSTANCE = Mappers.getMapper(GetUserAccountsMapper.class);

    public abstract GetUserAccountsResponse.Account fromAccountEntity(AccountEntity accountEntity);

}
