package com.demo.account.service;

import com.demo.account.mapper.GetUserAccountsMapper;
import com.demo.account.model.entity.AccountEntity;
import com.demo.account.model.request.GetUserAccountsRequest;
import com.demo.account.model.response.GetUserAccountsResponse;
import com.demo.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetUserAccountsService {

    private final AccountRepository accountRepository;

    public GetUserAccountsResponse execute(GetUserAccountsRequest getUserAccountsRequest) {
        var accountEntityList = accountRepository.findByUserRefId(getUserAccountsRequest.getUserRefId());

        return GetUserAccountsResponse.builder()
                .accounts(accountEntityList.stream()
                        .map(this::buildAccount)
                        .collect(Collectors.toList()))
                .build();
    }

    private GetUserAccountsResponse.Account buildAccount(AccountEntity accountEntity) {
        return GetUserAccountsMapper.INSTANCE.fromAccountEntity(accountEntity);
    }
}
