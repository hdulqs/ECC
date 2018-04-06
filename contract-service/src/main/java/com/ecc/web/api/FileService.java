package com.ecc.web.api;

import com.ecc.domain.transaction.impl.FileTransaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("file-service")
public interface FileService {
    @RequestMapping(value = "transaction", method = RequestMethod.GET)
    FileTransaction getTransaction(@RequestParam("transactionId") String transactionId,
                                   @RequestParam("transactionType") String transactionType);
}
