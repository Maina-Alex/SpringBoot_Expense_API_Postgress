package com.avania.expensetrackerapi.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    private Integer transactionId;
    private Integer categoryId;
    private Integer userId;
    private Double amount;
    private String note;
    private Long transactionDate;


}
