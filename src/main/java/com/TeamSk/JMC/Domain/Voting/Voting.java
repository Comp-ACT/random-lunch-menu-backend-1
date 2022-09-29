package com.TeamSk.JMC.Domain.Voting;

import com.TeamSk.JMC.Domain.Restaurant.Restaurant;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Voting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VOTING_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "RESTAURANT_ID")
    private Restaurant restaurant;

    private Long userId;

    private boolean agreeFlag;
}
