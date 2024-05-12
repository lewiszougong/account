package com.demo.account.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class AccountEntity implements Serializable {

    @Id
    @Column(name = "account_ref_id", nullable = false)
    private String accountRefId;
    @Column(name = "user_ref_id", nullable = false)
    private String userRefId;
    @Column(name = "account_no", nullable = false)
    private String accountNo;
    @Column(name = "account_name", nullable = false)
    private String accountName;
    @Column(name = "account_balance", nullable = false)
    private BigDecimal accountBalance;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "created_date", nullable = false)
    private ZonedDateTime createdDate;
}
