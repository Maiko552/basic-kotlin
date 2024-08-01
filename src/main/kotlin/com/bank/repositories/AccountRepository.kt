package com.bank.repositories

import com.bank.domain.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository:JpaRepository<Account, Long> {
}