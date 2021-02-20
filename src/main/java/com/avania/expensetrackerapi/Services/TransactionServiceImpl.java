package com.avania.expensetrackerapi.Services;

import com.avania.expensetrackerapi.Domain.Transaction;
import com.avania.expensetrackerapi.Exceptions.EtBadRequestException;
import com.avania.expensetrackerapi.Exceptions.EtResourceNotFoundException;
import com.avania.expensetrackerapi.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public List<Transaction> fetchAllTransaction(Integer userId, Integer categoryId) {
        return transactionRepository.findAll(userId,categoryId);
    }

    @Override
    public Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
        return transactionRepository.findById(userId, categoryId, transactionId);
    }

    @Override
    public Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException {
        int transactionId= transactionRepository.create(userId,categoryId,amount,note,transactionDate);
        return transactionRepository.findById(userId,categoryId,transactionId);
    }

    @Override
    public void updateTransaction(Integer userId, Integer CategoryId, Integer transactionalId, Transaction transaction) throws EtBadRequestException {
        transactionRepository.update(userId, CategoryId, transactionalId, transaction);

    }

    @Override
    public void removeTransaction(Integer userId, Integer categoryId, Integer TransactionId) throws EtBadRequestException {
        transactionRepository.removeById(userId, categoryId, TransactionId);

    }
}
