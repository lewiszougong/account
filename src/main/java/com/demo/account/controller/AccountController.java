package com.demo.account.controller;

import com.demo.account.model.request.GetUserAccountsRequest;
import com.demo.account.model.response.GetUserAccountsResponse;
import com.demo.account.service.GetUserAccountsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
@RequiredArgsConstructor
@Slf4j
public class AccountController {
    private final GetUserAccountsService getUserAccountsService;

    @GetMapping("/{userRefId}")
    @ResponseStatus(HttpStatus.OK)
    public GetUserAccountsResponse retrieveAccounts(
            @PathVariable String userRefId
    ) {
        var getUserAccountsRequest = GetUserAccountsRequest.builder()
                .userRefId(userRefId)
                .build();
        return getUserAccountsService.execute(getUserAccountsRequest);
    }
}
