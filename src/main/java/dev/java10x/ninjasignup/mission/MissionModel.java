package dev.java10x.ninjasignup.mission;

import dev.java10x.ninjasignup.ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String rank;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;
}
