package com.eil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
@Builder
public class Contract {
    @Id
    private String idContrat;

    private String idCompteClient;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSignature;
}
