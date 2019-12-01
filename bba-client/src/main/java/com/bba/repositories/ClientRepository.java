package com.bba.repositories;

import com.bba.client.service.ClientEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {

    List<ClientEntity> findAllByAccountId(Integer accountId);

    Optional<ClientEntity> findByIdAndAccountId(Integer clientId, Integer accountId);
}
