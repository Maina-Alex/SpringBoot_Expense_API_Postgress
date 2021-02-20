package com.avania.expensetrackerapi.Services;

import com.avania.expensetrackerapi.Domain.Transaction;
import com.avania.expensetrackerapi.Exceptions.EtBadRequestException;
import com.avania.expensetrackerapi.Exceptions.EtResourceNotFoundException;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

public interface TransactionService {
    List<Transaction> fetchAllTransaction(Integer userId,Integer categoryId);
    Transaction fetchTransactionById(Integer userId,Integer categoryId,Integer transactionId) throws EtResourceNotFoundException;
    Transaction addTransaction(Integer userId,Integer categoryId,Double amount,String note,Long transactionDate)throws EtBadRequestException;
    void updateTransaction(Integer userId,Integer CategoryId,Integer transactionalId,Transaction transaction) throws  EtBadRequestException;
    void removeTransaction(Integer userId,Integer categoryId,Integer TransactionId) throws EtBadRequestException;
}
