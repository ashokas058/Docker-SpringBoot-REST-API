package com.restapi.com.Bpay.repository;

import com.restapi.com.Bpay.model.MdlBpayUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRepoBpayuser extends JpaRepository<MdlBpayUser, Integer> {
}
