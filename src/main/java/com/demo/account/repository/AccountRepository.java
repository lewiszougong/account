package com.demo.account.repository;

import com.demo.account.model.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {

    List<AccountEntity> findByUserRefId(String userRefId);
}
